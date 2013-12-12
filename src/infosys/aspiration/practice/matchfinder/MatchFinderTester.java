package infosys.aspiration.practice.matchfinder;

/**
 *
 * @author Tintinmj
 */
public class MatchFinderTester {

    public static void main(String[] args) {
        
        printResult(1, new MatchFinder().getRelation("Fernando Gonzalez", "Roger Federer"), "FRIEND");
        
        printResult(2, new MatchFinder().getRelation("White", "Davis"), "AFFECTION");
        
        printResult(3, new MatchFinder().getRelation("Hernandez", "Martinez"), "ENEMY");

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
