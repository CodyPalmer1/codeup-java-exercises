import java.util.ArrayList;
import java.util.Arrays;

public class JavaIIAssessmentReview {
//    1.

    public static int square(int num){
        return num * num;
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    public static double sum(double num1, double num2){
        return num1 + num2;
    }

    public static double average(int[] arr){
        double total = 0;
        for(int num : arr){
            total += num;
        }
        return total / arr.length;
    }

    public static void namesToLeet(ArrayList<JavaIIAssessmentUser> user){
        for(JavaIIAssessmentUser u : user){
            u.setFirstName(u.getFirstName().replaceAll("(?i)l", "1")
                    .replaceAll("(?i)e", "3")
                    .replaceAll("(?i)t", "7"));
            u.setLastName(u.getLastName().replaceAll("(?i)l", "1")
                    .replaceAll("(?i)e", "3")
                    .replaceAll("(?i)t", "7"));
        }
    }

}
