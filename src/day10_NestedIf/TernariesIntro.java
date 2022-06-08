package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;
        if (n % 2 == 0) {
            System.out.println("Even"); // String
        } else {
            System.out.println("Odd"); // String
        }
        System.out.println("------------------------");

        String result1 = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("----------------------");
        int age = 23;
        /*
        if (age >= 21) {

            System.out.println("Eligible"); //String (solution 1)
        } else {
            System.out.println("Not eligible");//String
        } */

        // System.out.println((age>=21)? "Eligible":"Not eligible"); (solution 2)

        String result2 = (age >= 21) ? "Eligible" : "Not eligible"; // (solution 3 is recomended by Muhtar)
        System.out.println(result2);

        System.out.println("------------------------------------");
        int number = 100;
      /*
        if(number>0){
             System.out.println("positive");//String
        }else if(number<0){
            System.out.println("negative");//String
        }else{
            System.out.println("zero");//String
        }
       */
        String result3 = (number > 0) ? "positive" : (number < 0) ? "negative" : "zero";
        System.out.println(result3);


    }
}
