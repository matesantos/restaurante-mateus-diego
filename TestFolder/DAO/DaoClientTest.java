package DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import entitys.Client;

public class DaoClientTest {

		
	
	@Test
	 public void testSaveClient() throws Exception {
	        System.out.println("saveClient");
	        Client client = null;
	        DaoClient instance = new DaoClient();
	        boolean expResult = false;
	        boolean result = instance.saveClient(client);
	        assertEquals(expResult, result);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	    
	    @Test
	    public void testListClient() {
	        System.out.println("listClient");
	        DaoClient instance = new DaoClient();
	        instance.listClient();
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	   
	    @Test
	    public void testUpdate() throws Exception {
	        System.out.println("update");
	        Client client = null;
	        DaoClient instance = new DaoClient();
	        instance.update(client);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

	   
	    @Test
	    public void testRemoveClient() {
	        System.out.println("removeClient");
	        Client client = null;
	        DaoClient instance = new DaoClient();
	        instance.removeClient(client);
	        // TODO review the generated test code and remove the default call to fail.
	        fail("The test case is a prototype.");
	    }

}
