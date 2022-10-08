package shapes;
public class Square extends Quadrilateral {


    public Square(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        System.out.println("square");
        return this.width * 4;
    }

    public double getArea() {
        return this.length = this.width;
    }

    void setLength(double length) {
        this.length = this.width = length;
    }

    void setWidth(double width) {
        this.width = width;
        this.length = width;
    }
}