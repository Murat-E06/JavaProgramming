package day49_Collections;
import java.util.*;

public class SetPractice2 {
    public static void main(String[] args) {

        String[] arr = {"Wooden Spoon", "Book", "Pen", "Phone", "Wooden Spoon",
                "Wooden Spoon", "Wooden Spoon", "Wooden Spoon", "Milk", "Eggs", "Coke", "Paper towels"};

        arr = new LinkedHashSet<>( Arrays.asList(arr) ).toArray(new String[0]);
        /*
        Set<String> set1 = new HashSet<>( Arrays.asList(arr));
        arr = set1.toArray(new String[0]);
        System.out.println(set1);
         */

        System.out.println( Arrays.toString(arr));//[Wooden Spoon, Book, Pen, Phone, Milk, Eggs, Coke, Paper towels]
        //linkedHashSet tekrarları atladı yazılış sırasına göre dizdi


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1000, 300, 1000, 200, 300, 400, 500, 500, 600, 10, 10, 20, 30, 40, 30, 20, 10));

        list = new ArrayList<>(  new LinkedHashSet<>(list)  );// new LinkedHashSet<>(list) ifadesini enjecte etiik list ArrayList e

        System.out.println(list);//[1000, 300, 200, 400, 500, 600, 10, 20, 30, 40]
        //no duplicates and ordered


        System.out.println("-----------------------------------------------");

        String[] array = {"A", "A", "B", "C"};

        List<String> s =new ArrayList<>( Arrays.asList(array) );

        s.addAll(  Arrays.asList("E", "F", "G" )  );

        System.out.println("-----------------------------------------------");
        /*
        Given:
            Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
            return the fifth element after removing the duplicates
                        Do not change the order of the elements
         */

        Integer[] nums = {1,2,1,1,2,2,2,3,3,3,3,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        nums = new LinkedHashSet<>(  Arrays.asList(nums) ).toArray( new Integer[0] );
       //1. new LinkedHashSet<>();
        //2. nums= new LinkedHashSet<>(Arrays.asList(nums));// linkedhashSet in içine yukarıdaki array i bu şekilde yerleştirdi
        //ve nums a tekrar atadı
        //3. sonuna toArray( new Integer[0] ) bu ifadeyi ilave etti (collection ı array e çeviriyor)
        // "every single collection converting to the array" 0 size ı belirliyor min olarak atadık (size dynamic)
        //***line 10 da da aynı mantık geçerli!!!

        System.out.println(Arrays.toString(nums) );//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        System.out.println("-----------------------------------------------");

        String str = "eeeeeaaaabbbbccccdddeeeee";
        //  eabcd
        //  54434
        String result = ""; //e5a4b4c4d3//freq of chars
        //we can use LinkedHashSet :)

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
            int count= Collections.frequency(  Arrays.asList(str.split("")) ,  each);
            result += each +count;
        }

        System.out.println(result);//e10a4b4c4d3


        System.out.println("----------------------------------------------------------");

        Set<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Ahmet", "Ahmet", "John", "James", "Breanna", "Shay", "Ahmet"));

        System.out.println( names.toArray(new String[0])[2] );//James, convert to string array from the setArray to have an index number

        System.out.println( new ArrayList<>(names).get(4)  );//Shay

        System.out.println("-----------------------------");

        for(String each : names ){
            System.out.println(each);
        }

    }
    }

