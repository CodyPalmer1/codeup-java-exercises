package shapes;
//abstract public class Quadrilateral extends Shape implements Measurable {
//    protected double length;
//    protected double width;
//    public Quadrilateral(double length, double width) {

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        super();
    }

    public void LengthAndWidth(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

//    abstract void setLength(double length);
//    abstract void setWidth(double width);
//
//        return length;
//    }
//
//    public double getWidth() {
//        return width;
//    }

//    public abstract void setLength(double length);
//
//    public abstract void setWidth(double width);
}
