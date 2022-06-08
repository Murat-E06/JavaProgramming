package day52_Map_FunctionalInterface;

//lambda:() -> {}

public class Test {
    public static void main(String[] args) {

        //aynı lambda parametresini MyFirstInterface den çağırarak [aply(int n)] kullanarak
        // birden farklı methodda farklı amaçlarla kullanabiliyoruz

        //function1: create a func. that can display a number is odd or even

        MyFirstFunctionalInterface oddOrEvenNumber = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is even number");
            } else {
                System.out.println(n + " is odd number");
            }
        };
        oddOrEvenNumber.apply(20);

        //function2:create a func. that can check if a person is eligible to buy alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol = age -> {//tek parametre (n) olduğu için () e ihtiyaç yok optional
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        };
        eligibleToBuyAlcohol.apply(100);

        //function3: create a func. that can display the cube of a number

        MyFirstFunctionalInterface printCube = (n) ->  //tek print stat. varsa {} bunlara gerek yokmuş said muhtar
            System.out.println(n * n * n);

        printCube.apply(3);

        //function4: create a func. that can check if a number is evenly divisible 3 and 5

        MyFirstFunctionalInterface divisibleBy3And5= n -> {
            if(n%15==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else{
                System.out.println(n+" is NOT divisible by 3 and 5");
            }
        };
        divisibleBy3And5.apply(45);


    }
}
