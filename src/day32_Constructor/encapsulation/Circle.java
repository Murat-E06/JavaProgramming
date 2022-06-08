package day32_Constructor.encapsulation;

public class Circle {

    private double radious;

    public static double pi;

    static {
        pi=3.14;
    }

    public Circle(double radious) {
        setRadious(radious);//0 ve - sayıları almasın diye setter ı burada kullandık!!
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        if(radious<=0){
            System.err.println("invalid radious");
            return;
        }
        this.radious = radious;
    }

    public double calcArea(){
        return pi*radious*radious;
    }

    public double calcPerimeter(){
        return 2*pi*radious;
    }

    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                "area=" + calcArea() +
                "perimeter=" + calcPerimeter() +
                '}';
    }
}

/*
Create a class named Circle
private variables:
radius
public variable:
pi
 Encapsulate all the private fields
 1. radius of the circle can not be zero or negative
 Add a constructor that can set the raidus of coircle when circle object is created
Methods:
calcArea()
calcPerimeter()
toString()
 */