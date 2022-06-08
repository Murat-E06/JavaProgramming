package day03_EscapeSequences;

/*
escape sequences MUST be given with double quote
\n: starts a new line
\t: tab button (paragraph space)
\\: single backward slash == \
\": double quote
 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java\nPyton\nC#");
        System.out.println("--------------------");
        System.out.println("Hello Cydeo How are you today? It's nice to see you all!");
        System.out.println("Hello Cydeo \nHow are you today? \nIt's nice to see you all!");
        System.out.println("-----------------------");
        System.out.println("Java is cool programming language");
        System.out.println("\tJava is cool programming language");
        System.out.println("----------------------");
        System.out.println("/ \\"); // only one backward slash printing
        System.out.println("My name is Laser");
        System.out.println("My name is \"Murat\"");

    }

}
