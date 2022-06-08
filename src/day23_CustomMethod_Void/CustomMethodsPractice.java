package day23_CustomMethod_Void;

public class CustomMethodsPractice {
    public static void main(String[] args) {

        helloWorld5Times();

        System.out.println("-----------------------");

        helloCydeo5Times();

        System.out.println("-----------------------");

        evenNumbers();


    }

    //create a func. that can  print hello world 5 times==>helloWorld5Times()
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }//once created custom method finally minimize it!!

    //create a func. that can  print hello Cydeo 5 times==>helloCydeo5Times()
    public static void helloCydeo5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    //create a func. that can  print all the even numbers from1~10==>evenNumbers
    public static void evenNumbers(){
        for (int i = 2; i <=10 ; i+=2) {
            System.out.print(i+" ");
        }
    }


}
