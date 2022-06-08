package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = "Wooden Spoon";//after line 8, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println(str);


        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println("-------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";//Eligible for garbage collection anymore after line 26

        dog1 = new Dog();
        dog1.name = "Max";

        System.out.println(dog1);//Dog{name='Max', bread='null', age=0, gender= , size='null', color='null'}

        String language="Python";//eligible for garbage collection after line 31
        language="Java";

        System.out.println(language);//Java

        System.out.println("-----------------------------");

        ArrayList<Integer>list1=new ArrayList<>();

        list1.add(100);
        ArrayList<Integer>list2=list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);//
        System.out.println(list2);//

        System.out.println(list1==list2);//true there are not eligible for garbage collection

        System.out.println("----------------------------");

        Student student1=new Student("Ali",72,'M','B',1949);
        student1.grade='A';

        Student student2=student1;//burada bir Student object i var 2 tane copy yaptık 1 ve 2 ikisi de aynı aynı odaya açılan 2 kapı bunlar muhteviyat aynı
        student2.name="Ahmet";

        System.out.println(student1);//Ahmet,'A'
        System.out.println(student2);//Ahmet,'A'

        System.out.println("-----------------------------------");

        ArrayList<String>l1=new ArrayList<>();
        l1.add("Java");

        ArrayList<String>l2=l1;//eğer burada eşitlemeseydik ikisi de farkılı room olacaktı fakat eşitlediğimiz için...
        l2.add("Python");

        System.out.println(l1);//[Java, Python]
        System.out.println(l2);//[Java, Python]//...burada farketmiyor iki kapısı olan tek oda gibi oldular!!



    }

}
