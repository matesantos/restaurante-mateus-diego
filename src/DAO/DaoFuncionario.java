/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import entitys.*;
import exceptions.CPFException;

public class DaoFuncionario {
	
	public static ArrayList<Funcionario> getFuncionarioList() {
		return funcionarioList;
	}

	public static void setFuncionarioList(ArrayList<Funcionario> funcionarioList) {
		DaoFuncionario.funcionarioList = funcionarioList;
	}

	static ArrayList<Funcionario> funcionarioList =  new ArrayList<Funcionario>();
	Iterator<Funcionario> it = funcionarioList.iterator();
    
    public Funcionario doLogin(String login, String senha){
    	Funcionario func = null;
		Iterator<Funcionario> it = funcionarioList.iterator();
		
		while(it.hasNext()){
			if(it.next().getLogin().equalsIgnoreCase(login) && it.next().getSenha().equalsIgnoreCase(senha)){
				func = it.next();
			}
		}
		return func;
    }
    
    public boolean saveFuncionario(Funcionario funcionario) throws CPFException{

		it = funcionarioList.iterator();
		while(it.hasNext()){
			if(it.next().getCpf().equalsIgnoreCase(funcionario.getCpf())){
				throw new CPFException();
			}
		}
		funcionarioList.add(funcionario);
		return true;
	}
    
    public void listFuncionario(){
		if(funcionarioList.isEmpty()){
			JOptionPane.showMessageDialog(null, "Não existe funcionário cadastrado no sistema");
			return;
		}
		it = funcionarioList.iterator();
		while(it.hasNext()){
			JOptionPane.showMessageDialog(null, it.next().toString());
		}
	}
    
    public void update(Funcionario funcionario) throws CPFException{
    	saveFuncionario(funcionario);
	}
    
    public void removeFuncionario(Funcionario func){
    	funcionarioList.remove(func);
	}
    
    public Funcionario fetchFuncionario(String cpf){
		it = funcionarioList.iterator();
		Funcionario func = null;
		while(it.hasNext()){
			func = it.next();
			if(func.getCpf().equalsIgnoreCase(cpf)){
				return func;
			}
		}
		return func;
	}
    
}
