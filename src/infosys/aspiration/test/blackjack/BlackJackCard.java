/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.test.blackjack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tintinmj
 */
public class BlackJackCard {
    
    public static final Map<Character, Integer> blackJackCardToValue;
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    public static final Character []cardNameInChar = new Character[]{
                                                '1', '2', '3', '4', '5', '6', 
                                                '7', '8', '9', 'J', 'Q', 'K'};
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private static final Integer []cardVaule = new Integer[]{
                                                 1, 2, 3, 4, 5, 6,
                                                 7, 8, 9, 10, 10, 10};
    static {
        
        // assign the card value as card name
        blackJackCardToValue = new HashMap<>();
        for(int i = 0; i < cardNameInChar.length; i++) {
            blackJackCardToValue.put(cardNameInChar[i], cardVaule[i]);
        }
    }
    
    public static boolean isCardValid(char key) {
        return Arrays.binarySearch(cardNameInChar, key) >= 0;
    }
}
