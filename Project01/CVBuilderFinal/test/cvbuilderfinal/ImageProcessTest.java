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
