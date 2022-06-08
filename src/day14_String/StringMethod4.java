package day14_String;

public class StringMethod4 {
    public static void main(String[] args) {
        String str = "Cydeo";
        String str2 = str.repeat(4);
        System.out.println(str2);//CydeoCydeoCydeoCydeo

        String s1 = "Wooden Spoon ";
        String s2 = s1.repeat(100);
        System.out.println(s2);
        System.out.println("-----------------");

        System.out.println("FADY\n".repeat(6));
        System.out.println("--------------------");

        String name = "Java";
        System.out.print((name + " ").repeat(5));


    }
}
