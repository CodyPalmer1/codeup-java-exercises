package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter a radius: ");
        double userRadius = Input.getDouble();
        Circle circle = new Circle(userRadius);
        double circumference = circle.getCircumference();
        double area = circle.getArea();
        System.out.printf("Your circle has circumference of %s and an area of %s", circumference, area);
    }
}
