import java.util.Scanner;
public class MethodLecture {
    public static void main(String[] args) {
       int num1;
       int num2;
       Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to add two numbers.");
        System.out.print("Please enter your first number: ");
        num1 = scanner.nextInt();
        System.out.print("Please enter your first number: ");
        num2 = scanner.nextInt();
        System.out.println("Here is the total of your two numbers: " + (add(num1, num2)));

        System.out.println(getPassword());
        System.out.println(isLoggedIn());
        System.out.println(multiply(5.3, 5.7));
        System.out.println(add(num1, num2));
        System.out.println(add(5));

        recursion();
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int add(double num1, double num2){
        return (int)(num1 + num2);
    }

    public static int add(double num1){
        return (int)(num1 + num1);
    }

    public static String getPassword(){
        return "Password";
    }

    public static Boolean isLoggedIn(){
        return true;
    }

    public static double checkBalance(){
        return 1.40;
    }

    public static void soutMessage(){
        System.out.println("Message");
    }

    public static double multiply(double d1, double d2){
        double answer = (d1*d2);
        return answer;
    }

    public static void recursion(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to continue?[y/n] ");
        String choice = scanner.nextLine();
        if(choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")){
            recursion();
        } else if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")){
            System.exit(0);
        } else {
            System.out.println("Invalid Input.");
            recursion();
        }
    }
}
