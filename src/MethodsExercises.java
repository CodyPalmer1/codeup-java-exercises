import java.util.Scanner;
import java.lang.Math;
import java.util.function.DoubleFunction;

public class MethodsExercises {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println(addition(5, 5));
//        System.out.println(subtraction(5, 5));
//        System.out.println(multiplication(5, 5));
//        System.out.println(division(5, 5));
//        System.out.println(modulus(5, 5));

        getInteger(1, 10);
        calculateFactorial();
        rollDice(scan);
        HighLow(100);
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
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


    public static void randomize(int sides) {
        System.out.println((int)Math.floor(Math.random() * sides));
        System.out.println((int)Math.floor(Math.random() * sides));
    }

    public static void rollDice(Scanner scan) {
        while (true) {
            System.out.println("Dice Rolling!");
            System.out.print("Number of sides: ");
            short sides = Short.parseShort(scan.nextLine());
            randomize(sides);
            System.out.println("Do you want to continue? [Yes / No]");
            if (scan.nextLine().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public static void HighLow(int range) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 100: ");
        int userInput = scanner.nextInt();
        int guessNumber = (int) Math.floor(Math.random() * range + 1);
        if (userInput < 1 || userInput > 100) {
            System.out.println("Your number is not within range.");
        } else {
            if (userInput == guessNumber) {
                System.out.println("Correct guess.");
                System.out.printf("Correct number was %d ", guessNumber);
                System.out.println("Thank you for playing, come again.");
            } else if (userInput > guessNumber) {
                System.out.println("Your number is too high.");
                System.out.printf("Correct number was %d ", guessNumber);
                System.out.println("Thank you for playing, come again.");
            } else {
                System.out.println("Your number is too low.");
                System.out.printf("Correct number was %d ", guessNumber);
                System.out.println("Thank you for playing, come again.");
            }
        }
    }
}