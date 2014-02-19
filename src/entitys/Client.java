package entitys;

import java.util.Date;

public class Client extends User {
	
	private long clientId;
	
	static long id = 0;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomeCompleto, Date dataNascimento, String cpf,
			String endereco, String telefone, String cargo, double salario,
			Date admissao, String login, String senha) {
			
			super(nomeCompleto, dataNascimento, cpf, endereco, telefone, cargo,
				salario, admissao, login, senha);
			this.clientId = id++;
			
	}

	public Client(String nomeCompleto, String cpf, String login, String senha) {
		super(nomeCompleto, cpf, login, senha);
		// TODO Auto-generated constructor stub
		clientId = id++;
	}

	public long getClientId() {
		return clientId;
	}


}
