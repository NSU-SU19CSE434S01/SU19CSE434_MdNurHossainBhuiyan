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
    
        /**
     * Graph partition
     * 
     * node:0 //imageString=null
     * node:1 //image to string success
     * node:1 child:1 //store path
     * 
     * 
     * node:2 //image to string failed
     * node:2 child:2 //error occurred
     * 
   
*     *  
     * @param path
     * @return 
     * @throws java.io.FileNotFoundException
     */
    public static String toImageString(String path) throws FileNotFoundException, IOException {
    
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
    
    
    //Returns A BufferedImage from BASE64 String.
    
    public  static BufferedImage toBufferedImage() throws IOException {
        
        BufferedImage bufferedImage = null;
        try {
            byte[] byteArray = Base64.decodeBase64(Variables.imgString);
            
            try (InputStream in = new ByteArrayInputStream(byteArray)) {
                bufferedImage = ImageIO.read(in);
            }
            
        } catch (IOException iOException) {
            
            return null;
        }
        
        return bufferedImage;
    }
    
    
    
    
}
