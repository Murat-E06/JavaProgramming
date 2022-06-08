package day43_Abstraction.carTask;

public final class Audi extends Car {//final atadık eğer bu class başka class a inherit edilmeyecekse burası parent olmayacaksa
    //burada yazılanlar değişmeyecekse final olmasında sakınca yok!!

    public Audi( String model, String color, int year, double price) {//1. comp error devam ediyor
        super("Audi", model, color, year, price);
    }


    public void start() {//2. Ta ki bu metodu olusturunca kadar. comp error kalkıyor
        System.out.println("Push the start button");
    }

    public void autopark(){
        System.out.println(getBrand()+" "+getModel()+" has autopark feature");
    }
}
/*
Adui extends Car:
start(): push the start button
 */
