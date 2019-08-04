/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvbuilderfinal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author NHBSOHEL
 */
public  class SystemInitializer {
    //This Class initializes system & creates files with default value ( if none )
    /**
     * @throws IOException
     */
    public  String initSystem() throws IOException {
  
        try {
            FileInputStream fstream;
            fstream = new FileInputStream("template.html");
            fstream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            setDefaultHTML();

        }
        return "Initiate Successfully";
    }
    public  String setDefaultHTML() {
        
        String htmlstr = "<html>\n" +
"\n" +
"<head>\n" +
"    <title> $title </title>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <div class=\"main\">\n" +
"        <div class=\"personal\">\n" +
"            <p style=\"float: right\" ><img style=\"height: 200px;width: 200px\" src=\"data:image/$type;base64,$imgStr\"></p><br>\n" +
"            <h1>$name</h1>\n" +
"            <h4>$address</h4>\n" +
"            <p>Cell:$phone</p>\n" +
"            <p>Email:$email</p>\n" +
"           \n" +
"        </div>\n" +
"        <hr>\n" +
"<h3>Education</h3>\n" +
"        <div class=\"edu\">\n" +
"            $educational\n" +
"\n" +
"        </div>\n" +
"        <hr>\n" +
"        <h3>Experiences</h3>\n" +
"        <div class=\"exp\">\n" +
"            $experience\n" +
"        </div>\n" +
"        <hr>\n" +
"        <h3>Skills</h3>\n" +
"        <div class=\"skill\">\n" +
"            $skills\n" +
"\n" +
"        </div>\n" +
"        <hr>\n" +
"        <h3>Achievements</h3>\n" +
"        <div class=\"achieve\">\n" +
"            $achievement\n" +
"\n" +
"        </div>\n" +
"        <hr>\n" +
"         <h3>Biography</h3>\n" +
"\n" +
"        <div class=\"bio\">\n" +
"             <p>Father's Name: $father</p>\n" +
"           <p>  Mothers's Name: $mother</p>\n" +
"             <p>Religion: $religion</p>\n" +
"            <p>Blood Group:$bloodg</p>\n" +
"        </div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"    </div>\n" +
"</body>\n" +
"\n" +
"</html>";
        
        File newhtml;
        try {
                newhtml = new File("template.html");
                FileUtils.writeStringToFile(newhtml, htmlstr, "UTF-8");
                
            } catch (IOException e) {
                
                 JOptionPane.showMessageDialog(null,"Can't Create template.html File. Please Check Your Directory Permission");
                
            }
        return "template generated success";
    }
    
}
