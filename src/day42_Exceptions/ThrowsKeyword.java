package day42_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {//throws InterruptedException
        // (we added it to get rid of error underlined sleep  red cross line word

        System.out.println("---------------Test1--------------------");

        System.out.println("Hello");
        Thread.sleep(3000);//right click add .. first option to write oto. throws InterruptedException above
        System.out.println("Cydeo");

        System.out.println("---------------Test1 Completed--------------------");

        System.out.println("---------------Test2--------------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("EU8");

        System.out.println("---------------Test2 Completed--------------------");




    }
}
