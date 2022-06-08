package day34_GarbageCollection_AccessModifiers;

import static utilities.MathUtility.*;//sum için import ettik buraya ve aşağıd kullandık metodlerını

public class Test {
    public static void main(String[] args) {
//Circle da oluşturduğumuz static leri burada çalıştırdık!!

        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("----------------------------");

        //find sum of 10,20
        int r1 = sum(10, 20);


        //find sum of 100,200
        int r2 = sum(100, 200);

        int r3=subtract(100,50);

        int r4=max(45,56);

    }
}
