package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //craete a variable that capable enough to contains 5 names

        String[] myGroup = new String[5];//if we know count but not know how to names
        System.out.println(Arrays.toString(myGroup));//[null, null, null, null, null]
        myGroup[0] = "Ali";
        myGroup[1] = "Ahmet";
        myGroup[2] = "Zeynep";
        myGroup[3] = "Murat";
        myGroup[4] = "Mehmet";

        System.out.println(Arrays.toString(myGroup)); // ["Ali","Ahmet","Zeynep","Murat","Mehmet"]
        System.out.println("--------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday"};//we know count and names
        // index:             0         1            2           3         4         5           6

        System.out.println(Arrays.toString(days));

        int number = 5;
        if (number < 1 || number > 7) {
            System.err.println("Invalid Number");
        }
        System.out.println(days[number - 1]);//Friday, it returns order, does not index number
        System.out.println("---------------------------------------");

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Nov", "Oct", "Dec"};
        //index:            0       1       2      3     4      5...                                       11
       /*int n = 12;

        if (n < 1 || n > 12) {
            System.err.println("Invalid Number");
        }
        System.out.println(months[n - 1]);
        */
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }
        System.out.println("-----------------------");
        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);

        }



    }
}
