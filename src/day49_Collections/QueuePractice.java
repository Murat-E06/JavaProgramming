package day49_Collections;
import java.util.*;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("priorityQueue = " + priorityQueue);//priorityQueue = [10, 40, 300, 200, 90] random order!!

        Queue<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("arrayDeque = " + arrayDeque);//arrayDeque = [10, 200, 300, 40, 90] insertion order

        Queue<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println("linkedList = " + linkedList);//linkedList = [10, 200, 300, 40, 90] insertion order

        System.out.println("-------------------------------------------------");

        priorityQueue.poll();//poll:first element will be remove

        System.out.println("priorityQueue = " + priorityQueue); // priorityQueue = [40, 90, 300, 200] the others random

        arrayDeque.poll();

        System.out.println("arrayDeque = " + arrayDeque);//arrayDeque = [200, 300, 40, 90] first element removed the others insertion order

        linkedList.poll();

        System.out.println("linkedList = " + linkedList);//arrayDeque = [200, 300, 40, 90] first element removed the others insertion order

        System.out.println("-------------------------------------------------");

        // System.out.println(priorityQueue.get(1));
        //  System.out.println(arrayDeque.get(1));

        //   System.out.println( ( (List)linkedList ).get(1) );

        System.out.println(((LinkedList<Integer>) linkedList).get(1));//300 downcasting to LinkestList


    }


}
