/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvbuilderfinal;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.apache.commons.net.util.Base64;

/**
 *
 * @author NHBSOHEL
 */
public class ImageProcess {
     //Gets File Path & Returns BASE64 String Value
    public  String toImageString(String path) throws FileNotFoundException, IOException {
    
        String imageString = "";
        try {
            File f = new File(path);
            try (FileInputStream fis = new FileInputStream(f)) {
                byte byteArray[] = new byte[(int) f.length()];
                fis.read(byteArray);
                imageString = Base64.encodeBase64String(byteArray);
                fis.close();
            }
        } catch (IOException iOException) {
            
            return "";
        }
        
        
        return imageString;
    
    }
    
}
