package day45_Abstraction.shape;

public abstract class Shape {//5.add abstract


    private final String name;//1

    public Shape(String name) {
        this.name = name;
    }//3

    public String getName() {
        return name;
    }//2

    public abstract double area();//4

    public abstract double perimeter();

    @Override
    public String toString() {//6
        return //getClass().getSimpleName() +//7."Shape{" yerine yazdık. her şeklin ismini otomatik alsın diye
                //ama sonra iptal ettik circle ın to string metodu için buradan override ettik super keyword ile
                //o yüzden getClass satırına ihtiyaç olmadı circle da name circle diye çıkıyor zaten otomatic
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +//biz ilave ettik her şeklin bir alanı ve çevresi olur.
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
