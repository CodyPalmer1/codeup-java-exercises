import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Formatter;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // -------------------------------//
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i);
//            i++;
//        }

//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }

        // -------------------------------//

//        int a = 0;
//        do {
//            System.out.println(a += 2);
//        } while (a < 100);

//        for(int a = 0; a < 100; a += 2){
//            System.out.println(a);
//        }

        // -------------------------------//

//        int b = 101;
//        do {
//            System.out.println(b -= 5);
//        } while (b > -10);

//        for(int b = 100; b > -11; b -= 5){
//            System.out.println(b);
//        }

        // -------------------------------//

//        long c = 2;
//        do {
//            System.out.println(c = c * c);
//        } while (c < 1000000);

//        for(long c = 2; c < 100000; c = c * c){
//            System.out.println(c);
//        }

        // -------------------------------//

//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0)
//                System.out.println("FizzBuzz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else
//                System.out.println(i);
////        }

        // -------------------------------//
        boolean keepGoing = false;
//        do {
//
//            System.out.println("Enter a number: ");
//            int userNum = scanner.nextInt();
//
//            System.out.println("Number | Squared | Cubed");
//            System.out.println("------ - ------- - -----");
//            for (int i = 1; i <= userNum; i++) {
//                System.out.printf("%d | %d | %d%n", i, i * i, i * i * i);
//            }
//            scanner.nextLine();
//            System.out.println("Would you like to do yet more math?");
//            String userAnswer = scanner.nextLine();
//
//            if (userAnswer.equalsIgnoreCase("yes")) {
//                keepGoing = false;
//            }
//        } while (keepGoing);

        do {
            System.out.println("Enter a number: ");
            int userNum = scanner.nextInt();

            if(userNum >= 88 && userNum <= 97){
                System.out.println("You got an A!");
            } else if (userNum >= 80 && userNum <= 87){
                System.out.println("You got an B!");
            } else if (userNum >= 67 && userNum <= 79) {
                System.out.println("You got an C!");
            } else if (userNum >= 60 && userNum <= 66){
                    System.out.println("You got an D!");
            } else if (userNum < 60) {
                System.out.println("You got an F!");
            } else if (userNum >= 99 && userNum <= 100) {
                System.out.println("You got an A+!");
            }

            scanner.nextLine();
            System.out.println("Would you like to do yet more math?");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equalsIgnoreCase("yes")) {
                keepGoing = true;
            } else{
                keepGoing = false;
            }
        } while (keepGoing);

    }
}

