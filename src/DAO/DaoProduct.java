/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

import entitys.Product;



public class DaoProduct {
	
	static ArrayList<Product> productList =  new ArrayList<Product>();
	Iterator<Product> it = productList.iterator();
	
	
	 public boolean saveProduct(Product product){

			it = productList.iterator();
			productList.add(product);
			return true;
		}
	 
	 public void listProduct(){
			if(productList.isEmpty()){
				JOptionPane.showMessageDialog(null, "Não existe Produtos cadastrados no sistema");
				return;
			}
			it = productList.iterator();
			while(it.hasNext()){
				JOptionPane.showMessageDialog(null, it.next().toString());
			}
		}
	 
	 public void update(Product product){
	    	saveProduct(product);
		}
	    
	    public void removeFuncionario(Product product){
	    	productList.remove(product);
		}
    
}
