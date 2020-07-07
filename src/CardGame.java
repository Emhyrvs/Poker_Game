/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Powerzak
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws IOException {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new logowanie().setVisible(true);
                         
            }});
	
              
                        
                          
   }
}

