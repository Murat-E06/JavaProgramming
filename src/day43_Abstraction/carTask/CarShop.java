package day43_Abstraction.carTask;

public class CarShop {

    public static void main(String[] args) {

      //  Car car1=new Car("Cydeo","EU8","Orange",2022,100000);
        //We can not create object from abstract class, because abstract class is not concrete(somut)

        Honda honda=new Honda("Accord","Blue",2021,30000);

        Audi audi=new Audi("Q7","White",2019,45000);

        Tesla tesla=new Tesla("ModelS","Black",2023,120000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println("--------------------------------");

        honda.setColor("Red");//color ve price ı sadece değiştirebiliyoruz setter yapmıştık diğerleri final da kalıyor değişmiyor..
        audi.setColor("Pink");//..intellij de vermiyor zaten
        tesla.setColor("Green");

        honda.setPrice(25000);//değişebilir aynı gerekçe
        tesla.setPrice(156000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);





    }



}
