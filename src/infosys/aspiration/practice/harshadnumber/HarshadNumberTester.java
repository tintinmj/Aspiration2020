package infosys.aspiration.practice.harshadnumber;

import java.util.Arrays;

/**
 *
 * @author Tintinmj
 */
public class HarshadNumberTester {

    public static void main(String[] args) {
        
        printResult(1, 
                    Arrays.toString(new HarshadNumbers()
                                    .getHarshadNumberInRange(1729, 1730)), 
                    "[1729]");
        
        printResult(2, 
                    Arrays.toString(new HarshadNumbers()
                                    .getHarshadNumberInRange(10, 20)), 
                    "[10, 12, 18]");
        
        printResult(3, 
                    Arrays.toString(new HarshadNumbers()
                            .getHarshadNumberInRange(100, 10)), 
                    "[0]");
        
        printResult(4, 
                    Arrays.toString(new HarshadNumbers()
                            .getHarshadNumberInRange(-5, 10)), 
                    "[0]");
        
        printResult(5, 
                    Arrays.toString(new HarshadNumbers()
                            .getHarshadNumberInRange(100, 15001)), 
                    "[0]");
    }
    
    private static void printResult(int testNo, String result, 
                                    String resultExpected) {
    System.out.println(new StringBuilder(" Testcase # ").
                           append(testNo).
                           append(" ,result : ").
                           append(result.toUpperCase()).
                           append(" ,result Expected : ").
                           append(resultExpected.toUpperCase()).
                           toString());
    }
}
