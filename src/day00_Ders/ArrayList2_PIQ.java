package day00_Ders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList2_PIQ {
    public static void main(String[] args) {
/*
  1-Write a program that can print the unique elements from the given ArrayList with new ArrayList
  Ex:

  output:[Python, Ruby]

 */
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);//[Java, Java, Java, Python, C#, C#, C#, Ruby, C++, C++]

        ArrayList<String>result=new ArrayList<>();

        for (String each : list) {
            if(list.indexOf(each)==list.lastIndexOf(each)){
               result.add(each);
            }
        }
        System.out.println(result);//[Python, Ruby]
        System.out.println("------------------------------------------");
/*
  2- write a program that can return the FIRST unique elements from an arrayList
        Do not use indexOf && lastIndexOf methods
 */

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D', 'E', 'E','F'));

        for (Character element : list2) {
            int freq=0;
            for (Character each : list2) {
                if(each.equals(element)){
                    freq++;
                }

            }
            if(freq==1){
                System.out.println(element);
                break;
            }
        }
        System.out.println("------------------------------------------");

       //   3- write a program that prints nTh largest number from the given ArrayList

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n=3;

        for (int i = 1; i < n; i++) {
            list3.removeIf(p-> Collections.max(list3)==p);
        }
       int max= Collections.max(list3);
        System.out.println("max = " + max);


    }
}








