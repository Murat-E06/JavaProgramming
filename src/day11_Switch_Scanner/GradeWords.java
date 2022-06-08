package day11_Switch_Scanner;

public class GradeWords {
    public static void main(String[] args) {
        /*
        a char variable named grade is given. use switch stat.
        'A':excellent
        'B':great job
        'C':good
        'D':passed
        'F':failed
        0ther wise:invalid
         */
        char grade = 'c';
        String result = "";


            switch (grade) {
                case 'A': case 'a':
                    result = "excellent";
                    break;
                case 'B':
                case 'b':
                    result = "great job";
                    break;
                case 'C': case 'c':
                    result = "good";
                    break;

                case 'D': case 'd':
                    result = "passed";
                    break;
                case 'F': case 'f':
                    result= "failed";
                    break;
                default:
                    result = "invalid";

            }


        System.out.println(result);


    }
}
