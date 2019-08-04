/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvbuilderfinal;

import java.awt.Dimension;
import java.io.File;
import java.net.MalformedURLException;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * 
 * 
 * 
 * @author NHBSOHEL
 * 
 *     /**
     * Graph partition
     * 
     * node:0 //jpanel=null
     * node:1 //preview success
     * node:1 child:1 //show index file
     * 
     * 
     * node:2 //preview failed
     * node:2 child:2 //error occured
     * 
     * 
     * @throws IOException 
     */
 
public class PreviewPage {
    public  String mySitePreview() {

    JPanel myPanel = new JPanel();

    final JFXPanel fxPanel = new JFXPanel(); //JavaFX has been used here.

    myPanel.setLayout(new java.awt.BorderLayout());
    myPanel.add(fxPanel);

    Platform.runLater(() -> {
        WebView webView = new WebView();
        fxPanel.setScene(new Scene(webView));
        
        try { //File Export
            
            File f = new File("index.html");
            webView.getEngine().load(f.toURI().toURL().toString());
         //   System.out.println(f.toURI().toURL().toString());
        }
        catch(MalformedURLException e) {
            
            JOptionPane.showMessageDialog(MotherFrame.mframe,"Something Went Wrong. Please restart the applicaton.");
        }
    });
        
       JOptionPane pane = new JOptionPane(myPanel);
       JDialog dialog = pane.createDialog(MotherFrame.mframe, "Website Preview - CV BUILDER");
       dialog.setSize(new Dimension(800,600));
       dialog.setVisible(true);
       return "Preview Success";
}
}
