package day08_IfStatements;

import javax.lang.model.SourceVersion;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {
        /*
        1. Write a program that can swipe two variables value by using a temporary variable
        if a=10, b=15
        output: a=15, b=10
         */
        int a = 10;
        int b = 15;
        //-----------------------------
        int c = b;
        b = a;
        a = c; //b ye eşitleyemiyoruz çnkü b artık 10 oldu o yüzden 3. bir int atadık c diye daha önceden onu b ile aynı yaptık.
        //---------------------
        System.out.println("a = " + a);//15
        System.out.println("b = " + b);//10

        //task: you will the same answer to use without int c

        /*
        1. write a program that can swipe two variables' value by using a
temporary variable
    Ex:
        if d= 10, e=15
    output:
        d = 15
        e = 10
         */
        int d = 10;
        int e = 15;
        int g = b;
        d = e;
        e = g;
        System.out.println("d = " + d);
        System.out.println("e = " + e);


    }
}
