package day31_Constructors;

public class Rectangle {

    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {//ilave başka bir parametreye ihtiyaç olsaydı parantezin içinde tanımlayacaktık!! olmadığı içi boş!!
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +//bu ikisini biz ilave ettik yukarıdakini kopyalayıp değiştirdik!!
                ", perimeter=" + calculatePerimeter() +

                '}';
    }



}
/*
Attributes:length,width
Add a const. to fields
Actions:
calculateArea
calculatePerimeter
toString
 */