package day00_Ders;

public class StringPIQs {
    public static void main(String[] args) {
        /*
         1. Write a program that can return the initials of the user
    ex:
    cydeo
    school
    output:
    C.S
    Note: Pay attention to the example output
         */
        String first = "cydeo";
        String second = "school";

        System.out.println(first.toUpperCase().substring(0, 1) + "." + second.toUpperCase().substring(0, 1));

        /*
        Second sol:
         char f = first.toUpperCase().charAt(0);
         char l = second.toUpperCase().charAt(0);

        System.out.println(f + "." + l);
         */
        System.out.println("---------------------------------");

        /*
         2. Write a program that can check if the given String is palindrome
        Ex:
        input: Level
        output: true
        input: Anna
        output: true
         */

        String given = "Level";
        String reverse = "";

        for (int i = given.length() - 1; i >= 0; i--) {
            reverse += given.charAt(i);

        }
        if (reverse.equalsIgnoreCase(given)) {
            System.out.println("given is palindrome");
        } else {
            System.out.println(" given is NOT palindrome");
        }
        System.out.println("reverse = " + reverse);
        System.out.println("---------------------------------------------------");
        /*
        3. Write a program that can remove the duplicates from the given String.
        Ex:
        String str = "aaabbcccdeeeff";
        output: "abcdef";
         */
        String str = "aaabbcccdeeeff";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        System.out.println(result);
        System.out.println("------------------------------------");
        /*
        4. Write a program that can reverse a String
        Ex :
        input : Wooden Spoon
        output: noopS nedooW
         */
        String str2 = "Wooden Spoon";
        String reversed = "";

        for (int i = str2.length() - 1; i >= 0; i--) {
           reversed+= str2.charAt(i);

        }
        System.out.println("reversed = " + reversed);
        System.out.println("-----------------------------------------------");
        /*
        5. Write a program that can return the unique characters from a String
        Ex :
        input:  AABCCD
        output: BD
         */
        String str3="AABCCD";
        String unique="";
        for (int i = 0; i <str3.length() ; i++) {
            String ch=""+str3.charAt(i);
           if(str3.indexOf(ch)==str3.lastIndexOf(ch)){
               unique+=ch;
           }

        }
        System.out.println("unique = " + unique);


    }
}
