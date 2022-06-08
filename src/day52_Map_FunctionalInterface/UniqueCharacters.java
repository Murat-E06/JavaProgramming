package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        //****PIQ****
        String str = "aabcccdeeeef";

        String[] arr = str.split("");//str yi String Array e atıp oradan split le elemanlarına ayıracağız
        //sonrasında Collections daki frequency method ile elemanların freq.ını bulacağız

        Map<String, Integer> result = new LinkedHashMap<>();//insertion order için LinkedHashMAp i seçtik
        //buraya eleman ve tekrar sayısı pairs i oluşturmak için boş bir map olusturduk

        for (String each : arr) {
            //  Collections.frequency(arr,each); //burada arr error veriyor onun için
            int frequency = Collections.frequency(Arrays.asList(arr), each);//burasının returnu int(freq) ol için int e eşitledik
            if(frequency==1){
                result.put(each,1);//result boş mapinin içine unique leri ilave ediyoruz value otomatik 1 oluyor
            }
        }
        System.out.println(result);//{b=1, d=1, f=1}

    }
}
/*
 1. Write a program that can find the unique characters from a String
    Ex:
    str = "aabcccdeeeef";
    output:
    {b=1, d=1, f=1}
 */