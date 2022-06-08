package day45_Abstraction.shape;

public class Cylinder extends Shape implements Volume{

    private double radius, height;
    static double pi=3.14;

    public Cylinder( double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid radius");
        }
        this.radius = radius;
    }

    public void setHeight(double height) {
        if(height<=0){
            throw new RuntimeException("Invalid height");
        }
        this.height = height;
    }

    @Override
    public double area() {
        return 2*pi*radius*(height+radius);
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return pi*radius*radius*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
