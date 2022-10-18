package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        int select = displayMenu();
        while(select != 0){
            if (select == 1) { MoviesArray.findAll(); }
            else if (select == 2) { MoviesArray.findAll("animated"); }
            else if (select == 3) { MoviesArray.findAll("drama"); }
            else if (select == 4) { MoviesArray.findAll("horror"); }
            else if (select == 5) { MoviesArray.findAll("scifi"); }
            else { select = displayMenu(); continue; }
            System.out.print("\n\n[0-Exit] Enter Menu Option: ");
            select = Input.getInt();
        }
    }
    public static int displayMenu(){
        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        System.out.println("Enter your choice: ");
        return Input.getInt();
    }
}
