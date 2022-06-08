package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {
        //15~45 same line
        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");

        }
        System.out.println();//hello yazısını alt satıra yazdırmak için
        System.out.println("Hello");
        System.out.println("---------------------------");

        //100 99 98....50
        for (int i = 100; i >= 50; i--) { // < > >= <= operators we use for loop
            System.out.print(i + " ");
        }
        System.out.println();//bir alt satıra geçmek için daha sonraki komutlarda
        System.out.println("----------------------");

        // print all the even numbers between 1~55

        /*second sol:
        for (int i = 2; i <= 54; i += 2) {
            System.out.print(i + " ");
        }*/
        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }
}
