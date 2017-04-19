/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.List;
import javax.json.JsonArray;
import javax.json.JsonObject;
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
public class wordControllerTest {
    
    public wordControllerTest() {
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
     * Test of getAll method, of class wordController.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        wordController instance = new wordController();
        List<Word> expResult = null;
        List<Word> result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAllJson method, of class wordController.
     */
    @Test
    public void testGetAllJson() {
        System.out.println("getAllJson");
        wordController instance = new wordController();
        JsonArray expResult = null;
        JsonArray result = instance.getAllJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getById method, of class wordController.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int id = 0;
        wordController instance = new wordController();
        Word expResult = null;
        Word result = instance.getById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getByIdJson method, of class wordController.
     */
    @Test
    public void testGetByIdJson() {
        System.out.println("getByIdJson");
        int id = 0;
        wordController instance = new wordController();
        JsonObject expResult = null;
        JsonObject result = instance.getByIdJson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getBySearchJson method, of class wordController.
     */
    @Test
    public void testGetBySearchJson() {
        System.out.println("getBySearchJson");
        wordController instance = new wordController();
        JsonArray expResult = null;
        JsonArray result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addJson method, of class wordController.
     */
    @Test
    public void testAddJson() {
        System.out.println("addJson");
        JsonObject json = null;
        wordController instance = new wordController();
        JsonObject expResult = null;
        JsonObject result = null;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of editJson method, of class wordController.
     */
   
    
}
