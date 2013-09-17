/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.test.blackjack;

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
    private static final char []cardNameInChar = new char[]{
                                                '2', '3', '4', '5', '6', 
                                                '7', '8', '9', 'J', 'Q', 'K', 'A'};
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private static final int []cardVaule = new int[]{
                                                 2, 3, 4, 5, 6,
                                                 7, 8, 9, 10, 10, 10, 1};
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

}
