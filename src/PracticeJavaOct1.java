import java.util.Scanner;
import java.lang.Math;

public class PracticeJavaOct1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you trying to find the circumfrence of a circle?");
        String userInput = scanner.nextLine();
        if(userInput.equalsIgnoreCase("Yes")){
            System.out.println("Please enter a number for the radius: ");
            int radius = scanner.nextInt();
            double circumfrence = (2*(Math.PI * radius));
            System.out.printf("The circufrence of circle with a radius of %s is: " + circumfrence, radius);
        } else {
            System.out.println("Sorry this is not the right program for you.");
        }

    }
}
