package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");//casting char to int
        }
        System.out.println();
        System.out.println("-----------------------");

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------");

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------");

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------");

        for (char i = 1; i <= 1000; i++) {
            System.out.print(i + " ");
        }


    }
}
/*
print:
A~Z asci:65~90
a~z asci:97~122
Z~A
z~a
 */