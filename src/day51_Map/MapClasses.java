package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //Map ağacındaki btn classları tanımladık!!
        //    key   , value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10,"Artur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Ahmet");
        hashMap.put(5,"Isabella");//when ısabella comes Ahmet goes out because keys are same
        hashMap.put(6,"Ahmet");//keys are different therefore Ahmets are in the list
        hashMap.put(7,"Ahmet");
        hashMap.put(8,"Ahmet");
        hashMap.put(9,null);
        hashMap.put(null,null);
        hashMap.put(null,"Emre");
        hashMap.put(null,"Hulya");

        System.out.println("hashMap = " + hashMap);
        //hashMap = {null=Hulya, 3=Jack, 20=George, 5=Isabella, 6=Ahmet, 7=Ahmet, 40=Emma, 8=Ahmet, 9=null, 10=Artur}

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Artur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(null,"Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);// insertion order
        //linkedHashMap = {10=Artur, 20=George, 3=Jack, 40=Emma, 5=Isabella, null=Hulya}

        Map<Integer, String> treeMap = new TreeMap<>();//does not support null key but value can be
        treeMap.put(10,"Artur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(7,null);
        //treeMap.put(null,"Hulya");
        System.out.println("treeMap = " + treeMap);//treeMap = {3=Jack, 5=Isabella, 7=null, 10=Artur, 20=George, 40=Emma}

        Map<Integer, String> hashtable = new Hashtable<>();////does not support null(key and value)
        hashtable.put(10,"Artur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Ahmet");
        hashtable.put(5,"Isabella");
        //treeMap.put(null,"Hulya");
        System.out.println("hashtable = " + hashtable);//hashtable = {10=Artur, 20=George, 40=Emma, 5=Isabella, 3=Jack}


    }
}
