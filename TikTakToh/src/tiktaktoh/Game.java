//notes - 
//add a notice saying whose chance at the first
//disable the buttons at the start and add graphics


package tiktaktoh;

import javax.swing.JButton;

/**
 *
 * @author SHAEDI
 */
public class Game {
    private JButton[][] buttons;
    
    protected int clickCount = 0;         //clicks in a game
    protected boolean chancePlayer1 = true;       //variable to decide whose turn and which mark to appear-S
    protected boolean player1First = true;      //who is starting the game
    
    public Game(JButton[][] buttons){      //adding the buttons array-s
        this.buttons = buttons;
    }
    
    private int gameWin(){
        if(((buttons[0][0]==buttons[0][1]) && (buttons[0][0]==buttons[0][2])) || 
            ((buttons[1][0]==buttons[1][1]) && (buttons[1][0]==buttons[1][2])) ||
                ((buttons[2][0]==buttons[2][1]) && (buttons[2][0]==buttons[2][2])) ||
                ((buttons[0][0]==buttons[1][0]) && (buttons[0][0]==buttons[2][0])) ||
                ((buttons[0][1]==buttons[1][1]) && (buttons[0][1]==buttons[2][1])) ||
                ((buttons[0][2]==buttons[1][2]) && (buttons[0][2]==buttons[2][2])) ||
                ((buttons[0][0]==buttons[1][1]) && (buttons[0][0]==buttons[2][2])) ||
                ((buttons[0][2]==buttons[1][1]) && (buttons[0][2]==buttons[2][0]))){
            //who wins
            clickCount=0;
            player1First = !player1First;
            //return
        }
        //tied
        clickCount=0;
        player1First = !player1First;
        return 0;
    }
}
