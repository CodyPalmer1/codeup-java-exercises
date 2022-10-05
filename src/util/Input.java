package util;
import java.util.Scanner;
public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        String userInput = scanner.nextLine();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("true"));
    }

    public static int getInt(int min, int max){
        Scanner scanner1 = new Scanner(System.in);
        System.out.printf("Please enter a number between %s - %s: ", min, max);
        int userInt = scanner.nextInt();
        if(userInt < min || userInt > max){
            System.out.println("Invalid number. Please enter a number in range: ");;
            userInt = getInt(min, max);
        }
        return userInt;
    }

    public static int getInt(){
        return scanner.nextInt();
    }

    public static double getDouble(double min, double max){
        System.out.printf("Please enter a number between %s - %s: ", min, max);
        double userDouble = scanner.nextDouble();
        if(userDouble < min || userDouble > max){
            System.out.println("Invalid number. Please enter a number in range: ");
            userDouble = getDouble(min, max);
        }
        return userDouble;
    }

    public static double getDouble(){
        return scanner.nextDouble();
    }
}
