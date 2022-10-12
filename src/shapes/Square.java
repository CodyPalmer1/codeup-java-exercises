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
//=======
//public class Square extends Quadrilateral{
//
//    @Override
//    public double getPerimeter() {
//        return 0;
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
//
//    @Override
//    public void setLength(double length) {
//
//    }
//
//    @Override
//    public void setWidth(double width) {
//
//>>>>>>> e56097a0e0cf39a05547b8d1629bae7f728761ef
    }
}