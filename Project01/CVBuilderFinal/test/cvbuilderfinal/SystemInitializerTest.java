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
public class SystemInitializerTest {
    SystemInitializer instance;
    
    public SystemInitializerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance=new SystemInitializer();
    }
    
    @After
    public void tearDown() {
        instance=null;
    }

    /**
     * Test of initSystem method, of class SystemInitializer.
     */
    @Test
    public void testInitSystem() throws Exception {
        System.out.println("initSystem");
        //SystemInitializer instance = new SystemInitializer();
        String r1= instance.initSystem();
        String r2=instance.setDefaultHTML();
        String e1="Initiate Successfully";
        String e2="template generated success";
        assertEquals(e1, r1);
        assertEquals(e2, r2);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
