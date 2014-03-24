package facede;

import javax.swing.JOptionPane;

import logic.FactoryEntity;
import DAO.DaoClient;
import DAO.DaoFuncionario;
import DAO.DaoGerente;
import DAO.DaoGerenteArquivo;
import DAO.DaoProduct;
import DAO.InterfaceDAOGerente;
import entitys.Gerente;
import exceptions.CPFException;

public class Facede {
	
	InterfaceDAOGerente dao;
	
	private DaoGerente daoGerente = null;
	private DaoClient daoCliente = null;
	private DaoFuncionario daoFuncionario = null;
	private DaoProduct daoProduto = null;
	private FactoryEntity factory = new FactoryEntity();
	
	//métodos de login 
	public boolean fazerLoginGerente(String login, String senha){
		
		if(superAdimin(login, senha)){
			return true;
		}else{
			daoGerente = new DaoGerente();
			if(daoGerente.doLogin(login, senha) != null){
				return true;
			}
		}
		return false;
	}
	
	private boolean superAdimin(String login, String senha){
		if(login.equalsIgnoreCase("0") && senha.equalsIgnoreCase("0"))
			return true;
		
		return false;
	}
	
	public boolean fazerLoginFuncionario(String login, String senha){
		daoFuncionario = new DaoFuncionario();
		if(daoFuncionario.doLogin(login, senha) != null){
			return true;
		}
		return false;
	}
	
	
	//métodos do modelo Funcionário
	public void cadastrarFuncionario(){

	}
	
	//métodos do modelo cliente
	public void cadastrarCliente(){
		
	}
	
	//métodos do modelo Produto
	public void cadastrarProduto(){
		
	}
	
	//métodos do modelo Gerente
	public void cadastrarGerente(String nomeCompleto, String cpf, String login,String senha) throws CPFException{
		daoGerente = new DaoGerente();
		Gerente gerente = factory.getGerente(nomeCompleto, cpf, login, senha); 
		if(daoGerente.save(gerente)){
			JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso");
		}
	}
	
	public void cadastrarGerenteArquivo(String nomeCompleto, String cpf, String login,String senha) throws CPFException{
		dao = new DaoGerenteArquivo();
		Gerente gerente = factory.getGerente(nomeCompleto, cpf, login, senha);
		if(dao.save(gerente)){
			JOptionPane.showMessageDialog(null, "Gerente salvo com sucesso!");
		}

	}
	
	public void atualizarGerente(String cpf, String login, String senha) throws CPFException{
		daoGerente = new DaoGerente();
		Gerente gerente = daoGerente.fetchGerente(cpf);
		
		if(gerente != null){
			
			daoGerente.removeGerente(gerente);
			gerente.setLogin(login);
			gerente.setSenha(senha);
			daoGerente.update(gerente);
			JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
		}
	}
	
	public void listGerente(){
		daoGerente = new DaoGerente();
		daoGerente.listGerentes();
	}
	
	public void deletarGerente(String cpf) {
		daoGerente = new DaoGerente();
		Gerente gerente = daoGerente.fetchGerente(cpf);
		if(gerente != null){
			int op = JOptionPane.showConfirmDialog(null,
					"Tem certeza que remove-lo do sistema?", "Saída",
					JOptionPane.YES_NO_OPTION);

			if (op == JOptionPane.YES_OPTION){
				daoGerente.removeGerente(gerente);
				JOptionPane.showMessageDialog(null, "Gerente removido com sucesso");
			}
		}
	}
	
}
