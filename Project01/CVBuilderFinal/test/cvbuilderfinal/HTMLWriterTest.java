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
public class HTMLWriterTest {
    HTMLWriter instance;
    public HTMLWriterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    instance=new HTMLWriter();
    }
    
    @After
    public void tearDown() {
    instance=null;
    }

    /**
     * Test of writeHTML method, of class HTMLWriter.
     */
    @Test
    public void testWriteHTML() throws Exception {
        ImageProcess a =new ImageProcess();
       // MotherFrame b=new MotherFrame();
        Variables d=new Variables();
        System.out.println("writeHTML");
        String imgExtension = d.imgExtension;
        String imgString =d.imgString;
        String name = "nur";
        String address = "Bahsundhara";
        String father = "Nur Nobi";
        String mother = "Semona Khatun";
        String bloodg = "B+";
        String religion = "Islam";
        String nationality = "Bangladeshi";
        String phone = "01818950047";
        String email = "nhbsohel@gmail.com";
        String experience = "none";
        String education = "none";
        String skills = "none";
        String achievement = "none";
        //HTMLWriter instance = new HTMLWriter();
        String expResult = "HTML Export Successful!!";
        String result = instance.writeHTML(imgExtension, imgString, name, address, father, mother, bloodg, religion, nationality, phone, email, experience, education, skills, achievement);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
