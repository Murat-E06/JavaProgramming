package day49_Collections;

import java.util.*;//btn hepsi için sadece bunu yazabiliyoruz!

public class SetInterfacePractice {
    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        hashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("hashSet = " + hashSet);//hashSet = [null, 200, 40, 10, 90, 300]//no duplicates and random order

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);//linkedHashSet = [10, 200, 300, 40, 90, null]//no duplicates, ordered list

        Set<Integer> treeSet = new TreeSet<>();//very slow
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        treeSet.addAll(Arrays.asList(10, 200, 300, 40, 90));//treeSet = [10, 40, 90, 200, 300]

        System.out.println("treeSet = " + treeSet);//ordered ascending order, does not accept null

    }

}
