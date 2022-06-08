package day43_Abstraction;

import java.util.Scanner;

public class Throw_vs_Throws {

    public static void main(String[] args) {

        System.out.println("Enter your score:");
        int score=new Scanner(System.in).nextInt();

        if(score<0||score>100){
            throw new RuntimeException("Invalid score: "+score);//exit(1)
        }
        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }if(score>=70){
            System.out.println("C");
        }else if(score>=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
      //  method1(); burada throws keyword kull. icin methodda çağırdığımızda hata veriyor try catch olsaydı vermeyecekti

    }
    public static void method1() throws InterruptedException {
        Thread.sleep(5000);

    }





}
