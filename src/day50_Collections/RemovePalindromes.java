package day50_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        Iterator<String> it = names.iterator();//Once we have created iterator than we can use next, hasNext,remove methods now
        //this sol. is without lambda expression for PIQ
        while (it.hasNext()){
            String each= it.next();
            String reverse="";

            for (int i = each.length()-1; i >=0 ; i--) {
               reverse+= each.charAt(i);
            }
            if(each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }
        System.out.println(names);//[Java, Python, Cydeo, Car]
        System.out.println("----------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

/*
        Predicate<String>palindrome=str->{//daha sonraki konu Predicate!!
            String reverse="";
            for (int i = str.length()-1; i >=0 ; i--) {
                reverse+= str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);

        };
        names2.removeIf(palindrome);

 */
        names2.removeIf(str->{ String reverse="";//second sol related to previous section
            for (int i = str.length()-1; i >=0 ; i--) {
                reverse+= str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);}
        );
        System.out.println(names2);//[Java, Python, Cydeo, Car]

    }
}
