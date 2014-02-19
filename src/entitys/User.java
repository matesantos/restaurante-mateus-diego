package entitys;

import java.util.Date;

public abstract class User {
	
	private String nomeCompleto;
	private Date dataNascimento;
	private String cpf;
	private String endereco;
	private String telefone;
	private String cargo;
	private double salario;
	private Date admissao;
	private String login;
	private String senha;
	
	public User(){
		
	}

	public User(String nomeCompleto, Date dataNascimento, String cpf,
			String endereco, String telefone, String cargo, double salario,
			Date admissao, String login, String senha) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cargo = cargo;
		this.salario = salario;
		this.admissao = admissao;
		this.login = login;
		this.senha = senha;
	}

	public User(String nomeCompleto, String cpf, String login, String senha) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;

	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getAdmissao() {
		return admissao;
	}

	public void setAdmissao(Date admissao) {
		this.admissao = admissao;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Dados [Nome=" + nomeCompleto + ", dataNascimento="
				+ dataNascimento + ", cpf=" + cpf + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", cargo=" + cargo + ", salario="
				+ salario + ", admissao=" + admissao + ", login=" + login
				+ ", senha=" + senha + "]";
	}
	
}
