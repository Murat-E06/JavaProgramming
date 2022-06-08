package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "David", "Ahmet", "Can", "Oya", "Ahmet", "David"));

        //ahmet ve david kalsın diğerleri gitsin

        employees.retainAll(Arrays.asList("Ahmet", "David"));//direk yazamıyoruz.Collections a bağlamak için Arrays.asList ilave etmek gerekiyor
        System.out.println(employees);//arraylist

        System.out.println("-------------------------------");

        String[] names = {"Ali", "David", "Ahmet", "Can", "Musti", "Monica", "Oya", "Ahmet", "David", "Maria", "Meryem", "Mary"};
        //remove starts with M

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));//arrayin içindekileri arrayliste attık

       // list.removeIf(p->p.charAt(0)=='M');

        list.removeIf(p -> p.charAt(0) == 'M');//p, each demek basic lambda exp.
        System.out.println(list);

        names = list.toArray(new String[0]);//toArray ile tekrar arraye çevirdik ve names e atadık
        System.out.println(Arrays.toString(names));//array


    }
}
