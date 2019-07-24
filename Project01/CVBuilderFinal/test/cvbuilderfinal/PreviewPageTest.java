/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvbuilderfinal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NHBSOHEL
 */
public class PreviewPageTest {
    
    public PreviewPageTest() {
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
     * Test of mySitePreview method, of class PreviewPage.
     * Input space partitioning
     * 
     * Characteristics:
     * c1: preview successful
     * Blocks:
     *  b1: True /base
     *  b2:False
     * 
     * 
     * c2:preview failed
     * Blocks:
     * d1:True
     * d2:False  /base
     * 
     * Base choice partitioning
     * {b2,d2} or {b2,d1} or {b1,d2}
     * 
     * 
     * 
     */
    @Test
    public void testMySitePreview() {
        System.out.println("mySitePreview");
        PreviewPage.mySitePreview();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
