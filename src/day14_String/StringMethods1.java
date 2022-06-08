package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "   EU   08    ";
        str1 = str1.trim();
        System.out.println(str1);//"EU   08"
        System.out.println("-------------------");

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");//first o=9
        System.out.println("n2 = " + n2);

        String str3 = "Java Programming Language";
        int n3 = str3.indexOf("ag");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g ");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("g");//it gives last g, it starts to right to left from string
        System.out.println("n5 = " + n5);
        System.out.println("------------------------------");

        String s = "Java Nova Cava Wawa orange";
        //int fourthA=s.indexOf("ava W");   result:11
        // int fourthA = s.lastIndexOf("av");  // 11
        int fourthA = s.indexOf("Ca") + 1;        //11
        System.out.println("fourthA = " + fourthA);

       // int fifthA = s.lastIndexOf("va") + 1;  result: 13
        int fifthA=s.lastIndexOf("a W");
        System.out.println("fifthA = " + fifthA);    //13


    }
}
