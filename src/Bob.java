import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        boolean conversation = true;
//        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Say something to Bob: ");
            String userInput = scanner.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isBlank()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Would like to keep taking to Bob? (Y/N)");
            String userInput2 = scanner.nextLine();
            if (userInput2.equalsIgnoreCase("y")){
                conversation = true;
            } else if (userInput2.equalsIgnoreCase("n")){
                conversation = false;
            }
//        }while(converstition == true);
    }
}
