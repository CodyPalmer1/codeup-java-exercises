package shapes;
<<<<<<< HEAD
abstract public class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
=======
abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public void LengthAndWidth(double length, double width) {
>>>>>>> e56097a0e0cf39a05547b8d1629bae7f728761ef
        this.length = length;
        this.width = width;
    }

    public double getLength() {
<<<<<<< HEAD
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    abstract void setLength(double length);
    abstract void setWidth(double width);
=======
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
>>>>>>> e56097a0e0cf39a05547b8d1629bae7f728761ef
}
