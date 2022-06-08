package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s = 865;
        /*

        if (s >= 0 && s <= 100) {

            if (s >= 60) {
                System.out.println("Passed");//String
            } else {
                System.out.println("Failed");//String
            }

        } else {
            System.out.println("Invalid score");//String all off them string we use ternaries
        }
         */

        String result = (s >= 0 && s <= 100) ? (s >= 60) ? "Passed" : "Failed" : "Invalid score";
        System.out.println(result);


    }
}
