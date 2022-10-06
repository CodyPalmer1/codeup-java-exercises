package shapes;
public class Square extends Rectangle{

    protected int side;

    public Square(int side){
        super(side, side);
    }

    public double getArea(){
        return 4 * side;
    }

    public double getPerimeter(){
        return Math.pow(side, 2);
    }
}
