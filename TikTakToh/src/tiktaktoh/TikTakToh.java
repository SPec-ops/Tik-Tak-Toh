/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktaktoh;

import org.apache.log4j.PropertyConfigurator;



/**
 *
 * @author SHAEDI
 */
public class TikTakToh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game = new Game();
        
        PropertyConfigurator.configure("resources/log4j.properties");
        Thread t = new Thread(game);        //is it ok to run in a new thread
        t.start();
    }
}
