package day36_Inheritance.shapeTask;

public class Square extends Shape {//child. first declare new additional var(side) than const. setter and getter and than we..
    //... add to extends Shape. when we add extends keywordcompile gives an error.. after we add const. at line 21 it changes normal!!

    private double side;//we will create generate getter and setter
    //developers like to use private they dont like use to public, muhtar said

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Invalid side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

    public Square(double side) { //String name i sildik aşağıda Square ilave ettik
        //super(name);
        super("Square");//ismi burada verdik daha sonra tekrar tekrar girmemek için
        // this.side = side;
        setSide(side);//we use this setter word instead of above to check the  side with if stat. cond.
    }

    @Override
    public double area() {//right clic>override method>click area
        // return super.area();
        return side * side;//we change it. if we dont arrange it square's area returns 0 because the parent class's defination
    }

    @Override
    public double perimeter() {
        return 4 * side;//as the same as above
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area='" + area() + '\'' +//biz ilave ettik olusturduğumuz metodlar
                ", perimeter='" + perimeter() + '\'' +//biz ilave ettik(shape den copy paste yaptık)
                '}';
    }
}

/*
Square extends Shape:
variables:
side;
Encapsulate the field
Add a constructor to set the filed
area(): side * side
perimeter(): side * 4
toString(): side, area, perimeter
 */
