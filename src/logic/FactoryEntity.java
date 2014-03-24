package logic;

import entitys.*;

public class FactoryEntity {

	
	public Gerente getGerente(String nomeCompleto, String cpf, String login,String senha){ 
		
		return new Gerente(nomeCompleto, cpf, login, senha);
	}
	
	public Funcionario getFuncionario(long funcionarioId, String nomeCompleto, String cpf, String login,String senha){ 
		
		return new Funcionario(funcionarioId, nomeCompleto, cpf, login, senha);
	}
		
		
	public Client getClient(String nomeCompleto, String cpf, String login, String senha){ 
			
		return new Client(nomeCompleto, cpf, login, senha);
	}
	
	public Product getProduto(){
		return new Product();
	}
}
