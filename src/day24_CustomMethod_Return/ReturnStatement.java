package day24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {

        nameOfDay(10);

    }

    //4.Display the name of the day based on given number.
    public static void nameOfDay(int number) {
        if(number>1||number<7){
            System.out.println("Invalid");
            return;//exits nameOfDay method, return method also used in void method. use for exiting
        }
        if(number==1){
            System.out.println("Monday");
        }else if(number==2){
            System.out.println("Tuesday");
        }else if(number==3){
            System.out.println("Wednesday");
        }else if(number==4){
            System.out.println("Thursday");
        }else if(number==5){
            System.out.println("Friday");
        }else if(number==6){
            System.out.println("Saturday");
        }else {
            System.out.println("Sunday");
        }




    }




}