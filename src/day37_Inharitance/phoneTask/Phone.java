package day37_Inharitance.phoneTask;

public class Phone {
//parent class: only contains comon features!!!
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery;

    //İnstead of setInfo metod we add constructor to set all the fields below
    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
        //buraya statici ilave etmiyoruz çnk bunlar object belki 100 defa copy edilecek sarı siyah ucuz phalı kçk, büyük
        //vb. fakat hasBattery sadece 1 copy o da true gerek yok buraya yazmaya...
    }

    static {
        hasBattery = true;
    }

    public void call(long phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= $" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
