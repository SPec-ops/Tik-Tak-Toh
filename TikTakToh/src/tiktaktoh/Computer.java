/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tiktaktoh;
//package org.logging.learn.main;

import java.util.Random;

import org.apache.log4j.Logger;
/**
 *
 * @author SHAEDI
 */
public class Computer {
    
    private Game g;     //keep reference to the game
    
    Random rand;
    
    boolean isOn =true;
    
    private static Logger logger = Logger.getLogger(Computer.class);
    
    public Computer(Game game){
        this.g=game;
        
        rand = new Random();
    }
    
    protected void randomComputerMove(){
        
        if(g.chancePlayer1==true){
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
