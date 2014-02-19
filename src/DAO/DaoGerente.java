package DAO;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import entitys.Gerente;
import exceptions.CPFException;

public class DaoGerente {
	
	static ArrayList<Gerente> gerenteList =  new ArrayList<Gerente>();
	
	public boolean saveGerente(Gerente gerente) throws CPFException{

		Iterator<Gerente> it = gerenteList.iterator();
		while(it.hasNext()){
			if(it.next().getCpf().equalsIgnoreCase(gerente.getCpf())){
				throw new CPFException();
			}
		}
		gerenteList.add(gerente);
		return true;
	}
	
	public void listGerentes(){
		Iterator<Gerente> it = gerenteList.iterator();
		while(it.hasNext()){
			JOptionPane.showMessageDialog(null, it.next().toString());
		}
	}
	
	public Gerente doLogin(String login, String senha){
		Gerente ger = null;
		Iterator<Gerente> it = gerenteList.iterator();
		
		while(it.hasNext()){
			if(it.next().getLogin().equalsIgnoreCase(login) && it.next().getSenha().equalsIgnoreCase(senha)){
				ger = it.next();
			}
		}
		return ger;
	}

}
