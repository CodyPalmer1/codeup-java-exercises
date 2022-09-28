import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s\n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.print("Enter 3 words:");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.println("You entered: --> \"" + userInput1 + "\" <--");
        System.out.println("You entered: --> \"" + userInput2 + "\" <--");
        System.out.println("You entered: --> \"" + userInput3 + "\" <--");

        scanner.nextLine();
        System.out.print("Enter a sentence:");
        String userInput4 = scanner.nextLine();
        System.out.println(userInput4);

        System.out.print("Please enter the length of the room in feet: ");
        int length = scanner.nextInt();
        System.out.print("Please enter the width of the room in feet: ");
        int width = scanner.nextInt();
        int area = (length * width);
        int perimeter =  (length*2) + (width*2);
        System.out.println("The area of the room is: " + area);
        System.out.println("The perimeter of the room is: " + perimeter);

    }
}