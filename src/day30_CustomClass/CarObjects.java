package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("VW", "Passat", "White", 2014, 30000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Audi", "A6", "Red", 2023, 50000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Ferrari", "F1", "Red", 2010, 100000);
        System.out.println(car3);

        //in order to store we can use array or arraylist

        //Car[]cars={car1,car2,car3}; there ara some disadvantages ad or remove diffucult

        ArrayList<Car> carList = new ArrayList<>();//string int yerine Car kullanıyoruz its rule
        carList.addAll(Arrays.asList(car1, car2, car3));
        for (Car each : carList) {  //to iterate to inside carList
            System.out.println(each.brand + " : " + each.price);//3 arabanın girilen bilgilerini verir!!
        }
        System.out.println("-----------------------------------------------");

        /*
        we want to recall:
        VW:2014~2018
        Ferrari:2005~2015
         */
        carList.removeIf(p -> p.brand.equals("VW") && p.year >= 2014 && p.year <= 2018);
        carList.removeIf(p -> p.brand.equals("Ferrari") && p.year >= 2005 && p.year <= 2015);




    }


}
