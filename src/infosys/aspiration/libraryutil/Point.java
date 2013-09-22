package infosys.aspiration.libraryutil;

/**
 *
 * @author Tintinmj
 */
public final class Point {

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
    
}
