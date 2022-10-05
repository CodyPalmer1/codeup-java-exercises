package util;
import java.util.Scanner;
public class Input {
    private final Scanner scanner = new Scanner(System.in);

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("Yes");
    }

    public int getInt(int min, int max){
        System.out.println("Please enter a number between 1 - 10: ");
        int userInt = scanner.nextInt();
        if(userInt < min || userInt > max){
            System.out.println("Invalid number. Please enter a number in range: ");
            getInt();
        }
        return userInt;
    }

    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Please enter a number between 1 - 10: ");
        double userDouble = scanner.nextInt();
        if(userDouble < min || userDouble > max){
            System.out.println("Invalid number. Please enter a number in range: ");
            getInt();
        }
        return userDouble;
    }

    public double getDouble(){
        return scanner.nextDouble();
    }
}
