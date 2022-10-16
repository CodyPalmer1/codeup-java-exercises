import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class PracticeJavaOct14 {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    public Double triangle(){
        System.out.println("Would you like to find the (1) Area or (2) Angles of a triangle?");
        String triangleAnswer = scanner.nextLine();
        if(Objects.equals(triangleAnswer, "1")){
            System.out.println("Do you know the height of your triangle? [Y/N]");
            String knowBase = scanner.nextLine();
            if(knowBase.equalsIgnoreCase("yes") || knowBase.equalsIgnoreCase("y")) {
                System.out.println("Please enter the base: ");
                int base = scanner.nextInt();
                System.out.println("Please enter the height: ");
                int height = scanner.nextInt();
                int triangleArea = (base * height) / 2;
                System.out.println("The area of your triangle is: " + triangleArea);
            } else if (knowBase.equalsIgnoreCase("no") || knowBase.equalsIgnoreCase("n"){
                System.out.println("Please enter the hypotenuse of your triangle: ");
                int hypotenuse = scanner.nextInt();
                System.out.println("Please enter side two of your triangle: ");
                int sideTwo = scanner.nextInt();
                System.out.println("Please enter side three of your triangle: ");
                int sideThree = scanner.nextInt();
                int s = (hypotenuse + sideTwo + sideThree)/2;
                int areaTriangle = (int) Math.sqrt((s*(s-sideTwo)*(s-sideThree)*(s-hypotenuse)));
            }
        } else if(Objects.equals(triangleAnswer, "2")){
            System.out.println("Is your triangle a right triangle? [Y/N]");
            String rightTriYN = scanner.nextLine();
            if(rightTriYN.equalsIgnoreCase("yes") || rightTriYN.equalsIgnoreCase("y")) {

            } else if (rightTriYN.equalsIgnoreCase("no") || rightTriYN.equalsIgnoreCase("n")){

            }
        }

    }
}
