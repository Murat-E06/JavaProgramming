package day45_Abstraction.shape;

public class Rectangle extends Shape{

    private double side1,side2,side3,height;

    public Rectangle(double side1, double side2, double side3, double height) {
        super("Rectangle");
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        setHeight(height);
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return side1*height/2;
    }

    @Override
    public double perimeter() {
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", height=" + height +
                '}';
    }
}
