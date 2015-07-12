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
        Game game = new Game();
        
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TikTakTohWindow window = new TikTakTohWindow();
                window.setTitle("Tik-Tak-Toh");
                window.setVisible(true);
                //buttons = window.buttons;
            }
        });
        */
        //TikTakTohWindow w=new TikTakTohWindow(game);
        //GameOverWindow go=new GameOverWindow();
        Thread t = new Thread(game);        //is it ok to run in a new thread
        t.start();
    }
}
