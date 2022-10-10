import java.util.Scanner;

public class PractiveJavaOct9Extends extends PracticeJavaOct9 {
    Scanner scanner = new Scanner(System.in);
    double userHeight;
    double userWidth;
    double userLength;

    public static void main(String[] args) {
        getLength();
        getWidth();
        getHeight();
        setVolume();
    }
    void getLength() {
        System.out.println("Please enter a length: ");
        double userLength = scanner.nextInt();
    }

    void getWidth() {
        System.out.println("Please enter a width: ");
        double userWidth = scanner.nextInt();
    }

    void getHeight() {
        System.out.println("Please enter a height: ");
        double userHeight = scanner.nextInt();
    }

    void setVolume() {
        userHeight * userWidth * userLength
    }
}
