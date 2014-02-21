package DAO;

import static org.junit.Assert.*;
import entitys.Product;

import org.junit.Test;

public class DaoProductTest {

	
    @Test
    public void testSaveProduct() {
        System.out.println("saveProduct");
        Product product = null;
        DaoProduct instance = new DaoProduct();
        boolean expResult = false;
        boolean result = instance.saveProduct(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testListProduct() {
        System.out.println("listProduct");
        DaoProduct instance = new DaoProduct();
        instance.listProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testUpdate() {
        System.out.println("update");
        Product product = null;
        DaoProduct instance = new DaoProduct();
        instance.update(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testRemoveFuncionario() {
        System.out.println("removeFuncionario");
        Product product = null;
        DaoProduct instance = new DaoProduct();
        instance.removeFuncionario(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
