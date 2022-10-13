package util;
import java.util.Scanner;
public class Input {
    private static final Scanner scanner = new Scanner(System.in);
    public static String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static boolean yesNo(){
        String userInput = scanner.nextLine();
        return (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("Yes") || userInput.equalsIgnoreCase("true"));
    }
    public static int getInt(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter a number between %s - %s: ", min, max);
        int userInt = scanner.nextInt();
        if(userInt < min || userInt > max){
            System.out.println("Invalid number. Please enter a number in range: ");;
            userInt = getInt(min, max);
        }
        return userInt;
    }
    public static int getInt(){
        try {
            return Integer.parseInt(getString("Please input a number: "));
        }catch (NumberFormatException e){
            System.out.println("Not a number.");
            return getInt();
        }
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
        try{
            return Double.parseDouble(getString("Please enter a double: "));
        } catch (Exception e){
            System.out.println("Not a double.");
            return getDouble();
        }
    }
}
