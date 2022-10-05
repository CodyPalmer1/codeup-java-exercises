package shapes;
import java.util.Scanner;
public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the area: ");
        return Math.PI * (Math.pow(this.radius, 2));
    }

    public double getCircumference(){

        return 2 * Math.PI * this.radius;
    }

}
