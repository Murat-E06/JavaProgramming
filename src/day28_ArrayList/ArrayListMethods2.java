package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        /*
        int num=1;
        list.remove(num);
        System.out.println(list);
         */
        Integer num = 200;
        // list.remove(num);
        boolean r1 = list.remove(num); //if it removes it returns true
        System.out.println(list);

        Integer num2 = 2000;
        boolean r2 = list.remove(num2);//false

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("----------------------------");

        System.out.println(list.size());//6
        list.clear();

        System.out.println(list.size());//0
        System.out.println(list);//[]
        System.out.println("----------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');//0
        int b = characters.lastIndexOf('A');//4

        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------------");

        boolean r3 = characters.contains('A');

        boolean r4 = characters.contains('Z');

        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("--------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);//false
        System.out.println(list1.equals(list2));//true
        System.out.println("--------------------------");

        boolean r5 = list1.isEmpty();
        System.out.println("r5 = " + r5);//false
        list1.clear();
        boolean r6=list1.isEmpty();
        System.out.println("r6 = " + r6);//true
        System.out.println("--------------------------");

        ArrayList<Integer>numbers=new ArrayList<>();
        //Bulk Operations: CollectionType
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(numbers);





    }
}
