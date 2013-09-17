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
    
    public static final int STAND                   = 0;
    public static final int HIT                     = 1;
    public static final int CARD_NAME_NOT_KNOWN     = -1;
    public static final int BLACKJACK_HAND          = 2;
    
    public boolean cardsContainsAce(char firstCard, char secondCard) {
        return (firstCard == 'A' || secondCard == 'A');
    }
    
    public boolean isCardValid(char firstCard, char secondCard) {
        
        boolean isValid = false;
        // player can't identify the card !!! oops
        if(!cardsContainsAce(firstCard, secondCard)) {
            if(BlackJackCard.isCardPresent(firstCard) 
                           &&  
               BlackJackCard.isCardPresent(secondCard))
               isValid = false;
        }
        
        // card dealt is fine
        else {
            isValid = true;
        }
        
        return isValid;
    }
    
    private int hitOrStandHelper(char firstCard, char secondCard) {
        
        // either card not identifed 
        if(!this.isCardValid(firstCard, secondCard))
            return BlackJack.CARD_NAME_NOT_KNOWN;
        
        // blackjack hand means score is 21
        if(firstCard == 'A' && secondCard == BlackJackCard.isFaceCard(secondCard)
                                    ||
           secondCard == 'A' && firstCard == BlackJackCard.isFaceCard(firstCard))
            return BlackJack.BLACKJACK_HAND;
        
        //
    }
        
    
}
