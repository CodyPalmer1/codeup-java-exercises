package grades;
public class StudentTest {
    public static void main(String[] args) {
        Student cody = new Student("Cody");
        cody.addGrade(80);
        cody.addGrade(80);
//        System.out.println(cody.getGrades());
        System.out.println(cody.getGradeAverage());

        Student corey = new Student("corey");
        corey.addGrade(45);
        corey.addGrade(70);
//        System.out.println(mike.getGrades());
        System.out.println(corey.getGradeAverage());
    }
}
