package shapes;
public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square();

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    //
        Measurable myShape1 = new Rectangle();

//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape1.getArea());
    }
}