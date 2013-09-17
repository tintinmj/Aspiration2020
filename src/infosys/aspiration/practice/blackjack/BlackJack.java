/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.practice.blackjack;

/**
 *
 * @author Tintinmj
 */
public class BlackJack {
    
    private static final int STAND                   = 0;
    private static final int HIT                     = 1;
    private static final int CARD_NAME_NOT_KNOWN     = -1;
    private static final int BLACKJACK_HAND          = 2;
    
    public boolean oneOfTheCardIsAce(char firstCard, char secondCard) {
        return (firstCard == 'A' || secondCard == 'A');
    }
    
    public boolean isDealtCardsValid(char firstCard, char secondCard) {
        return BlackJackCard.isValid(firstCard) && 
                BlackJackCard.isValid(secondCard);
    }
    
    private int hitOrStandHelper(char firstCard, char secondCard) {
        
        // either card not identifed 
        if(!this.isDealtCardsValid(firstCard, secondCard))
            return BlackJack.CARD_NAME_NOT_KNOWN;
        
        // blackjack hand means score is 21
        if(firstCard == 'A' && BlackJackCard.isFaceCard(secondCard) || 
                secondCard == 'A' && BlackJackCard.isFaceCard(firstCard))
            return BlackJack.BLACKJACK_HAND;
        
        
        int score = BlackJackCard.blackJackCardToValue.get(firstCard) +
                BlackJackCard.blackJackCardToValue.get(secondCard);
        
        // player needs to hit
        if(oneOfTheCardIsAce(firstCard, secondCard) ||
                score <= 11)
            return BlackJack.HIT;
        
        // player needs to stand
        else 
            return BlackJack.STAND;
    }
    
    public String hitOrStand(char firstCard, char secondCard) {
        String result;
        switch(hitOrStandHelper(firstCard, secondCard)) {
            case STAND               : result = "STAND";         break;
            case BLACKJACK_HAND      : result = "Black Jack";    break;
            case HIT                 : result = "HIT";           break;
            case CARD_NAME_NOT_KNOWN : result = "Invalid Card";  break;
            default                  : result = "WTF!!!";        break;
        } 
        return result;
    }
        
    
}
