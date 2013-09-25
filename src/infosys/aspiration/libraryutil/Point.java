package infosys.aspiration.libraryutil;

/**
 *
 * @author Tintinmj
 */
public final class Point implements Comparable<Point>{

    private final int X;
    private final int Y;
    
    public Point(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
    
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
    
    public boolean existsIn(Point[] graph) {
        return ArrayUtil.contains(graph, this);
    }

    @Override
    public String toString() {
        return "Point{" + "X=" + X + ", Y=" + Y + '}';
    }

//   @Override
//    public int compare(Point p1, Point p2) {
////        Point p1 = (Point)o1;
////        Point p2 = (Point)o2;
////
//        if(Integer.compare(p1.getX(),p2.getX()) == 0)
//        {
//            return Integer.compare(p1.getY(), p2.getY());
//        }
//
//        return Integer.compare(p1.getX(),p2.getX());
//    }

    @Override
    public int compareTo(Point p) {
        if(Integer.compare(this.getX(),p.getX()) == 0)
        {
            return Integer.compare(this.getY(), p.getY());
        }

        return Integer.compare(this.getX(),p.getX());
    }
    
}
