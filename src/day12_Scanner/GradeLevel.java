package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        /*given a number (byte) grade level
        1-5 elementary school
        6-8 middle school
        9-12 high school
        13-16 college school
        17-18 grad school

        sol1 switch stat
        sol2 if&switch both
         */
        byte number =10;
        String result ="";
        /*

        if(number>=1&&number<=18){//sol1
            switch (number){
                case 6: case 7: case 8:
                result="middle school";
                break;
                case 9: case 10: case 11: case 12:
                    result="high school";
                case 13: case 14: case 15: case 16:
                    result="college school";
                    break;
                case 17: case 18:
                    result="grad school";
                    break;
                default://1-5
                    result="elementary school";
            }



        }else{
            result="İnvalid number";
        }
        System.out.println(result);

         */
        switch (number){//sol2
            case 1: case 2: case 3: case 4: case 5:
                result="elementary school";
                break;
            case 6: case 7: case 8:
                result="middle school";
                break;
            case 9: case 10: case 11: case 12:
                result="high school";
            case 13: case 14: case 15: case 16:
                result="college school";
                break;
            case 17: case 18:
                result="grad school";
                break;
            default:
                result="invalid number";
        }
        System.out.println(result);



    }
}
