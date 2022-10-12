package shapes;
public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public void setLength(double length) {
        this.length = this.width;
    }

    public void setWidth(double width) {
        this.width = width;
//=======
//        public double getPerimeter () {
//            return 0;
//        }
//
//        public double getArea () {
//            return 0;
//        }
//
//        public void setLength ( double length){
//
//        }
//
//        public void setWidth ( double width){
//
//>>>>>>>e56097a0e0cf39a05547b8d1629bae7f728761ef
        }
    }
//}
