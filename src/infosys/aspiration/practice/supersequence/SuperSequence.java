package infosys.aspiration.practice.supersequence;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Tintinmj
 */
public class SuperSequence {
    
    private Set<String> sequences;
    
    public SuperSequence() {
        sequences = new TreeSet<>();
    }
    
    public void run(String firstString, String secondString, int oneBasedIndex) {
        
        if(isAnyCommonLetterBetween(firstString, secondString)) {
            shortSuperSequenceGenerator(firstString, secondString);
            shortSuperSequenceGenerator(secondString, firstString);
            if(oneBasedIndex == 1 || oneBasedIndex == 2) {
                Object []array = sequences.toArray();
                System.out.println(array[oneBasedIndex - 1].toString());
            }
            
            else
                System.out.println("NO ANSWER");
        }
    }
    
    public boolean isAnyCommonLetterBetween(String first, String second) {
        for(int i = 0; i < first.length(); i++) {
            for(int j = 0; j < second.length(); j++) {
                if(first.charAt(i) == second.charAt(j))
                    return true;
            }
        }
        return false;
    }
    
    public void shortSuperSequenceGenerator(String first, 
                                        String second) {
        
        String combinationString = "";
        int k = 0,j;
        for(int i = 0; i < second.length(); i++) {
            for(j = k; j < first.length(); j++) {
                if(second.charAt(i) == first.charAt(j)) {
                    combinationString = combinationString + second.charAt(i) + "";
                    j++;
                    break;
                }
                else {
                    combinationString = combinationString + first.charAt(j) + "";
                }
            }
            if(j == first.length()) {
                i++;
                combinationString = combinationString + second.charAt(i) + "";
            }
            k = j;
        }
        
        sequences.add(combinationString);
    }
    
    public static void main(String []args) {
        SuperSequence test = new SuperSequence();
        test.run("ABC", "ACB", 2);
    }
}
