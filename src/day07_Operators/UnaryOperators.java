package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

    int a = 5;
        System.out.println(--a);// Pre increament:immediately increases=4

        System.out.println(++a);// Pre decreament:immediately decrease=4+1=5
        System.out.println("---------------------");

     int b= 10;
        System.out.println(b++); // post inc. =10 but memory hold 11 for second use;
        System.out.println(b); // 11
        System.out.println(b--); // post dec.=11 but memory hold 10 for second use;
        System.out.println(b-2);// 10-2=8
        System.out.println("---------------------");
      int z =45;
        System.out.println(++z);//46
        System.out.println(z--);//46
        System.out.println(--z);//44

    }
}
