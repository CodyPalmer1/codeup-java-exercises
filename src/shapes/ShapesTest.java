package shapes;
public class ShapesTest {
    public static void main(String[] args) {
<<<<<<< HEAD
        Measurable myShape = new Rectangle(2, 5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        myShape = new Square(5, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
=======
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
>>>>>>> e56097a0e0cf39a05547b8d1629bae7f728761ef
    }
}