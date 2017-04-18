/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
public class WordTest {
    
    public WordTest() {
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
     * Test of setWordId method, of class Word.
     */
    @Test
    public void testSetWordId() {
        System.out.println("setWordId");
        int wordId = 0;
        Word instance = new Word();
        instance.setWordId(wordId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Word.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Word instance = new Word();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Word.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Word instance = new Word();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategory method, of class Word.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        Word instance = new Word();
        instance.setCategory(category);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWordId method, of class Word.
     */
    @Test
    public void testGetWordId() {
        System.out.println("getWordId");
        Word instance = new Word();
        int expResult = 0;
        int result = instance.getWordId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Word.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Word instance = new Word();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Word.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Word instance = new Word();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class Word.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Word instance = new Word();
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toJson method, of class Word.
     */
    @Test
    public void testToJson() {
        System.out.println("toJson");
        Word instance = new Word();
        JsonObject expResult = null;
        JsonObject result = instance.toJson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
