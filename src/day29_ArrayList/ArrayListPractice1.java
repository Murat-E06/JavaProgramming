package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"};

        //convering array to arraylist

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() >= 10);
        System.out.println(list);//arraylist

        //converting arraylist to array
        countries = list.toArray(new String[0]);//0 its rule does not matter any other number

        System.out.println(Arrays.toString(countries));//array


    }
}
/*
create array  of string called countries
remove longer than 10 characters from array
 */