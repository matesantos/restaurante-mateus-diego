/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import entitys.Client;
import exceptions.IDException;


public class DaoClient {
    
	static ArrayList<Client> clientList =  new ArrayList<Client>();
	Iterator<Client> it = clientList.iterator();
    
	
	 public boolean saveClient(Client client) throws IDException{

			it = clientList.iterator();
			/*while(it.hasNext()){
				if(it.next().getClientId().equalsIgnoreCase(client.getClientId())){
					throw new IDException(null);
				}
			}*/
			clientList.add(client);
			return true;
		}
	    
	    public void listClient(){
			if(clientList.isEmpty()){
				JOptionPane.showMessageDialog(null, "Não existe cliente cadastrado no sistema");
				return;
			}
			it = clientList.iterator();
			while(it.hasNext()){
				JOptionPane.showMessageDialog(null, it.next().toString());
			}
		}
	    
	    public void update(Client client) throws IDException{
	    	saveClient(client);
		}
	    
	    public void removeClient(Client client){
	    	clientList.remove(client);
		}
	    
    
}
