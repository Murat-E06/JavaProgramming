package day32_Constructor;

public class CarObjects {
    public static void main(String[] args) {

        Car car1=new Car("Toyota");
        Car car2=new Car("Honda","Accord");
        Car car3=new Car("VW","Golf",2014);
        Car car4=new Car("Audi","A6",2020,55000);
        Car car5=new Car("BMW","X5",2022,75000,"Blue");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);






    }
}
