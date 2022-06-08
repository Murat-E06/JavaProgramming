package day50_Collections;

import java.util.*;

public class IterablePractice {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //  remove all the elements that are less than 4

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < 4){
                list.remove(i);
            }
        }

        System.out.println(list);//[2, 4, 5, 2, 4, 5, 2, 4, 5] iterator olmadan dzgn çalışmaz çnk arraylistin size ı dynamic olduğu için her
        //remove da i değeri değişiyor ve aradan kaçak olabiliyor (2) gibi!!

        System.out.println("===================================================");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        //  remove all the elements that are less than 4

        Iterator<Integer> it = list2.iterator();

        /*
        boolean r1 = it.hasNext();
        System.out.println(r1);
        System.out.println(it.next());
        boolean r2 = it.hasNext();
        System.out.println(r2);
        System.out.println(it.next());
    */

        while(it.hasNext()){//has: is element var.when we declared iterator while loop is best option said muhtar
            if( it.next()  < 4 ){//next: varsa sıradakini al
                it.remove();
            }
        }

        System.out.println(list2);//[4, 5, 4, 5, 4, 5]

        System.out.println("===================================================");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for( Iterator<Integer> i=list3.iterator() ; i.hasNext() ; ){
            if(i.next() < 4 ){
                i.remove();
            }
        }

        System.out.println(list3);//[4, 5, 4, 5, 4, 5] forloop solution

        System.out.println("===================================================");

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list4.removeIf( each ->  each < 4 );

        System.out.println(list4);//[4, 5, 4, 5, 4, 5] easier method lambda exp. method





    }

}
