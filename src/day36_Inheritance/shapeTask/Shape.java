package day36_Inheritance.shapeTask;

public class Shape {//parent

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.err.println("Name can not be null");
            System.exit(1);//0:terminate, nothing went wrong, 1:something went wrong
        }
        if(name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }

        this.name = name;
    }//setter getter ı biz ilave ettik private name i public name e dönstürdük..
    //..ve if cond. ilave ettik ki yanlıs birsey girilmesin diye..kontrol, guvenlik..

    public Shape(String name) {
      // this.name = name; yerine setter ile yukarıda belirlediğimiz için const.da oto.ol. gelen this i değiştiriyoruz
        setName(name);
    }


    public double area(){
        return 0;//in order to change area in the other classes. we cant declare all the other shapes areas in here
    }

    public double perimeter(){//if we use private there no way to change it to others shapes formulas
        return 0;
    }

    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +//biz ilave ettik olusturduğumuz metodlar
                ", perimeter='" + perimeter() + '\'' +//biz ilave ettik
                '}';
    }
}
/*
Shape:
variables:
name
Encapsulate the field
Add a constructor to set the filed
Methods:
area(){}
perimeter(){}
 */