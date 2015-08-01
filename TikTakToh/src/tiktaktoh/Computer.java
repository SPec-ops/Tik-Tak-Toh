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
public class Computer {
    
    private Game g;     //keep reference to the game
    
    Random rand;
    
    boolean isOn =true;
    
    public Computer(Game game){
        this.g=game;
        
        rand = new Random();
    }
    
    protected void randomComputerMove(){
        if(g.chancePlayer1==true){
            return;
        }
        //fill the middle box if empty
        if(!"O".equals(g.window.buttons[1][1].getText()) && !"X".equals(g.window.buttons[1][1].getText())){
            g.clickCount++;
            g.window.buttons[1][1].setText("O");
            g.window.buttons[1][1].setEnabled(false);
            g.gameWin();
            g.chancePlayer1= !g.chancePlayer1;      //change the sign of next click-S
            return;
        }
        boolean moved = false;
        while (moved==false){
            int move = rand.nextInt(8);
            int row=move/3;
            int column=move%3;
            if(!"O".equals(g.window.buttons[row][column].getText()) && !"X".equals(g.window.buttons[row][column].getText())){
                
                g.clickCount++;
                g.window.buttons[row][column].setText("O");
                g.window.buttons[row][column].setEnabled(false);
        
                g.gameWin();
                g.chancePlayer1= !g.chancePlayer1;      //change the sign of next click-S
                
                moved=true;
            }
        }
    }
}
