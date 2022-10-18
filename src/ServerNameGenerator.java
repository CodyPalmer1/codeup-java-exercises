import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjectives = {"Amazing", "Insane", "Separate", "Industrious", "Astonishing", "Eastern",
            "Yelling", "Terrific", "Unaccountable", "Perfecting", "Jolly", "Funny", "Envious", "Habitual"};
    public static String[] nouns = {"Resolution", "Dog", "Chalkboard", "Studio", "Basement",
            "Power", "Work", "Army", "Driver", "Cup", "Variety", "Road", "Phone"};

    public static void main(String[] args) {
        for(int i = 0; i < 20; i++) {
            System.out.println(returnRandom(adjectives) + "-" + returnRandom(nouns));
        }
    }

    public static String returnRandom(String[] inputArr) {
        Random random = new Random();
        return inputArr[random.nextInt(inputArr.length - 1)];
    }

}
