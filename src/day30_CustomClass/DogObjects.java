package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    //we run it so we need main method
    //we can create below items based on Dog.java tanımlamaları
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.bread = "Husky";
        dog1.age = 2;
        dog1.gender = 'F';
        dog1.color = "White";
        dog1.size = "Small";

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.bread = "Kangal";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.color = "Grey";
        dog2.size = "Large";

        Dog dog3 = new Dog();
        dog3.setInfo("Mini", "terier", 3, 'F', "Small", "Black");
        //dog classta set info tanımladık burada çağırdık daha pratik oldu yazmak!!

        Dog dog14 = new Dog();
        dog14.setInfo("baba", "terier", 5, 'M', "Large", "blue");


        System.out.println(dog1);//Dog{name='Lucy', bread='Husky', age=2, gender=F, size='Small', color='White'}
        System.out.println("dog2 = " + dog2);
        System.out.println("dog3 = " + dog3);//dog3 = Dog{name='Mini', bread='terier', age=3, gender=F, size='Small', color='Black'}

        dog1.eat();//Lucy is eating

        dog2.bark();//ACE is barking

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Labrador", 3, 'M', "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog4.setInfo("Sully", "Pit-Bull", 6, 'M', "Large", "Black");

        System.out.println("------------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5, dog14};
        System.out.println(Arrays.toString(dogs));

        ArrayList<Dog> femaleDogs = new ArrayList<>();//we must use loop ...homework...
        ArrayList<Dog> maleDogs = new ArrayList<>();//we must not use loop


    }
}
