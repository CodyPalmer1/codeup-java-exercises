import java.util.Scanner;

public class ControlStatementLec {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Please enter a number: ");
         int userNum = sc.nextInt();
         if(userNum == 5){
             System.out.println("Hey, 5 is sick as heck.");
         } else {
             System.out.println("That number sucks!");
         }

         String food = sc.nextLine();
         String side = sc.nextLine();
//         boolean accessoryToBadExample = false;
         if(food.equals("Nuggets") && side.equals("Fries")){
             System.out.println("Alright, order is ready to go!");
         } else {
             System.out.println("This order is not complete. Please try again.");
         }

//        switch (userNum) { // Switches can be used in Java.
//            case 5:
//                System.out.println("Hey, 5 is sick as heck.");
//                // Fall through!
//            default:
//                System.out.println("That number sucks!");
//                break;
//        }
//        String str = (false) ? "Wow" : "Aw"; // Ternaries can be used in Java.

        for (int i = 0; i < 10; i++){ // Loops can be used in Java.
            if(i == 5){
               continue;
            }
            System.out.println(i);
        }

    }
}
