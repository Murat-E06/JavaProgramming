package day11_Switch_Scanner;

public class NumberToWordSwitch {
    public static void main(String[] args) {
        //NumberToWord (0~9) use switch stat. to write correct codes.
        int number = 9;
        String result = "";

        if (number >= 0 && number <= 9) {
            switch (number) {
                case 0:
                    result = "zero";
                    break;
                case 1:
                    result = "one";
                    break;
                case 2:
                    result = "two";
                    break;
                case 3:
                    result = "three";
                    break;
                case 4:
                    result = "four";
                    break;
                case 5:
                    result = "five";
                    break;
                case 6:
                    result = "six";
                    break;
                case 7:
                    result = "seven";
                    break;
                case 8:
                    result = "eight";
                default:
                    result = "nine";
                    break;
            }


        } else {
            System.out.println("Invalid Number");
        }
        System.out.println(result);


    }
}
