package day00_Ders;

import java.util.Arrays;

public class Array2_PIQ {
    public static void main(String[] args) {
         /*
        1-Write a program that can return the unique element from the given array.
        Ex:
            words = {"Aygun", "Aygun", "Oleksandr", "Olga" ,"Adam", "Adam", "Adam", "Cihad", "Cihad", "Max"};
            output = Oleksandr
                     Olga
                     Max
         */
        String[]words={"Aygun", "Aygun", "Oleksandr", "Olga" ,"Adam", "Adam", "Adam", "Cihad", "Cihad", "Max"};

        for (String each : words) {
            int freq=0;

            for (String word : words) {
                if(word.equals(each)){
                    freq++;
                }
            }
            if(freq==1){
                System.out.println(each);
            }
        }
        System.out.println("-----------------------------------");
        /*
        2-Write a program that can merge given arrays
                group1 = {"Ali", "Layan", "Ayşenur"};
                group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};
         */
        String[] arr1={"Ali", "Layan", "Ayşenur"};
        String[]arr2= {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};

        String[]merge=new String[arr1.length+arr2.length];

        int i=0;
        for (String each : arr1) {
            merge[i++]=each;

        }
        for (String each : arr2) {
            merge[i++]=each;
        }
        System.out.println(Arrays.toString(merge));








    }
}
