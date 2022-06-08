package day12_Scanner;

// import java.util.*;//* means wild import: imports everything (more storage and more cost)(use in replit)

import java.util.Scanner;//regular import:imports one class

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int num = scan.nextInt();
        String result = "";

        if (num >= 1 && num <= 7) {
            result = (num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" : (num == 4) ? "Thursday" :
                    (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday";

        } else {
            result = "invalid number";
        }
        System.out.println(result);

        scan.close();// after close scanner closed if it does not used scanner  runs, does not stop until close methot.


    }
}
