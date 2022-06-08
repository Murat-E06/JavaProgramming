package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 8, 8, 8, 8, 8, 8, 8));//asList method+adAll method!
        System.out.println(list);

        list.removeAll(Arrays.asList(3, 5, 8));//removeAll+asList method! all 3,5 and 8
        System.out.println(list);
        System.out.println("-------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(100, 200, 300, 400, 500, 600, 700, 100, 200, 300, 800, 900));

        list1.retainAll(Arrays.asList(100, 200, 300));//we want to keep those numbers
        System.out.println(list1);//[100, 200, 300, 100, 200, 300]
        System.out.println("-----------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET", "Developer", "QA", "SDET", "Scrum MAster", "BA", "BA"));

        jobTitles.retainAll(Arrays.asList("QA", "SDET"));
        System.out.println(jobTitles);
        System.out.println("----------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 8, 9, 10));

        boolean r1 = nums.contains(10);
        System.out.println(r1);

        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);//contains?2,5,10

        boolean r3 = nums.containsAll(Arrays.asList(2, 5, 10));//true

        boolean r4 = nums.containsAll(Arrays.asList(2, 5, 10, 1000));//false

        System.out.println("r1 = " + r1);
        System.out.println("r1 = " + r1);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("--------------------------------");

        String[] names = {"Ali", "Veli", "Oya", "Naz", "Can"};

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));//we convert primitives array to do arraylist!!
        System.out.println(nameList);
        System.out.println("----------------------------");

        // int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); we cant use this it gives error, bunu custom method ile loop çevrimi ile yapacağız

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));//ancak bu şekilde yapabiliriz INteger!

        System.out.println(list2);
        System.out.println("-------------------------------------");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));//we used custom method
        System.out.println("list3 = " + list3);


    }
    //convertArrayToArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;


    }


}
