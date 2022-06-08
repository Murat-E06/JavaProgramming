package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
//***GOOD Q****
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique = new ArrayList<>();

        for (Integer each : list) {
            int freq = Collections.frequency(list, each);

            if (freq == 1) {
                unique.add(each);
            }
        }
        System.out.println(unique);

        System.out.println("---------------------------------------");

        //second sol. without loop

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);//list2 yi unique in içine attık

        unique2.removeIf(p -> Collections.frequency(list2, p) > 1);//p her elemannın frekansı 1 den byk ise remove kalanlar unique :) anlayana..

        System.out.println("unique2 = " + unique2);


    }
}
