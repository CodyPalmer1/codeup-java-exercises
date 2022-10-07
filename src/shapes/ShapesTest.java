package shapes;
public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        Square myShape = new Square();
        Rectangle myShape = new Rectangle();

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}