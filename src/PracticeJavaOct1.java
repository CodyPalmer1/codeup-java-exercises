import java.util.Scanner;
import java.lang.Math;

public class PracticeJavaOct1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you trying to find the information of a circle?");
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("Yes")){
            System.out.println("Please enter a number for the radius: ");
            int radius = scanner.nextInt();
            double diameter = (2 * radius);
            System.out.printf("The diameter of circle with a radius of %s is: " + diameter, radius);
            double circumference = (2*(Math.PI * radius));
            System.out.printf("\nThe circumference of circle with a radius of %s is: " + circumference, radius);
            double area = (Math.PI * (radius * radius));
            System.out.printf("\nThe area of circle with a radius of %s is: " + circumference, radius);
        } else {
            System.out.println("Sorry this is not the right program for you.");
        }

    }
}
