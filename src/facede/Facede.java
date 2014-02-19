package facede;

import javax.swing.JOptionPane;

import entitys.Gerente;
import exceptions.CPFException;
import DAO.*;

public class Facede {
	
	private DaoGerente daoGerente = null;
	private DaoClient daoCliente = null;
	private DaoFuncionario daoFuncionario = null;
	private DaoProduct daoProduto = null;
	
	//m�todos de login 
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
		if(login.equalsIgnoreCase("00000") && senha.equalsIgnoreCase("00000"))
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
	
	
	//m�todos do modelo Funcion�rio
	public void cadastrarFuncionario(){

	}
	
	//m�todos do modelo cliente
	public void cadastrarCliente(){
		
	}
	
	//m�todos do modelo Produto
	public void cadastrarProduto(){
		
	}
	
	//m�todos do modelo Gerente
	public void cadastrarGerente(String nomeCompleto, String cpf, String login,String senha) throws CPFException{
		daoGerente = new DaoGerente();
		Gerente gerente = new Gerente(nomeCompleto, cpf, login, senha); 
		if(daoGerente.saveGerente(gerente)){
			JOptionPane.showMessageDialog(null, "Gerente cadastrado com sucesso");
		}
	}

}
