package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,6,7,7,8,8));

        int n=3;
        for (int i = 1; i <n ; i++) {//n-1 kez çalıştırır ve 2 tane max sayıyı kaldırır eğer n 3 ise
            list.removeIf(p->Collections.max(list)==p);//max i kaldırır!!
        }

        int max= Collections.max(list);
        System.out.println(max);

    }
}
/*
arrayList={1,2,3,4,5,5,6,7,7,8,8}
n=3
output=6
dont use sort method
 */