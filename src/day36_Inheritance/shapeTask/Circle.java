package day36_Inheritance.shapeTask;

public class Circle extends  Shape{

    private double radius;
    public static double pi=3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid Radius: "+radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle( double radius) {
        super("Circle");
       // this.radius = radius;
        setRadius(radius);
    }

    @Override
    public double area() {
        return pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi='" + pi +'\'' +//biz ilave ettik
                ", area='" + area() + '\'' +//biz ilave ettik olusturduğumuz metodlar
                ", perimeter='" + perimeter() + '\'' +//biz ilave ettik
                '}';
    }
}
/*
Circle extends Shape:
variables:
radius
pi (static)
Encapsulate the field
Add a constructor to set the filed
area(): radius * radius * pi
perimeter(): 2 * radius * pi
toString(): r, pi, area, perimeter
 */
