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
public abstract class SystemInitializer {
    //This Class initializes system & creates files with default value ( if none )
    /**
     * @throws IOException
     */
    public static void initSystem() throws IOException {
  
        try {
            FileInputStream fstream;
            fstream = new FileInputStream("template.html");
            fstream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            setDefaultHTML();

        }
    }
    private static void setDefaultHTML() {
        
        String htmlstr = "<html>\n" +
"<head>\n" +
"<title> $title </title>\n" +
"</head>\n" +
"<body>\n" +
"<h2>$name $address</h2>\n" +
"<h3>$father</h3>\n" +
"<h4>$mother<br>$bloodg</h4>\n" +
"\n" +
"<p align=\"center\"><img src=\"data:image/$type;base64,$imgStr\" ></p>\n" +
"<h4>Religion: <i>$religion </i><br>Nationality: <i>$nationality</i><br>Phone Number: <i>$phone</i><br>Email: <i>$email</i><br></h4>\n" +
"\n" +
"\n" +
"<center><p><h2>Biography</h2></p></center>\n" +
"<p><h4>$experience</h4></p>\n" +
"<hr>\n" +
"\n" +
"$educational\n" +
"\n" +
"$skills\n" +
"\n" +
"$achievement\n" +
"\n" +
"</body>\n" +
"</html>";
        
        File newhtml;
        try {
                newhtml = new File("template.html");
                FileUtils.writeStringToFile(newhtml, htmlstr, "UTF-8");
                
            } catch (IOException e) {
                
                 JOptionPane.showMessageDialog(null,"Can't Create template.html File. Please Check Your Directory Permission");
                
            }
    }
    
}
