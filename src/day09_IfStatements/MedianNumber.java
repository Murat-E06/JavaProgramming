package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        // a=10, b=15, c=20 write a prog to calculate median number. numbers are different
        int a = 10, b = 15, c = 20;
        // if 3 possibilities there is 3 boolean steatment
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        boolean cIsMedian = !aIsMedian && !bIsMedian;
        //boolean cIsMedian = (c>a && c<b) || (c>b && c<a);

        if (aIsMedian) {
            System.out.println(a + " is the median number");
        }
        if (bIsMedian) {
            System.out.println(b + " is the median number");
        }
        if (cIsMedian) {
            System.out.println(c + " is the median number");
        }
    }
}
