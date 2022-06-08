package day50_Collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEven {
    public static void main(String[] args) {
        Set<Integer>set=new LinkedHashSet<>(Arrays.asList(1,2,3,4,5,100,90,80,75,45,35,25,15));

      //  set.removeIf(p->p%2==0); this is with lambda exp. sol but we want to sol.that with iterator

      Iterator<Integer> it =set.iterator();//when we create this we get hasnext, next and remove method
        while (it.hasNext()){
            if(it.next()%2==0){
                it.remove();
            }
        }

        System.out.println(set);//[1, 3, 5, 75, 45, 35, 25, 15]

    }
}
