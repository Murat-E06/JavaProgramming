package day06_PrimitiveTypeCasting;

public class BirthDay {
    public static void main(String[] args) {
        /*
        name, birthDay(int), birthMonth(String), birthYear(int)
        output: John was born on 25/April/1995.
         */
        String name = "John";
        int birtDay = 25;
        String BirtMonth = "April";
        int birthYear = 1995;

        System.out.println(name + ", " + "was born on " + birtDay + "/" + BirtMonth + "/" + birthYear + ".");
        System.out.println("------------------");

        // My favorite book is "Animal Farm"

        String bookName = "Animal Farm";

        System.out.println("My favorite book is \"" + bookName + "\""); //   \" is escape sequence
        System.out.println(" Murat");
        System.out.println("\"Murat\"");
        System.out.println("'Murat'");
        System.out.println("\'Murat\'");

    }
}
