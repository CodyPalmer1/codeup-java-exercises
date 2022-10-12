package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Object> students = new HashMap<>();

        Student cody = new Student("Cody");
        cody.addGrade(100);
        cody.addGrade(99);
        cody.addGrade(95);
        students.put("CodyPalmer1", cody);

        Student corey = new Student("Corey");
        corey.addGrade(90);
        corey.addGrade(91);
        corey.addGrade(92);
        students.put("kidCorey10", corey);

        Student cristian = new Student("Cristian");
        cristian.addGrade(95);
        cristian.addGrade(94);
        cristian.addGrade(93);
        students.put("Crisalmendarez", cristian);

        Student cas = new Student("Casanova");
        cas.addGrade(99);
        cas.addGrade(92);
        cas.addGrade(90);
        students.put("CasTheDude", cas);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println();
        System.out.println("|CodyPalmer1|  |kidCorey10|  |Crisalmendarez|  |CasTheDude|");

        boolean userContinue = false;
        do {
            System.out.println("What student would you like to see more information on?");
            String student = scanner.nextLine();

            if (student.equalsIgnoreCase("CodyPalmer1")) {
                System.out.printf("Name: %s%n", cody.getName());
                System.out.printf("Github username: CodyPalmer1%n");
                System.out.printf("Current average: %.2f%n", cody.getGradeAverage());
                System.out.println();
            } else if (student.equalsIgnoreCase("kidCorey10")) {
                System.out.printf("Name: %s%n", corey.getName());
                System.out.printf("Github username: kidCorey10%n");
                System.out.printf("Current average: %.2f%n", corey.getGradeAverage());
                System.out.println();
            } else if (student.equalsIgnoreCase("Crisalmendarez")) {
                System.out.printf("NAME: %s%n", cristian.getName());
                System.out.printf("Github username: Crisalmendarez%n");
                System.out.printf("Current average: %.2f%n", cristian.getGradeAverage());
                System.out.println();
            } else if (student.equalsIgnoreCase("CasTheDude")) {
                System.out.printf("Name: %s%n", cas.getName());
                System.out.printf("Github username: CasTheDude%n");
                System.out.printf("Current average: %.2f%n", cas.getGradeAverage());
                System.out.println();
            } else if (!student.equalsIgnoreCase("CodyPalmer1") || !student.equalsIgnoreCase("kidCorey10") || !student.equalsIgnoreCase("Crisalmendarez") || !student.equalsIgnoreCase("CasTheDude")) {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\"%n", student);
            }

            System.out.println("Would you like to see another student?");
            String anotherStudent = scanner.nextLine();
            if (anotherStudent.equalsIgnoreCase("y") || anotherStudent.equalsIgnoreCase("yes")) {
                userContinue = true;
            } else if (anotherStudent.equalsIgnoreCase("n") || anotherStudent.equalsIgnoreCase("no")) {
                userContinue = false;
                System.out.println("Goodbye, and have a wonderful day!");
            }
        } while (userContinue);
    }
}
