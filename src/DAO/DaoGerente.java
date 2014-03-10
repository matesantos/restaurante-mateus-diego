package DAO;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import entitys.Gerente;
import exceptions.CPFException;

public class DaoGerente implements InterfaceDAOGerente {
	
	static ArrayList<Gerente> gerenteList =  new ArrayList<Gerente>();
	Iterator<Gerente> it = gerenteList.iterator();
	
	public void listGerentes(){
		if(gerenteList.isEmpty()){
			JOptionPane.showMessageDialog(null, "Não existe gerente cadastrado no sistema");
			return;
		}
		it = gerenteList.iterator();
		while(it.hasNext()){
			JOptionPane.showMessageDialog(null, it.next().toString());
		}
	}
	
	public void update(Gerente gerente){
		try {
			save(gerente);
		} catch (CPFException e) {
			e.printStackTrace();
		}
	}
	
	public Gerente doLogin(String login, String senha){
		Gerente ger = null;
		it = gerenteList.iterator();
		
		while(it.hasNext()){
			if(it.next().getLogin().equalsIgnoreCase(login) && it.next().getSenha().equalsIgnoreCase(senha)){
				ger = (Gerente)it.next();
			}
		}
		return ger;
	}
	
	public void removeGerente(Gerente ger){
		gerenteList.remove(ger);
	}
	
	public Gerente fetchGerente(String cpf){
		it = gerenteList.iterator();
		Gerente ger = null;
		while(it.hasNext()){
			ger = it.next();
			if(ger.getCpf().equalsIgnoreCase(cpf)){
				return ger;
			}
		}
		return ger;
	}

	@Override
	public boolean save(Gerente gerente) throws CPFException{
		it = gerenteList.iterator();
		while(it.hasNext()){
			if(it.next().getCpf().equalsIgnoreCase(gerente.getCpf())){
				throw new CPFException();
			}
		}
		gerenteList.add(gerente);
		return true;		
	}

	@Override
	public boolean read(Gerente gerente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Gerente gerente) {
		// TODO Auto-generated method stub
		return false;
	}

}
