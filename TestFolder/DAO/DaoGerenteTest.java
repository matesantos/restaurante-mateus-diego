package DAO;

import static org.junit.Assert.*;
import entitys.Gerente;

import org.junit.Test;

public class DaoGerenteTest {

		
	
    @Test
    public void testSaveGerente() throws Exception {
        System.out.println("saveGerente");
        Gerente gerente = null;
        DaoGerente instance = new DaoGerente();
        boolean expResult = false;
        boolean result = instance.saveGerente(gerente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    @Test
    public void testListGerentes() {
        System.out.println("listGerentes");
        DaoGerente instance = new DaoGerente();
        instance.listGerentes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Gerente gerente = null;
        DaoGerente instance = new DaoGerente();
        instance.update(gerente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testDoLogin() {
        System.out.println("doLogin");
        String login = "";
        String senha = "";
        DaoGerente instance = new DaoGerente();
        Gerente expResult = null;
        Gerente result = instance.doLogin(login, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testRemoveGerente() {
        System.out.println("removeGerente");
        Gerente ger = null;
        DaoGerente instance = new DaoGerente();
        instance.removeGerente(ger);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testFetchGerente() {
        System.out.println("fetchGerente");
        String cpf = "";
        DaoGerente instance = new DaoGerente();
        Gerente expResult = null;
        Gerente result = instance.fetchGerente(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
