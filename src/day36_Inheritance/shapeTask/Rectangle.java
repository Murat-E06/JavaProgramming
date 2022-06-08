package day36_Inheritance.shapeTask;

public class Rectangle extends Shape{//third extends Shape

    private double length, width;//first add these

    public double getLength() {//second create getter and setter and insert if stat to setters
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid Length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid width: "+width);
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle( double length, double width) {//Fourth add constructor while comp error under the extends word
        super("Rectangle");//yukarıdaki String name i sildik burada name yerine rect. yazdık
       // this.length = length;
        setLength(length);//biz ilave ettik
       // this.width = width;
        setWidth(width);
    }

    @Override//fiveth generate override method
    public double area() {
       // return super.area();
        return length*width;
    }

    @Override
    public double perimeter() {
        //return super.perimeter();
        return 2*(length+width);
    }

    @Override
    public String toString() {//sixth insert to string method
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +//biz ilave ettik olusturduğumuz metodlar
                ", perimeter='" + perimeter() + '\'' +//biz ilave ettik
                '}';
    }
}

/*
Rectangle extends Shape:
variables:
length
width
Encapsulate the fields
Add a constructor to set the filed
area(): length * width
perimeter(): 2 * ( width + length)
toString(): length, width, area, perimeter
 */
