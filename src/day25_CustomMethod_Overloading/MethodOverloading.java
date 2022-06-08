package day25_CustomMethod_Overloading;

public class MethodOverloading {
    public static void main(String[] args) {

        int[] intArray = {5, 6, 0, -1, 3, 4};
        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        char[] charArray = {'E', 'F', 'B', 'A', 'G'};
        System.out.println("----------------------");

        int sum1=sumOfNumbers(10,20);
        System.out.println("sum1 = " + sum1);

        int sum2=sumOfNumbers(10,20,30);

        //int sum3=sumOfNumbers(10,20,30,40);

        double top=sumOfNumbers(3.4,4.4,5.5,6.7);
        System.out.println("top = " + top);

        double sum4=sumOfNumbers(18.2,30.7);

        double sum5=sumOfNumbers(4.5,5.5,6.5);

        double sum6=sumOfNumbers(1.5,2.5,3.5,4.5);
        System.out.println("sum6 = " + sum6);


    }

    public static int sumOfNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return sumOfNumbers(num1, num2, num3) + num4;//we can write also this style
    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return sumOfNumbers(num1, num2, num3) + num4;//we can write also this style
    }


}
