package day00_Ders;

import java.util.Scanner;

public class FreqOfAnything {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter whatever you want");//ndcn lkdlkjd dıkjdljq lkdjlkjd dKlKLk
        String str = scan.next();

        scan.nextLine();

        System.out.println("Enter lookFor"); //lk
        String lookFor = scan.nextLine();

        int freq = 0;

        for (int i = 0; i <= (str.length() - lookFor.length()); i++) {

            if (str.substring(i, (i + lookFor.length())).equalsIgnoreCase(lookFor)) {
                freq++;
            }
        }
        System.out.println(freq);

    }
}
