package infosys.aspiration.practice.countrectangle;

/**
 *
 * @author Tintinmj
 */
public class CountRectangleTester {

    public static void main(String[] args) {
        int [][]co =       {{1,1},
                            {3,1},
                            {5,1},
                            {5,3},
                            {5,4},
                            {5,5},
                            {3,3},
                            {3,4},
                            {3,5},
                            {1,3}};
        
        System.out.println(" " + getRectangle(co));
                            
        }
    
    
    public static int getRectangle(int [][]co) {
        int rectangleCount = 0;
        //System.out.println(co.length);
        int i,j,k;
        
        for(i = 0; i < co.length-1; i++) {
        int uple=0,dowrit=0;    
            for(j = i+1; j < co.length; j++) {
                if(co[i][0] == co[j][0]) {
                    uple = j;
                    break;
                }
            }
            
            for(k = i+1; k < co.length; k++) {
                if(co[i][1] == co[k][1]) {
                    dowrit = k;
                    break;
                }
            }
            
            //if(uple == dowrit) return -1; //error
                
            if(co[uple][1] == co[dowrit][0])
                rectangleCount++;
              
        }
        return rectangleCount;
    }
}
