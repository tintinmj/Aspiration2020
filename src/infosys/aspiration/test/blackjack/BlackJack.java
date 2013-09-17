/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.test.blackjack;

/**
 *
 * @author Tintinmj
 */
public class BlackJack {
    
    public static final int STAND                 = 0;
    public static final int HIT                   = 0;
    public static final int CARD_NAME_NOT_KNOWN   = 0;
    
    
    public int hitOrStand(char firstCard, char secondCard) {
        
        int score;
        
        // player can't identify the card !!! oops
        if(firstCard != 'A' || secondCard != 'A') {
            if(BlackJackCard.isCardValid(firstCard) 
                           &&  
               BlackJackCard.isCardValid(secondCard))
                return BlackJack.CARD_NAME_NOT_KNOWN;
        }
    
}
