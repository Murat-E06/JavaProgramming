package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {//A~E

            if (i == 'C') {
                continue;//A,B,D,E
            }
            System.out.println(i);

        }
        System.out.println("----------------------");
        //print all even numbers 1~10 with continue stat.
        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);

        }

        System.out.println("--------------------------");
        //print all odd numbers 1~10 with continue stat.
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);


        }
    }
}
