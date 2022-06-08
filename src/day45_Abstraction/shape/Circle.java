package day45_Abstraction.shape;

public class Circle extends Shape {//5 add extend

    private double radius;//1

    public final static double pi=3.14; //2 and 9 set 3.14 and error goes out

    public Circle(double radius) {//7 right click add constructor
        super("Circle");//8 change name "Circle"
        setRadius(radius);//10 change this to set
    }

    public double getRadius() {
        return radius;
    }//3

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid Radius");
        }
        this.radius = radius;
    }//4


    @Override
    public double area() {//6 add methods
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {//11 to generate to string
        return "Circle{" +
                super.toString()+//12 add super to get area and perimeter to parent (shape) class and dont forget to add +
                "radius=" + radius +
                '}';
    }
}

