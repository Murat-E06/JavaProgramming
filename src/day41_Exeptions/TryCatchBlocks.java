package day41_Exeptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test started");


        try {//it jumps to the catch block
            System.out.println(9 / 0);//gives ArithmeticException
            System.out.println("Try Block");//it does not write
        } catch (ArithmeticException e) {//e constant we use any letter



                System.out.println("Catch Block");
                System.out.println("ArithmeticException was occured");
            }

            System.out.println("Test1 completed");
            System.out.println("----------------------------------");
            System.out.println("Test2 started");


            int[] numbers = {1, 2, 3, 4, 5};
            try {
                System.out.println(numbers[200]);
            } catch (RuntimeException e) {//RuntimeException covers all exception types it is constant, e stands for exception
                // System.out.println("Catch Block");
                // System.out.println("RuntimeException was occured");
                e.printStackTrace();//it is very usefull and preferred method instead of above writen.
                //it gives full detail whwn we need this details while we are working in it comp.

                // System.out.println(e.getMessage());//Index 200 out of bounds for length 5

               }

                System.out.println("Test2 completed");
                System.out.println("----------------------------------");

                System.out.println("Test3 started");

                try {

                    System.out.println("Cydeo".substring(2, 0));
                } catch (RuntimeException e) {//tabloda başlık kısmında ol için diğer exceptionları da kapsıyor parent gibi
                    e.printStackTrace();//just for get a report
                }
                System.out.println("Test3 completed");
                System.out.println("------------------------------");

                System.out.println("Hello");
                try {
                    Thread.sleep(3000);//we use short cut what intellij gives us while undelined red error line

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Cydeo");
                System.out.println("-----------------------------------------------");

                // FileInputStream file=new FileInputStream("File path");//while red underlined line we use intellij advice to use try catch than..

                try {
                    FileInputStream file = new FileInputStream("File path");//we use it near future
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.println("Test completed");
                System.out.println("---------------------------------");

                try {
                    System.out.println("Java".charAt(-1));
                } catch (RuntimeException e) {
                    e.printStackTrace();
                }




        }
    }

