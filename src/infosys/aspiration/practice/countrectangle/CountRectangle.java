package infosys.aspiration.practice.countrectangle;

import infosys.aspiration.libraryutil.Point;
import java.util.Arrays;
import java.util.Comparator;

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
        
        for(int i = 0; i < coOrdinates.length; i++)
            points[i] = new Point(coOrdinates[i][0], coOrdinates[i][1]);

        Arrays.sort(points);
        
        int rectangleCount = 0;
        for(int i = 0; i < points.length; i++) {
            Point leftDown = points[i];
            
            for(int j = i+1; j < points.length; j++) {
                Point rightDown = points[j];
                
                if(leftDown.getX() == rightDown.getX()) {
                
                    for(int k = j+1; k < points.length; k++) {
                        Point leftUp = points[k];
                        
                        if((leftDown.getY() == leftUp.getY())
                                    &&
                            (new Point(leftUp.getX(), rightDown.getY())
                             .existsIn(points))) {
                            
                            rectangleCount++;
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        return rectangleCount;
    }
    
}
