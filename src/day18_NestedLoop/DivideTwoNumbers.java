package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a = 50, b = 9, count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        System.out.println("division " + count);
        System.out.println("remainder: " + a);


    }

}
/*
***interview question****
write a prog divide two numbers without division and multiplacations
ex:20/6=3 with the reminder of 2
a=20
b=6;
a-=b until a<b (3 times subtruct while a>=b)
 */