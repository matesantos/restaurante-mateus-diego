/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.Iterator;

import entitys.*;

/**
 *
 * @author Mateus
 */
public class DaoFuncionario {
	
	static ArrayList<Funcionario> funcionarioList =  new ArrayList<Funcionario>();	
    
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
    
    public void cadastrarFuncionario(Funcionario funcionario){
    	
    }
    
    public void listFuncionario(){
    	
    }
    
    public void atualizarFuncionario(){
    	
    }
    
    public void deletarFuncionario(){
    	
    }
    
}
