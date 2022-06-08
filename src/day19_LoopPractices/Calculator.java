package day19_LoopPractices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int num1=scan.nextInt();

        System.out.println("Enter a math operator");
        char operator=scan.next().charAt(0);
        //String operator=scan.next(); // if we use this sol, we must create also "+" and "-"

        if(!(operator=='+'||operator=='-')){
            System.err.println("Invalid operator: "+operator);
            System.exit(0);//terminate whole prog.
        }

        System.out.println("Enter a number");
        int num2=scan.nextInt();

        if(operator=='-'){
            System.out.println(num1-num2);
        }else{
            System.out.println(num1+num2);
        }

    }
}
