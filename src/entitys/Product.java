/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

/**
 *
 * @author Mateus
 */
public class Product {
    
    private String description;
    private double price;
    private int cod;
    private static int aux = 0;
    
    public Product(){
        this("",0.0);
    }

    public Product(String description, double price) {
        this.description = description;
        this.price = price;
        this.cod = aux++;
    }

    public int getCod() {
        return cod;
    }

        
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
                      
}
