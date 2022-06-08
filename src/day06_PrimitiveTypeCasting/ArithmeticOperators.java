package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10+20); //30,
        System.out.println("12"+(6+1)); //127, concatenation

        System.out.println(100-20); // 80 subtraction
        System.out.println(10*5); // 50 multiplication

        /*
        in math: 10/4=2.5
        in java: 10/4=2 (int can not include decimal)
            if result expected decimal we should use one number with decimal
            10.0/4=2.5 in java
         */
        System.out.println(100/3);//33
        System.out.println(100/3.0);//33.33333
        System.out.println(10/4); // 2
        System.out.println(10.0/4);  //2.5
        System.out.println(10d/4);  //2.5
        System.out.println("--------------------");

        int a = 100;
        double b = a/6; //16.0

        double c = a/6.0;  //16.6666
        System.out.println(c); // 0r

        double c1 = a/6d;
        System.out.println(c1); // or

        double c2 = (double)a/6;
        System.out.println(c2);



    }
}
