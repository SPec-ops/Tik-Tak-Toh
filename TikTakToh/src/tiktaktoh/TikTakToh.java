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
        //TikTakTohWindow game = new TikTakTohWindow();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TikTakTohWindow game = new TikTakTohWindow();
                game.setTitle("Tik-Tak-Toh");
                game.setVisible(true);
            }
        });
    }
}
