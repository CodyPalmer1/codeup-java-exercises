package shapes;
public class Rectangle {
    protected int width;
    protected int length;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }
}
