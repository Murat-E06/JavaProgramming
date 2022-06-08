package day35_Encapsulation.deviceTask;

public class Phone extends Device {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if(size<=0){
            System.out.println("Invalid size");
            System.exit(1);
        }
        this.size = size;
    }

    public Phone(String brand, String model, double price, double size) {
        super(brand, model, price);
        setSize(size);
    }
    public void faceTime(long phoneNumber){
        System.out.println(getBrand()+" "+getModel()+" can call "+phoneNumber+" with face time");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + getBrand() +
                ", model='" + getModel() +
                ", price=$" + getPrice() +
                ", has battery=" + hasBattery +
                ", has power button=" + hasPowerButton +
                ", size=" + size +
                '}';
    }
}
/*
Create a subclass of Device named Phone:
Extra Methods:
call(long phoneNum), text(long phoneNum)
 */
