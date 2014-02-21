package DAO;

import static org.junit.Assert.*;

import org.junit.Test;

import entitys.Funcionario;

public class DaoFuncionarioTest {

	
	
	@Test
    public void testDoLogin() {
        System.out.println("doLogin");
        String login = "";
        String senha = "";
        DaoFuncionario instance = new DaoFuncionario();
        Funcionario expResult = null;
        Funcionario result = instance.doLogin(login, senha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSaveFuncionario() throws Exception {
        System.out.println("saveFuncionario");
        Funcionario funcionario = null;
        DaoFuncionario instance = new DaoFuncionario();
        boolean expResult = false;
        boolean result = instance.saveFuncionario(funcionario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testListFuncionario() {
        System.out.println("listFuncionario");
        DaoFuncionario instance = new DaoFuncionario();
        instance.listFuncionario();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        Funcionario funcionario = null;
        DaoFuncionario instance = new DaoFuncionario();
        instance.update(funcionario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testRemoveFuncionario() {
        System.out.println("removeFuncionario");
        Funcionario func = null;
        DaoFuncionario instance = new DaoFuncionario();
        instance.removeFuncionario(func);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testFetchFuncionario() {
        System.out.println("fetchFuncionario");
        String cpf = "";
        DaoFuncionario instance = new DaoFuncionario();
        Funcionario expResult = null;
        Funcionario result = instance.fetchFuncionario(cpf);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
