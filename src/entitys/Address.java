/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entitys;

/**
 *
 * @author Mateus
 */
public class Address {
    
    private String street;
    private String number;
    private String zip;
    private String city;
    private String state;

    public Address(){
        this("","","","","");
    }
    
     public Address(String street, String number, String zip, String city, String state) {
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Endereço\n " + "Rua: " + street + "\nNÃºmero:" + number + "\n CEP:" + zip + "\nCidade=" + city 
                + "\nEstado: " + state ;
    }
    
        
}
