package day18_NestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");//total 5*4=20 times
        }
        System.out.println("--------------------------");

        for (int j = 0; j < 4; j++) {//0~3=4 times
            for (int i = 0; i < 5; i++) {//0~4=5 times
                System.out.println("Wooden Spoon");   //total 20 times "nested loop"
            }
        }



    }
}
