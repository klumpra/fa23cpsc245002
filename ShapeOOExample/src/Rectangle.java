public class Rectangle extends Shape {
    private double length;
    private double width;
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    public Rectangle() {
        this(0,0,0,0);
    }
    public Rectangle(double x, double y, double length, double width) {
        super(x,y);
        setLength(length);
        setWidth(width);
    }
    public Rectangle(Point pt, double length, double width) {
        super(pt);
        setLength(length);
        setWidth(width);
    }
    @Override
    public String getType() {
        return "rectangle";
    }
    @Override
    public String toString() {
        return String.format("%s\t%.2f\t%.2f",super.toString(),length,width);
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerim() {
        return 2 * (length + width);
    }
}
