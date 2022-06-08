package day45_Abstraction.shape;

public class Pentagon extends Shape{

    private double side;

    public Pentagon( double side) {
        super("Pentagon");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 5*side;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
