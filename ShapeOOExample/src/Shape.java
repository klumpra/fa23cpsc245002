public abstract class Shape implements Comparable<Shape> {
    private Point location;  // ownership - Every shape owns an object of class Point
    public double getX() {
        return location.getX();    // delegation - software pattern where the owner asks the owned to do something
    }
    public double getY() {
        return location.getY();
    }
    public Point getLocation() {
        return location;
    }
    public void setX(double x) {
        location.setX(x);
    }
    public void setY(double y) {
        location.setY(y);
    }
    public void setLocation(Point pt) {
        location = pt;
    }
    public Shape() {
        this(0,0);
    }
    public Shape(double x, double y) {
        location = new Point(x,y);     // composition ownership - the owner creates the thing it owns
    }
    public Shape(Point pt) {
        location = pt;                 // aggregation ownership - the owned is passed in from elsewhere
    }
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerim();
    public double getDistanceFromOrigin() {
        return location.getDistanceFromOrigin();   // delegation
    }
    @Override
    public String toString() {
        return String.format("%s\t%s",getType(),location.toString());  // delegation
    }
    public String toStringDetailed() {
        return "The basics: " + toString() + "\tCalculated: " + String.format("Area = %.2f\tPerim = %.2f\tDistance = %.2f",getArea(),getPerim(),getDistanceFromOrigin());
    }
    @Override
    public int compareTo(Shape other) {
        double myDist = getDistanceFromOrigin();
        double otherDist = other.getDistanceFromOrigin();
        if (myDist < otherDist) {
            return -1;
        } else if (myDist == otherDist) {
            return 0;
        } else {
            return 1;
        }
    }
}
