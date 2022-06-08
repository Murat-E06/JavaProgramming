package day35_Encapsulation.deviceTask;

public class MyDevice {
    public static void main(String[] args) {

        Phone phone=new Phone("Apple","iphone 13 Pro Max",1100,6.7);
        System.out.println(phone);

        phone.setPrice(1500);
        System.out.println(phone.getPrice()+" : "+phone.getModel());



    }
}
