package day08_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        /*
        output:
        200 is positive number: true
        200 is positive number: false
        200 is zero: false
         */
        int number = 200;
        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);

    }
}
