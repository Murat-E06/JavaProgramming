package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a = false;

        for (int i = 0; a; ) {
            System.out.println("Wooden Spoon--for Loop");
        }
        System.out.println("---------------------");
        while (a) {
            System.out.println("Wooden Spoon--while Loop");
        }
        System.out.println("--------------------");

        do {
            System.out.println("Wooden Spoon--do-while Loop");//This is interview question which is writes one time under this cond.
        } while (a);


    }
}
