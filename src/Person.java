import java.util.Scanner;

public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person("Joe");
        System.out.println(person.getName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String newName = scanner.nextLine();
        person.setName(newName);
        System.out.println(person.getName());
    }

}