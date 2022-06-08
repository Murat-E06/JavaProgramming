package day45_Abstraction.shape;

public class Sphere extends Shape implements Volume{

    private double radius;
    static double pi=3.14;

    public Sphere( double radius) {
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid radiud");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public double volume() {
        return 4*pi*radius*radius*radius/3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                super.toString()+
                "radius=" + radius +
                '}';
    }
}
