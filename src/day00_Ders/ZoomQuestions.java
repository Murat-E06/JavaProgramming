package day00_Ders;

import java.util.Scanner;

public class ZoomQuestions {
    public static void main(String[] args) {
        freqAll("flskjflksj","f");




    }
        public static void freqAll(String string, String word){

        int freq=0;

        for (int i = 0; i <=string.length()-word.length() ; i++) {

            if(string.substring(i,i+word.length()).equalsIgnoreCase(word)){
                freq++;
            }

        }
            System.out.println(freq);
    }


}
