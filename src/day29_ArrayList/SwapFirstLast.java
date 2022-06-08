package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapFirstLast {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,2,3));
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);




    }
}
