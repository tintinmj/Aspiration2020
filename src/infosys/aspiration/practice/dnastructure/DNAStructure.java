package infosys.aspiration.practice.dnastructure;

/**
 *
 * @author Tintinmj
 */
public class DNAStructure {
    
    /**
     * 
     * @param leftDNAList ordered DNA left list containing only 'A' and 'G' 
     * @param rightDNAList shuffled DNA right list containing only 'T' and 'C' 
     * @return an int array with positions of 'T' or 'C' with respect to 
     * corresponding 'A' or 'G'
     * @throws IllegalArgumentException if length of two lists differ
     * time complexity O(n)
     */
    public int[] getDNABasePositionShortcut(String []leftDNAList,
                                        String []rightDNAList) {
        
        if(leftDNAList.length != rightDNAList.length)
            throw new IllegalArgumentException("Two list should have same length");
        
        int []position = new int[leftDNAList.length];
        
        for(int i = 0; i < rightDNAList.length; i++) {
            
            // 'T' will be always map with 'A'
            // and 'A' will be at the even index(considering 0 based array)
            if(rightDNAList[i].charAt(0) == 'T') {
                position[(Integer.
                            parseInt(String.
                                        valueOf(rightDNAList[i].
                                            charAt(1))) * 2) - 2] = i;
            }
            
            // 'C' will be always map with 'G'
            // and 'G' will be at the odd index(considering 0 based array)
            else if(rightDNAList[i].charAt(0) == 'C') {
                position[(Integer.
                            parseInt(String.
                                        valueOf(rightDNAList[i].
                                            charAt(1))) * 2) - 1] = i;
            }
        }
        
        return position;
    }
    
    /**
     * 
     * @param leftDNAList ordered DNA left list containing only 'A' and 'G' 
     * @param rightDNAList shuffled DNA right list containing only 'T' and 'C' 
     * @return an int array with positions of 'T' or 'C' with respect to 
     * corresponding 'A' or 'G'
     * @throws if length of two lists differ
     * time complexity O(n^2)
     */
    public int[] getDNABasePosition(String []leftDNAList,
                                        String []rightDNAList) {
        int[] position = new int[leftDNAList.length];
        
        for (int i = 0, k = 0; i < leftDNAList.length; i++) {
            position[k++] = getPosition(leftDNAList[i], rightDNAList);
        }
        
        return position;
    }
    
    /**
     * 
     * @param leftDNA DNA component in left DNA List
     * @param rightDNAList DNA list
     * @return position of component of rightDNAList with respect to leftDNA
     */
    private int getPosition(String leftDNA, String[] rightDNAList) {
        if (leftDNA.charAt(0) == 'A') {
            for (int i = 0; i < rightDNAList.length; i++) {
                if (leftDNA.charAt(1) == rightDNAList[i].charAt(1) && 
                        rightDNAList[i].charAt(0) == 'T')
                    return i;
            }
        } 
        else {
            for (int i = 0; i < rightDNAList.length; i++) {
                if (leftDNA.charAt(1) == rightDNAList[i].charAt(1) && 
                        rightDNAList[i].charAt(0) == 'C')
                        return i;
            }
        }
        return 0;
    }
    
}
