package entitys;

import java.util.Date;

public class Gerente extends User{

	private long gerenteId;
	
	private static long id = 0;
	
	public Gerente(String nomeCompleto, Date dataNascimento, String cpf,String endereco, String telefone, String cargo, double salario,
			Date admissao, String login, String senha){
		super(nomeCompleto,dataNascimento, cpf, endereco, telefone,cargo, salario,admissao,login,senha);
		this.gerenteId = id++;
	}

	public Gerente(String nomeCompleto, String cpf, String login,String senha) {
		super(nomeCompleto, cpf, login,senha);
		this.gerenteId = id++;
	}

	public long getGerenteId() {
		return gerenteId;
	}

	public void setGerenteId(long gerenteId) {
		this.gerenteId = gerenteId;
	}

	@Override
	public String toString() {
		return "Id= " + gerenteId + super.toString() ;
	}
	
}
