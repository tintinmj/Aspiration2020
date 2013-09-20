package infosys.aspiration.practice.dnastructure;

import infosys.aspiration.libraryutil.ArrayUtil;

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
        
        // TestCase 3
        String[] leftDNA3  = new String[]{"A1", "G1", "A2", "G2", "A3", "G3", 
                                          "A4", "G4", "A5", "G5", "A6", "G6",
                                          "A7", "G7", "A8", "G8", "A9", "G9", 
                                          "A10", "G10", "A11", "G11", "A12", "G12"};
        String[] rightDNA3 = new String[]{"T1", "C1", "T2", "C2", "T3", "C3",
                                          "T4", "C4", "T5", "C5", "T6", "C6",
                                          "T7", "C7", "T8", "C8", "T9", "C9", 
                                          "T10", "C10", "T11", "C11", "T12", "C12"};
        ArrayUtil.shuffleArray(rightDNA3);
        printDNA(3, leftDNA3, rightDNA3, 
                    test.getDNABasePosition(leftDNA3, rightDNA3));
        printDNA(3, leftDNA3, rightDNA3, 
                    test.getDNABasePositionShortcut(leftDNA3, rightDNA3));
        
        // TestCase 4
        String[] leftDNA4  = new String[]{"A1", "G1", "A2", "G2", "A3", "G3", 
                                          "A4", "G4", "A5", "G5", "A6", "G6",
                                          "A7", "G7", "A8", "G8", "A9", "G9", 
                                          "A10", "G10", "A11", "G11", "A12", "G12"};
        String[] rightDNA4 = new String[]{"T3", "T10", "C12", "C4", "T4", "C7",
                                          "T2", "C11", "C10", "T7", "C8", "C1",
                                          "T9", "T11", "T1", "C6", "C9", "C2",
                                          "C5", "T5", "C3", "T8", "T6", "T12"};
        printDNA(4, leftDNA4, rightDNA4, 
                    test.getDNABasePosition(leftDNA4, rightDNA4));
        printDNA(4, leftDNA4, rightDNA4, 
                    test.getDNABasePositionShortcut(leftDNA4, rightDNA4));
        
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
