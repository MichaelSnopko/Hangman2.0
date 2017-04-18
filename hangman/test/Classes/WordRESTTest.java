/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.json.JsonObject;
import javax.ws.rs.core.Response;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0636081
 */
public class WordRESTTest {
    
    public WordRESTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAll method, of class WordREST.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        WordREST instance = new WordREST();
        Response expResult = null;
        Response result = instance.getAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class WordREST.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        WordREST instance = new WordREST();
        Response expResult = null;
        Response result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class WordREST.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        JsonObject json = null;
        WordREST instance = new WordREST();
        Response expResult = null;
        Response result = instance.add(json);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class WordREST.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        int id = 0;
        WordREST instance = new WordREST();
        Response expResult = null;
        Response result = instance.set(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
