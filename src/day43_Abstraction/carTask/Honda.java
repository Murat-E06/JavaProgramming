package day43_Abstraction.carTask;

public class Honda extends Car {

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }

    public void start(){// metodu oluşturduğumuzda comp. error kayboluyor. overriding sub clasta oluyor ve car clastaki
        System.out.println("Twist to key to ignition");//acces mood. dan daha visible ya da aynı olmak zorunda burada public(en iyi görnen)
    }

    //eğer parent classda 2. bir abst. metod ol. isek burada da aynı metodu ol. gerekecekti tıpkı startta ol. gibi yoksa hata veriyor
    //it is mandatory to implement all abst. to child classes
}
/*
Honda extends Car:
start(): twist the key to ignition
 */