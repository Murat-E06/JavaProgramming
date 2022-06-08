package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School(( )!@#$½WoodenSpoon";

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else {
                if (ch != ' ') {//if the space does not a special char.We dont use trim because space in middle
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
