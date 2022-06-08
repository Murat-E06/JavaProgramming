package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();//ArrayList does not support int (primitive)!!!
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
        System.out.println(list);
        System.out.println("-----------------------");

        ArrayList<String> employees=new ArrayList<>();
        employees.add("Suat");
        employees.add("Ali");
        employees.add("Veli");
        employees.add("Oya");
        employees.add("Naz");
        employees.add("Murat");
        employees.add("Zeynep");

        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(0);
        System.out.println(employees);

        employees.remove(employees.size()-1);//removes last index
        System.out.println(employees);
        System.out.println("------------------------");

        employees.remove("Oya");
        System.out.println(employees);

        boolean r1= employees.remove("Naz");
        System.out.println(employees);

        System.out.println("r1 = " + r1);





    }


}
/*
input:{1,2,3,4,5,6}
output:{2,4,6,8,10,12}
 */