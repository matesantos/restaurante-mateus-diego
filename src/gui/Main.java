package gui;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import logic.UserEmployee;
import exceptions.CPFException;
import exceptions.IDException;
import facede.Facede;
import facede.SingletonFacede;

public class Main {

	private Facede facede;

	public Main() {
		facede = SingletonFacede.getInstance();
		fazerLogin();
	}

	private void fazerLogin() {
		boolean close = false;
		try {
			int i;
			int opcao = new Integer(JOptionPane.showInputDialog("Escolhe a opção: 1-Fazer login como Gerente 2-Fazer login como Funcionário"));
			String login = JOptionPane.showInputDialog("Digite o login:");
			JPasswordField senha = new JPasswordField();
			
			if (JOptionPane.showConfirmDialog (null, senha, "Digite a senha: ", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
				while (!close) {
	
					switch (opcao) {
					case 1:
						if (facede.fazerLoginGerente(login, new String(senha.getPassword()))) {
							MenuPrincipal();
						} else {
							i = JOptionPane.showConfirmDialog(null,"Deseja terminar o programa?", "Saída",JOptionPane.YES_NO_OPTION);
							if (i == JOptionPane.YES_OPTION) 
								close = true;
						}
						break;

					case 2:
						if (facede.fazerLoginFuncionario(login, new String(senha.getPassword()))){
							MenuPrincipal();	
						} else {
							i = JOptionPane.showConfirmDialog(null,"Deseja terminar o programa?", "Saída",JOptionPane.YES_NO_OPTION);
							if (i == JOptionPane.YES_OPTION) 
								close = true;
						}
						break;
	
					default:
						JOptionPane.showMessageDialog(null, "Opção inválida","ERROR",JOptionPane.ERROR_MESSAGE);
						i = JOptionPane.showConfirmDialog(null,"Deseja terminar o programa?", "Saída",JOptionPane.YES_NO_OPTION);
						if (i == JOptionPane.YES_OPTION) 
							close = true;
						else
							fazerLogin();
						break;
					}
				}
				
				finalizarPrograma();
				
			}
		} catch (NumberFormatException num) {
			JOptionPane.showMessageDialog(null, "Opção inválida","ERROR",JOptionPane.ERROR_MESSAGE);
			int i = JOptionPane.showConfirmDialog(null,"Deseja terminar o programa?", "Saída",JOptionPane.YES_NO_OPTION);
			if (i == JOptionPane.YES_OPTION) 
				finalizarPrograma();
			fazerLogin();
		}
	}
	
	private void finalizarPrograma(){
		JOptionPane.showMessageDialog(null, "Até mais");
		System.exit(0);
	}

	private void MenuPrincipal() {

		while (true) {
			int opcao = new Integer(JOptionPane.showInputDialog("Escolhe a opção:\n1-Gerenciar Gerente\n2-Gerenciar Funcionário\n3-Gerenciar Cliente"
					+ "											\n4-Sair"));

			switch (opcao) {
			case 1:
				gerenciarGerente();
			break;

			case 2:
			break;

			case 3:
			break;
			
			case 4:
				sair();
			break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				MenuPrincipal();	
			}

		}

	}

	private void adicionarCliente() {
	}

	//métodos dos gerentes	
	private void gerenciarGerente(){
		while (true) {

			int opcao = new Integer(JOptionPane.showInputDialog("Escolhe a opção:\n1-Adicionar Gerente\n2-Listar Gerente\n3-Atuliazar Dados\n4-Deletar Gerente\n5-Voltar"));

			switch (opcao) {
			case 1:
				salvarComoGerente();
			break;

			case 2:
				listGerente();
			break;
			
			case 3:
				atualizarGerente();
			break;

			case 4:
				removeGerente();
			break;
			
			case 5:
				MenuPrincipal();
			break;

			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				gerenciarGerente();

			}
		}
	}
	
	private void salvarComoGerente(){
		
		int opcao = new Integer(JOptionPane.showInputDialog("Escolhe a opção:\n1-Salvar na memória\n2-Salvar em arquivo\n"));

		switch (opcao) {
			case 1:
				adicionarGerente(opcao);
			break;
	
			case 2:
				adicionarGerente(opcao);
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
				salvarComoGerente();
		}
		
	}

	private void adicionarGerente(int opcao) {
		String nome = JOptionPane.showInputDialog("Digite o nome completo:");
		String cpf = JOptionPane.showInputDialog("Digite o CPF:");
		String login = JOptionPane.showInputDialog("Digite o Login:");
		String senha = JOptionPane.showInputDialog("Digite a Senha:");

		try {
			
			if(opcao == 1)
				facede.cadastrarGerente(nome, cpf, login, senha);
			else
				facede.cadastrarGerenteArquivo(nome, cpf, login, senha);
		} catch (CPFException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		int i = JOptionPane.showConfirmDialog(null,
				"Deseja terminar o cadastro?", "Saída",
				JOptionPane.YES_NO_OPTION);

		if (i == JOptionPane.YES_OPTION) {
			return;
		}
	}
	

	
	private void listGerente(){
		facede.listGerente();
	}
	
	private void atualizarGerente(){
		String cpf = JOptionPane.showInputDialog("Digite o CPF do gerente:");
		String login = JOptionPane.showInputDialog("Digite o novo login:");
		String senha = JOptionPane.showInputDialog("Digite a nova senha:");
		try {
			facede.atualizarGerente(cpf,login,senha);
		} catch (CPFException e) {
			e.printStackTrace();
		}
	}
	
	private void removeGerente(){
		String cpf = JOptionPane.showInputDialog("Digite o CPF do gerente:");
		facede.deletarGerente(cpf);
	}

	//métodos do funcionário
	
	private void adicionarFuncionario() {
		String nomeFucionario = JOptionPane.showInputDialog("Digite o nome completo:");
		String cpfFucionario = JOptionPane.showInputDialog("Digite o CPF:");
		String loginFucionario = JOptionPane.showInputDialog("Digite o Login:");
		String senhaFucionario = JOptionPane.showInputDialog("Digite a Senha:");
		long idFucionario = new Long(
				JOptionPane.showInputDialog("Digite o ID:"));

		try {
			UserEmployee.addEmployee(idFucionario, nomeFucionario,cpfFucionario, loginFucionario, senhaFucionario);
		} catch (CPFException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		} catch (IDException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

		int iFucionario = JOptionPane.showConfirmDialog(null,
				"Deseja terminar o cadastro?", "Saída",
				JOptionPane.YES_NO_OPTION);

		if (iFucionario == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
	
	
	
	//métodos 

	//sair do programa
	private void sair(){
		int op = JOptionPane.showConfirmDialog(null,
				"Deseja terminar o cadastro?", "Saída",
				JOptionPane.YES_NO_OPTION);

		if (op == JOptionPane.YES_OPTION) 
			finalizarPrograma();
		
		return;
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
