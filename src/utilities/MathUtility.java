package utilities;

public class MathUtility {

    public static void main(String[] args) {

        double result = MathUtility.cube(3.3);
        System.out.println(result);

    }

    //return the sum of two int numbers
    public static int sum(int num1, int num2) {
        return num1 + num2;

    }

    //return the sum of two decimal numbers
    public static double sum(double num1, double num2) {
        return num1 + num2;

    }

    //return the subtraction of two integers
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    //return the subtraction of two decimals
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    //return the multiplication of two integers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    //return the multiplication of two decimals
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    //passes two double parameters and return the division reslt
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    //check if an integer is even number
    public static boolean isEven(int num) {
        return (num % 2 == 0) ? true : false;
    }

    //check if an integer is odd number
    public static boolean isOdd(int num) {
        return (num % 2 == 1) ? true : false;
    }

    //return the maximum number between two integers
    public static int max(int num1, int num2) {
        return (num1 > num2) ? num1 : num2;
    }

    //return the maximum number between two decimals
    public static double max(double num1, double num2) {
        return (num1 > num2) ? num1 : num2;
    }

    //return the minimum number between two integers
    public static int min(int num1, int num2){
        return (num1<num2)?num1:num2;
    }

    //return the minimum number between two decimals
    public static double min(double num1, double num2){
        return (num1<num2)?num1:num2;
    }

    //can return the square of an integer
    public static int square(int num){
        return num*num;
    }

    //can return the square of an decimals
    public static double square(double num){
        return num*num;
    }

    //return the cube of an integer
    public static int cube(int num){
        return MathUtility.square(num)*num;
    }

    //return the cube of a decimal
    public static double cube(double num){
        return MathUtility.square(num)*num;
    }






}
