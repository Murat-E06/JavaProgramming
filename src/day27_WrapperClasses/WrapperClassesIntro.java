package day27_WrapperClasses;

import utilities.ArraysUtility;

import javax.swing.text.Utilities;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        int num1 = 200;
        //Long n1=num1;=>error
        Integer n1 = num1; //autoboxing

        int num2 = n1; //unboxing

        System.out.println("---------------------");

        Integer integerValue = 100;
        long longValue = integerValue;

        Byte b1 = 25;
        byte a1 = b1;
        short a2 = b1;
        int a3 = b1;
        long a4 = b1;

        System.out.println("------------------");

        int num3 = 200;
        //Long l2=num3; =>error
        //Double d1=num3;=>error
        Integer num4 = num3;//autoboxing

        System.out.println("--------------------");

        Integer z = 900;
        Integer y = z;

        System.out.println("-----------------------");

        int[] numbers1 = {1, 2, 3, 4, 5, 3, 3};
        Integer[] numbers2 = {1, 2, 3, 4, 5};

        int a = ArraysUtility.frequencyOfElement(numbers1, 3);
        System.out.println(a);//3


    }
}
