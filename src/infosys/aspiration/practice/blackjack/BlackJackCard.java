/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.practice.blackjack;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Tintinmj
 */
public class BlackJackCard {
    
    public static final Map<Character, Integer> blackJackCardToValue;
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    public static final char []cardNameInChar = new char[]{
                                                '2', '3', '4', '5', '6', 
                                                '7', '8', '9', 'J', 'Q', 'K', 'A'};
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    public static final int []cardVaule = new int[]{
                                                 2, 3, 4, 5, 6,
                                                 7, 8, 9, 10, 10, 10, 11};
    static {
        
        // assign the card value as card name
        blackJackCardToValue = new HashMap<>();
        for(int i = 0; i < cardNameInChar.length; i++) {
            blackJackCardToValue.put(cardNameInChar[i], cardVaule[i]);
        }
    }
    
    public static boolean isValid(char key) {
        return ArrayUtils.contains(cardNameInChar, key);
    }
    
    public static boolean isFaceCard(char card) {
        if(card == 'J' ||
           card == 'Q' ||
           card == 'K'  ) return true;
        else
            return false;
    }
    
    public static boolean oneOfTheCardIsAce(char firstCard, char secondCard) {
        return (firstCard == 'A' || secondCard == 'A');
    }
    
    public static boolean isDealtCardsValid(char firstCard, char secondCard) {
        return BlackJackCard.isValid(firstCard) && 
                BlackJackCard.isValid(secondCard);
    }
    
    public static boolean isBothCardsAreAce(char firstCard, char secondCard) {
        return (firstCard == 'A' && secondCard == 'A');
    }
    
    public int noOfCards() {
        return cardNameInChar.length;
    }

}
