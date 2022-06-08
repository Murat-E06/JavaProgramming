package day43_Abstraction.carTask;

public abstract class Car {//9. abstract ı ilave ettik
   private final String brand, model;//1.bu variables değişmeyecek ol. için final atadık (muhtar öyle istedi)
   private String color;
   private final int year;//değiştirilmesini istemiyoruz
   private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
       // this.color = color;
        setColor(color);//4
        if(year<1886){
            throw new RuntimeException("Invalid year: "+year);//6.ÖNEMLİ. aşağıda setter yapamadık(final) burada aynı if stat
                                                            //kullanabiliyoruz exception halini amma this.year dan önce!!!
        }
        this.year = year;
        setPrice(price);//5
    }

    public String getBrand() {
        return brand;
    }//2.getter

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {   //3. seter. final olanlar için setter atanmıyor getter atanıyor.
        this.color = color;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price: "+price);//System.exit(1) yerine exception kullandık daha güzel :)
        }
        this.price = price;
    }

    public void stop(){//7 sadece 1 çeşit stop ol için abstract yapmadık
        System.out.println("Press the brake");
    }
    //--------------Abstraction now starting below------------------

    public abstract void start();//8. start 3 farklı çeşit ol. için abstraction kull. metodun body si {} olmuyor comp. error veriyor
                                //kurtulmak için 2 yol var 1.class abstraction olacak (burada onu yaptık yukarıda class dan önce ilave ettik 2.interface?
//burada metodun baslıgını atıyoruz body yok içini child classta dolduruyoruz yani bir nevi child classa izin burada veriliyor
    //içeriğini onlara bırakıyoruz!!

    @Override
    public String toString() {//10
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
/*
Car Task:
abstract Car:
make, model, color, year, price....
start();
stop()
Honda extends Car:
start(): twist the key to ignition
Adui extends Car:
start(): push the start button
Tesla extends Car:
start(): Say "Start"
 */