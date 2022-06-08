package day17_While_DoWhile;

import java.util.Scanner;

public class LogInGood {
    public static void main(String[] args) {
        //username:"Cydeo"
        //password:"Cydeo123"
        //total attemp 3 otherwise invalid ...
        //****There is a good question***

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = scan.next();
        System.out.println("Enter your password");
        String passWord = scan.next();


        if (userName.equals("Cydeo") && passWord.equals("Cydeo123")) {
            System.out.println("Looged in");
        } else {
            int attemp = 3;//3,2,1(last chance)
            while (!(userName.equals("Cydeo") && passWord.equals("Cydeo123")) && attemp > 0) {
                if(attemp==1){
                    System.out.println("THIS IS YOUR LAST CHANCE");// :)
                }
                System.out.println("Incorrect usename or password, please re-enter");
                System.out.println("Enter your username");
                userName = scan.next();
                System.out.println("Enter your password");
                passWord = scan.next();

                attemp--;
            }
            if (userName.equals("Cydeo") && passWord.equals("Cydeo123")) {
                System.out.println("Logged in");

            } else {
                System.out.println("Your account locked");
            }
            scan.close();//that is important to use end or after all scan stat. used!!!


        }
    }
}
