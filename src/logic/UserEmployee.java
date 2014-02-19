package logic;

import java.util.ArrayList;
import java.util.Date;

import entitys.Funcionario;
import exceptions.CPFException;
import exceptions.IDException;

public class UserEmployee  {
	
static ArrayList<Funcionario> funcionarios =  new ArrayList<Funcionario>();
	
	public boolean addEmployee(long id,String nomeCompleto, Date dataNascimento, String cpf,
			String endereco, String telefone, String cargo, double salario,
			Date admissao, String login, String senha){
		
		Funcionario func = new Funcionario(id,nomeCompleto,dataNascimento,cpf,endereco,telefone,cargo,salario,admissao,login,senha);
		
		funcionarios.add(func );
		
		return true;
	}
	
	public static boolean addEmployee(long id,String nomeCompleto, String cpf,String login, String senha) throws CPFException, IDException{
		
		Funcionario func = new Funcionario(id,nomeCompleto,cpf,login,senha);
		
		for(Funcionario funcionario: funcionarios){
			
			if(funcionario.getCpf().equalsIgnoreCase(cpf)){
				throw new CPFException();
			}
			
			if(funcionario.getFuncionarioId() == id){
				throw new IDException("funcionário");
			}
			
		}
		
		funcionarios.add(func);
		return true;
	}
	
}
