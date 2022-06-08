package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        System.out.println(list);

        list.removeIf(p -> p < 5);//basic Lambda expresion in java==all the elements in list which are less than 5 will be remove

        System.out.println(list);
        System.out.println("----------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));//remove all even numbers

        list2.removeIf(each -> each % 2 == 0);

        System.out.println(list2);
        System.out.println("-----------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));
        //we want to remove words which starts 'J'

        list3.removeIf(p -> p.startsWith("J"));//p stands for each element

        System.out.println(list3);
        System.out.println("--------------------------------");

        //remove all the NOT palindromes

        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));
        names.removeIf(name-> !StringUtility.isPalindrome(name));

        System.out.println(names);


    }
}
