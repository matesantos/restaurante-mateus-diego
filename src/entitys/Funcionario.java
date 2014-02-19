package entitys;

import java.util.Date;

public class Funcionario extends User{

	private long funcionarioId;
	
	public Funcionario(long funcionarioId, String nomeCompleto, Date dataNascimento, String cpf,
			String endereco, String telefone, String cargo, double salario,
			Date admissao, String login, String senha){
		super(nomeCompleto,dataNascimento, cpf, endereco, telefone,cargo, salario,admissao,login,senha);
		
		this.funcionarioId = funcionarioId;
	}

	public Funcionario(long funcionarioId, String nomeCompleto, String cpf, String login,String senha) {
		super(nomeCompleto, cpf, login,senha);
		this.funcionarioId  = funcionarioId;
	}

	public long getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(long funcionarioId) {
		this.funcionarioId = funcionarioId;
	}
	
	
}
