package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(numbers);//[]

        numbers.add(10);//index 0
        numbers.add(20);
        numbers.add(30);//index 2
        numbers.add(40);//index 3

        numbers.add(2,25);//eskisinin zerine yazmıyor kaydırıyor. Muhtar says it is very usefull!
        System.out.println(numbers);//[10,20,25,30,40]
        System.out.println("-----------------------");

        System.out.println(numbers.size());//5

        int lastIndex=numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);//4
        System.out.println("-----------------------");

        Integer num=numbers.get(2);//25  Integer yerine int de yazsak olurdu:autoboxing
        System.out.println(num);
        System.out.println("----------------------------");

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("--------------------------------");

        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");//[Java, Python, JavaScript, C#, Ruby]
        System.out.println(list);





    }
}
