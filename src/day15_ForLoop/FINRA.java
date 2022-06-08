package day15_ForLoop;

public class FINRA {
    public static void main(String[] args) {
        /*
        1~100
        output:1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA...
        also interview question
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }


    }
}
