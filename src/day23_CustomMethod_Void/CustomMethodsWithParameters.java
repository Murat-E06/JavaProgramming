package day23_CustomMethod_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        oddOrEven(7);//we input number 7 at this stage in the parenthesis
        System.out.println("----------------------------");
        ageOfPerson(2006);
        System.out.println("----------------------------");
        printNumbers(11,23);

    }

    //create a func. that can check if a number odd or even?
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }

    }

    //create a func. that can display the age of person
    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("Your age is: "+age);
    }

    //create a func. that can display all the numbers between x and y
    public static void printNumbers(int x, int y){
        for (int i = x+1; i <y ; i++) {
            System.out.print(i+" ");

        }
    }



}
