package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
    //*****we convert to String to ArrayList*****
        String str="aaabcccdeeef";

        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));//String i direk arrayliste atamadığımız için split ile parçalayarak attık
        System.out.println("list = " + list);//list = [a, a, a, b, c, c, c, d, e, e, e, f]

        System.out.println("------------------------------------");
        //second sol
        String str2="aaabcccdddeeegggggghiiiiiikkkkkjlm";

        String[]arr=str2.split("");

        ArrayList<String>list2=new ArrayList<>(Arrays.asList(arr));
        System.out.println("list2 = " + list2);//[a, a, a, b, c, c, c, d, d, d, e, e, e, g, g, g, g, g, g, h, i, i, i, i, i, i, k, k, k, k, k, j, l, m]

        String unique="";

        for (String each : list2) {
           int freq=Collections.frequency(list2,each);
            if(freq==1){
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);//unique = bhjlm

    }
}
