package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantagesOfThrowsKeyword2 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        method1();//it gives FileNotFoundException. we use right click the red cross line error it adds automaticly FileNotFoundException
        method2();
        method3();//it gives InterruptedException. we use right click the red cross line error it adds automaticly InterruptedException
        //this is not the best sol.



    }

   public static void method1()throws FileNotFoundException {
       new FileInputStream("");
   }
   public static void method2()throws FileNotFoundException{
       method1();
   }
   public static void method3()throws FileNotFoundException, InterruptedException{
       method2();
       Thread.sleep(1000);
   }
   public static void method4()throws FileNotFoundException,InterruptedException{
       method3();
   }

}
