package util;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
//        Input input = new Input();
//        System.out.println(Input.getString());
//        System.out.println(Input.yesNo());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a min: ");
        int min = scanner.nextInt();
        System.out.println("Enter a max: ");
        int max = scanner.nextInt();
        System.out.println(Input.getInt(min, max));

//        System.out.println(Input.getInt());
//        System.out.println(Input.getDouble(1.0, 10.0));
//        System.out.println(Input.getDouble());
    }
}
