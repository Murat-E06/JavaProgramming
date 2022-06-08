package day43_Abstraction.carTask;

public final class Tesla extends Car{//1.final ve extend yaptık comp error devam


    public Tesla( String model, String color, int year, double price) {//3
        super("Tesla", model, color, year, price);
    }

    public void start() {//2.kırmızı error zerinde iken implement methods seçtik ve overrideı sildik oraya yukarıya const. ilave ettik
        System.out.println("Say \"Start\"");
    }

    public void autopilot(){//4. ilave ek özelliği burada oluşturduk
        System.out.println(getBrand()+" "+getModel()+" has autopark feature");
    }



}
/*
Tesla extends Car:
start(): Say "Start"
 */
