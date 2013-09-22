package infosys.aspiration.practice.countrectangle;

/**
 *
 * @author Tintinmj
 */
public class CountRectangleTester {

    public static void main(String[] args) {
        int [][]co1 =      {{1,1},
                            {3,1},
                            {5,1},
                            {5,3},
                            {5,4},
                            {5,5},
                            {3,3},
                            {3,4},
                            {3,5},
                            {1,3}};
        
        printTestResult(1, new CountRectangle().getRectangle(co1), 8);
        
        int [][]co2 =  {{2001, 3000}, {2001, 3001},
                        {2001, 3002}, {2001, 3003},
                        {2001, 3004}, {3001, 3000},
                        {3001, 3003}, {3001, 3004}};
            
        printTestResult(2, new CountRectangle().getRectangle(co2), 3);
        
        int [][]co3 =  {{1,1},
                        {7,1},
                        {1,4},
                        {1,5},
                        {7,4},
                        {7,5}};
         
        printTestResult(3, new CountRectangle().getRectangle(co3), 3);
    
    }
    
    private static void printTestResult(int testNo, int result, int resultExpected) {
        System.out.println(new StringBuilder(" Testcase # ").
                               append(testNo).
                               append(" ,result : ").
                               append(result).
                               append(" ,result Expected : ").
                               append(resultExpected).toString());
    }

}
