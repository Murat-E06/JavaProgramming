package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota=new Toyota("Corolla",2002,20000,"Gray",200000);

        Tesla tesla=new Tesla("Model S",2022,94900,"Red",0);

        BMW bmw=new BMW("X5",2021,75000,"White",20000);

        toyota.start();//Twist the key to ignition to start Toyota Corolla
        tesla.start();//Say "Start" to start Tesla Model S
        bmw.start();//Call mechanic to jump start BMW X5
        //car class ta start methodu oluşturduk, araba modellerinin hepsini içinde
        //modifiye ettik (overriding) kendi start özellikleri farklı ol. icin ayrıca
        //rıght click>generate>override>start seçtik ve print stat ilave ettik!!
        //burada start ol. yazdırdığımızda kendi özelliklerindeki start ları yazıyor car clas daki start cmlesini değil!!


    }
}
