/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktaktoh;

import java.util.Random;

/**
 *
 * @author SHAEDI
 */
public class Computer implements Runnable{
    
    private Game g;     //keep reference to the game
    
    Random rand;
    
    public Computer(Game game){
        this.g=game;
        
        rand = new Random();
    }
    
    protected void randomComputerMove(){
        boolean moved = false;
        while (moved==false){
            int move = rand.nextInt(8);
            int row=move/3;
            int column=move%3;
            if(!"O".equals(g.window.buttons[row][column].getText()) && !"X".equals(g.window.buttons[row][column].getText())){
                
                g.clickCount++;
                if(g.chancePlayer1==true) {
                    g.window.buttons[row][column].setText("X");
                }
                else {
                    g.window.buttons[row][column].setText("O");
                }
                g.window.buttons[row][column].setEnabled(false);
        
                g.gameWin();
                g.chancePlayer1= !g.chancePlayer1;      //change the sign of next click-S
                
                moved=true;
            }
        }
    }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet.");
        computerRun();
    }

    private void computerRun() {
        //throw new UnsupportedOperationException("Not yet implemented");
        while(true){
            if(!g.chancePlayer1){
                randomComputerMove();
            }
        }
    }
}
