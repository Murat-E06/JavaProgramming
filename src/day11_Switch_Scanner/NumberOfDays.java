package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        /*
        NumberOfMonths
        28 Days:2
        30 Days:4,6,9,11
        31 Days:1,3,5,7,8,10,12

        if(1~12){

        }else{
        ınvalid
        }
         */
        int number = 12;
        int year = 2000;

        if(number>=1 && number<=12){
            switch (number){
                case 2:
                    if(year%4==0){//we can convert to ternaries.
                        System.out.println("29 Days");//in order to use one prnt stst. we create String result="";
                    }else{
                        System.out.println("28 Days");
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 Days");
                    break;

                    default:
                    System.out.println("31 Days");
            }

        }else {
            System.out.println("Invalid");
        }


    }
}
