package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char[] letters = new char[26];//we want to write eng. alphabet
        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
            // for(int i=0,j='A'; i <letters.length ; i++,j++){ // 2. sol.
            //letters[i]=(char)j;
            // sout stat same
        }
        System.out.println(Arrays.toString(letters));//[A~Z]

        System.out.println("----------------------------------");
        char ch2 = 'Z';
        for (int i =0 ; i <letters.length ; i++,ch2--) {//düzeltilecek!!!!
            letters[i] = ch2;


        }
        System.out.println(Arrays.toString(letters));


    }
}
