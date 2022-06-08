package day36_Inheritance.shapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        // Square square=new Square(-4);
        //  System.out.println(square);//Invalid side and Process finished with exit code 1

        Square square = new Square(10);
        System.out.println(square);//Square{side=10.0, area='100.0', perimeter='40.0'}
        //square in to string methodda area ve perimeter tanımladığımız için bunları da yazdı!!
        System.out.println("-----------------------------");

      //  Rectangle rectangle = new Rectangle(6, -4);
      //  System.out.println(rectangle);//Invalid width: -4.0

        Rectangle rectangle=new Rectangle(6,4);
        System.out.println(rectangle);//Rectangle{length=6.0, width=4.0, area='24.0', perimeter='20.0'}

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());//10.0

        System.out.println(rectangle.getName());//Rectangle direk yazamıyoruz name private ol. için getter setter yaptığımız için

        System.out.println("----------------------------------");

        Circle circle = new Circle(4);
        System.out.println(circle);//Circle{radius=4.0, pi='3.14', area='50.24', perimeter='25.12'}

        circle.setRadius(15.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);//Circle{radius=15.5, pi='3.14', area='754.385', perimeter='97.34'}

        System.out.println(circle.getName());//Circle


    }
}
