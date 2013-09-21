package infosys.aspiration.practice.checktag;

/**
 *
 * @author Tintinmj
 */
public class CheckTagTester {

    public static void main(String[] args) {
        
        printTest(null, 1, new CheckTag().getWrongTag(null), -1);
        printTest(">>><<<>>>>>>><<<", 2, new CheckTag().getWrongTag(">>><<<>>>>>>><<<"), 10);
        printTest("<<<>>>><<>>", 3, new CheckTag().getWrongTag("<<<>>>><<>>"), 1);
        printTest(">><<><", 4, new CheckTag().getWrongTag(">><<><"), 4);
        printTest("<<<>>>><<", 5, new CheckTag().getWrongTag("<<<>>>><<"), 3);
        printTest("<<<<<<<<", 6, new CheckTag().getWrongTag("<<<<<<<<"), 8);
        printTest("<><><><><><<<<<<<>><<><>", 7, new CheckTag().getWrongTag("<><><><><><<<<<<<>><<><>"), 6);
        
        printTest("<><<>><<>>>", 8, new CheckTag().getWrongTag("<><<>><<>>>"), 1);
        printTest("", 9, new CheckTag().getWrongTag(""), -1);
        printTest("   ", 10, new CheckTag().getWrongTag("   "), 0);
//        printTest(null, 11, new CheckTag().getWrongTag(null), -1); 
    }
    
    private static void printTest(String testString, int testCaseNo, 
                                    int result, int resultExpected) {
        
        System.out.println(new StringBuilder().
                           append("Test Case # ").
                           append(testCaseNo).
                           append(" ,String : ").
                           append(testString).
                           append(" ,result : ").
                           append(result).
                           append(" ,expectd : ").
                           append(resultExpected).toString());
    }
}
