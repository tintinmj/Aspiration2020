package infosys.aspiration.practice.dnastructure;

/**
 *
 * @author Tintinmj
 */
public class DNAStructureTester {
    public static void main(String[] args) {
        DNAStructure test = new DNAStructure();
        
        // TestCase 1
        String[] leftDNA1  = new String[]{"A1", "G1", "A2", "G2", "A3", "G3"};
        String[] rightDNA1 = new String[]{"T3", "C3", "C2", "T1", "C1", "T2"};
        printDNA(1, leftDNA1, rightDNA1, 
                    test.getDNABasePosition(leftDNA1, rightDNA1));
        
        printDNA(1, leftDNA1, rightDNA1, 
                    test.getDNABasePositionShortcut(leftDNA1, rightDNA1));
        
        
        // TestCase 2
        String[] leftDNA2  = new String[]{"A1", "G1", "A2", "G2", "A3", "G3"};
        String[] rightDNA2 = new String[]{"T2", "C2", "C3", "T1", "C1", "T3"};
        printDNA(2, leftDNA2, rightDNA2, 
                    test.getDNABasePosition(leftDNA2, rightDNA2));
        
        printDNA(2, leftDNA2, rightDNA2, 
                    test.getDNABasePositionShortcut(leftDNA2, rightDNA2));
        
    }
    
    /**
     * 
     * @param testCaseNo case #
     * @param leftDNAlist left DNA list
     * @param rightDNAlist right DNA list
     * @param position position of right DNA component with respect to 
     * left DNA component
     */
    private static void printDNA(int testCaseNo, String[] leftDNAlist,
                                    String[] rightDNAlist, int[] position) {
        System.out.println("TestCase # " + testCaseNo);
        for(int i = 0; i < leftDNAlist.length; i++) {
            System.out.println( leftDNAlist[i] +
                                " <-> " +
                                rightDNAlist[position[i]]);
        }
    }
}
