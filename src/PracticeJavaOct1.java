import java.util.Scanner;
import java.lang.Math;

public class PracticeJavaOct1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you trying to find the information of a circle? ");
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("yes")){
            System.out.print("Please enter a number for the radius: ");
            int radius = scanner.nextInt();
            double diameter = (2 * radius);
            System.out.printf("The diameter of circle with a radius of %s is: %.2f", radius, diameter);
            double circumference = (2*(Math.PI * radius));
            System.out.printf("\nThe circumference of circle with a radius of %s is: %.2f", radius, circumference);
            double area = (Math.PI * (radius * radius));
            System.out.printf("\nThe area of circle with a radius of %s is: %.2f", radius, area);
        } else {
            System.out.println("Sorry this is not the right program for you.");
        }
    }
}
