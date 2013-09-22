package infosys.aspiration.practice.countrectangle;

import infosys.aspiration.libraryutil.Point;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Tintinmj
 */
public class CountRectangle {
    
    public int getRectangle(int [][]coOrdinates) {
        
        if(coOrdinates.length < 1 || coOrdinates.length > 100)
            return -1;
        
        final int MIN_POINTS_TO_CREATE_RECTANGLE = 4;
        
        if(coOrdinates.length < MIN_POINTS_TO_CREATE_RECTANGLE)
            return 0;
        
        final Point []points = new Point[coOrdinates.length];
        for(int i = 0; i < coOrdinates.length; i++)
            points[i] = new Point(coOrdinates[i][0], coOrdinates[i][1]);
        
        Arrays.sort(points, new Comparator() {
                                @Override
                                public int compare(Object o1, Object o2) {
                                    Point p1 = (Point)o1;
                                    Point p2 = (Point)o2;

                                    if(Integer.compare(p1.getX(),p2.getX()) == 0)
                                    {
                                        return Integer.compare(p1.getY(), p2.getY());
                                    }

                                    return Integer.compare(p1.getX(),p2.getX());
                                }
                            }
                    );
        
        int rectangleCount = 0;
        for(int i = 0; i < points.length; i++) {
            
            for(int j = i+1; j < points.length; j++) {
                
                if(points[i].getX() == points[j].getX()) {
                
                    for(int k = j+1; k < points.length; k++) {
                        
                        if(points[i].getY() == points[k].getY()) {
                            
                            if(new Point(points[k].getX(), 
                                    points[j].getY()).
                                    existsIn(points)) {
                                
                                rectangleCount++;
                            }
                        }
                    }
                }
            }
        }
        
        return rectangleCount;
    }
    
}
