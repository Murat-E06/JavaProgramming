package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi=3.14;//burada tanımlayabiliyoruz
    public static String name="Circle";

    public static ArrayList<Integer>numbers;

    //public static Sheet sheet; for excell files in the future not now!!

    public Circle(double radius){
        this.radius=radius;
       // pi=3.14; we dont use statics inside the const. block
    }


    static {
       // radius=5;
        pi=3.14;//eğer birden fazla kullanacaksak burada da tanımlıyoruz (anladığım kadarıyla ?)
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


/*
    public static void main(String[] args) {
        pi=3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    System.out.println("pi = " + pi);
    System.out.println("name = " + name);
    System.out.println("numbers = " + numbers);


 */


}





