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
//        
//        if(g.chancePlayer1==true){
//            return;
//        }
//        
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
    
    protected void intermediateComputerMove(){
        
        
        //fill the middle box if empty
        if(!"O".equals(g.window.buttons[1][1].getText()) && !"X".equals(g.window.buttons[1][1].getText())){
            g.clickCount++;
            g.window.buttons[1][1].setText("O");
            g.window.buttons[1][1].setEnabled(false);
            g.gameWin();
            g.chancePlayer1= !g.chancePlayer1;      //change the sign of next click-S
            return;
        }
        
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(!"O".equals(g.window.buttons[i][j].getText()) && !"X".equals(g.window.buttons[i][j].getText())){
                    String pre=g.window.buttons[i][j].getText();
                    g.window.buttons[i][j].setText("X");
                    if(((g.window.buttons[0][0].getText().equals(g.window.buttons[0][1].getText())) && (g.window.buttons[0][0].getText().equals(g.window.buttons[0][2].getText()))) || 
                        ((g.window.buttons[1][0].getText().equals(g.window.buttons[1][1].getText())) && (g.window.buttons[1][0].getText().equals(g.window.buttons[1][2].getText()))) ||
                        ((g.window.buttons[2][0].getText().equals(g.window.buttons[2][1].getText())) && (g.window.buttons[2][0].getText().equals(g.window.buttons[2][2].getText()))) ||
                        ((g.window.buttons[0][0].getText().equals(g.window.buttons[1][0].getText())) && (g.window.buttons[0][0].getText().equals(g.window.buttons[2][0].getText()))) ||
                        ((g.window.buttons[0][1].getText().equals(g.window.buttons[1][1].getText())) && (g.window.buttons[0][1].getText().equals(g.window.buttons[2][1].getText()))) ||
                        ((g.window.buttons[0][2].getText().equals(g.window.buttons[1][2].getText())) && (g.window.buttons[0][2].getText().equals(g.window.buttons[2][2].getText()))) ||
                        ((g.window.buttons[0][0].getText().equals(g.window.buttons[1][1].getText())) && (g.window.buttons[0][0].getText().equals(g.window.buttons[2][2].getText()))) ||
                        ((g.window.buttons[0][2].getText().equals(g.window.buttons[1][1].getText())) && (g.window.buttons[0][2].getText().equals(g.window.buttons[2][0].getText()))))
                    {
                        g.window.buttons[i][j].setText("O");
                        g.clickCount++;
                        g.window.buttons[i][j].setEnabled(false);
                        g.gameWin();
                        g.chancePlayer1= !g.chancePlayer1;      //change the sign of next click-S
                        return;
                    }
                    g.window.buttons[i][j].setText(pre);
                }
            }
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
