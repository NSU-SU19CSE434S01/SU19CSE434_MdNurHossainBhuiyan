/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvbuilderfinal;

import java.awt.image.BufferedImage;
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
public class ImageProcessTest {
    
    public ImageProcessTest() {
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
     * Test of toImageString method, of class ImageProcess.
     * 
     * 
     * Input Space partitioning
     * 
     * Characteristic:
     * c1: Image to string successful
     * block: b1: true /base
     *         b2:false
     * c2:Image to string failed
     *   block d1: true /base
     *         d2:false  
     * 
     * 
     * base choice: {b1,d1} ,{b1,d2},{b2,d1}
     * 
     * 
     * 
     */
    @Test
    public void testToImageString() throws Exception {
        System.out.println("toImageString");
        String path = "";
        ImageProcess instance = new ImageProcess();
        String expResult = "";
        String result = instance.toImageString(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toBufferedImage method, of class ImageProcess.
     * 
     * Input space partitioning
     * 
     * Characteristic:
     * c1: String to image successful
     * Block: b1: true /base
     *         b2:false
     * 
     * c2: String to image failed
     *    block: d1:true /base
     *           d2:false
     * 
     * base choice: {b1,d1},{b1,d2},{b2,d2}
     *
     * 
     * 
     */
    @Test
    public void testToBufferedImage() throws Exception {
        System.out.println("toBufferedImage");
        ImageProcess instance = new ImageProcess();
        BufferedImage expResult = null;
        BufferedImage result = instance.toBufferedImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
