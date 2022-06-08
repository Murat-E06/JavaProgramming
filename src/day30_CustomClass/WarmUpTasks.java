package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
        //  1.swap to first and last element
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));//convert array of value to the Collection type it must
        Collections.swap(numbers, 0, numbers.size() - 1);

        System.out.println(numbers);
        System.out.println("-------------------------------------");
        /*
        2. input {1,0,2,0,3,0,4,0}
            output {1,2,3,4,0,0,0,0}
            we don't want create another arraylist
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        System.out.println(list);//[1, 0, 2, 0, 3, 0, 4, 0]

        int size = list.size();
        list.removeAll(Arrays.asList(0));//Bulk Op.needs Collections(Arrays.asList(0))
        System.out.println(list);//[1, 2, 3, 4] 0'ları söktük

        int newSize = list.size();

        int totalNumberOfZeros = size - newSize;//kaç tane 0?

        for (int i = 0; i < totalNumberOfZeros; i++) {//o kadar 0'ı sona ilave ettik
            list.add(0);
        }
        System.out.println(list);//[1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println("----------------------------------");
        //2. sol with 2 foreach loop
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));

        ArrayList<Integer>result=new ArrayList<>();//new array

        for (Integer each : list2) {
            if(each!=0){//0 olmayanları ekle
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if(each==0){//şimdi de 0 ları ekle ki sona gitsin ArrayListin size ile ilgili bir sıkıntı yok flexible
                result.add(each);
            }
        }
        System.out.println(result);//[1, 2, 3, 4, 0, 0, 0, 0]
        System.out.println("-----------------------------------------");
        /*
        3. Create the chars, digit, special chars are seperate arrayList
         */
        String str="ABCD123%&@456EFG!";
        ArrayList<Character>chars=new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars);//[A, B, C, D, 1, 2, 3, %, &, @, 4, 5, 6, E, F, G, !]

        ArrayList<Character>letters=new ArrayList<>(chars);

        letters.removeIf(p->!Character.isLetter(p));//letter olmayanları remove yaptık

        System.out.println("letters = " + letters);

        ArrayList<Character>digits=new ArrayList<>(chars);//add all the characters
        digits.removeIf(p->!Character.isDigit(p));//remove the characters that are not digits

        System.out.println("digits = " + digits);

        ArrayList<Character>specialChar=new ArrayList<>(chars);

        specialChar.removeAll(letters);//letters belli olduğu için removeAll kullanabiliyoruz
        specialChar.removeAll(digits);//digits...

        System.out.println("specialChar = " + specialChar);







    }
}
