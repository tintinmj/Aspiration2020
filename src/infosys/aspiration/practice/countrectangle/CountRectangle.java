package infosys.aspiration.practice.countrectangle;

import infosys.aspiration.libraryutil.Point;
import java.util.Arrays;

/**
 *
 * @author Tintinmj
 */
public class CountRectangle {
    
    public int getRectangleCount(int [][]coOrdinates) {
        
        if(coOrdinates.length < 1 || coOrdinates.length > 100)
            return -1;
        
        final int MIN_POINTS_TO_CREATE_RECTANGLE = 4;
        
        // can't make a rectangle with less than 4 points
        if(coOrdinates.length < MIN_POINTS_TO_CREATE_RECTANGLE)
            return 0;
        
        final Point []points = new Point[coOrdinates.length];
        
        for(int i = 0; i < coOrdinates.length; i++) {
            if(coOrdinates[i].length > 2)
                return -1;
            points[i] = new Point(coOrdinates[i][0], coOrdinates[i][1]);
        }
        
        Arrays.sort(points);
        
        int rectangleCount = 0;
        for(int i = 0; i < points.length; i++) {
            Point leftDown = points[i];
            
            for(int j = i+1; j < points.length; j++) {
                Point leftUp = points[j];
                
                if(leftDown.getX() == leftUp.getX()) {
                    
                    for(int k = j+1; k < points.length; k++) {
                        Point rightDown = points[k];
                        
                        if(leftDown.getY() == rightDown.getY()){
                            Point probableRightUp = new Point(rightDown.getX(), leftUp.getY());
                            
                            if(probableRightUp.existsIn(points))
                                rectangleCount++;
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        return rectangleCount;
    }
    
}
