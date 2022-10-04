import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println(addition(5, 5));
//        System.out.println(subtraction(5, 5));
//        System.out.println(multiplication(5, 5));
//        System.out.println(division(5, 5));
//        System.out.println(modulus(5, 5));

        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
        getInteger(1, 10);

        calculateFactorial();
        rollDice(scan);
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input > max || input < min) {
            System.out.printf("Invalid number! Enter a number between %s to %s:", min, max);
            return getInteger(min, max);
        }
        System.out.println("You entered " + input + "!");
        return input;
    }

    public static void calculateFactorial() {
        Scanner factorialScanner = new Scanner(System.in);
        System.out.print("Please enter an integer between 1 and 10: ");
        int userInput = getInteger(1, 10);
        long factorial = 1;
        String output = "! = 1";
        System.out.printf("1%s\n", output);
        for (int i = 2; i <= userInput; i++) {
            factorial *= i;
            output += " x " + i;
            System.out.printf("%d%s = %d\n", i, output, factorial);
        }
        System.out.print("Would you like to continue? (y/n): ");
        if (factorialScanner.nextLine().toLowerCase().equals("y")) {
            calculateFactorial();
        }
    }


    public static void randomize(short sides) {
        System.out.println((int) Math.floor(Math.random() * sides));
        System.out.println((int) Math.floor(Math.random() * sides));
    }

    public static void rollDice(Scanner scan) {
        while (true) {
            System.out.println("Dice Rolling!");
            System.out.print("Number of sides: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue? [Yes / No]");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("Thank you for playing, come again.");
                break;
            }
        }
    }

}