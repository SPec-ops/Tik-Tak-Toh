/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktaktoh;

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
        //Game game = new Game();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TikTakTohWindow window = new TikTakTohWindow();
                window.setTitle("Tik-Tak-Toh");
                window.setVisible(true);
                //buttons = window.buttons;
            }
        });
    }
}
