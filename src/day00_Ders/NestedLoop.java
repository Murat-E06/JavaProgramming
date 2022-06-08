package day00_Ders;

public class NestedLoop {
    public static void main(String[] args) {

        String str = "aabcccd";

        String result = "";

        for (int j = 0; j <str.length() ; j++) {
            int n = 0;

            char ch=str.charAt(j);
            for (int i = 0; i <str.length() ; i++) {

                if(ch==str.charAt(i)){
                    n++;
                }
            }
            if(result.contains(""+ch)){
                continue;
            }

            result+=ch+""+n;
        }
        System.out.println("result = " + result);



    }
}
        /*

        for (int j = 0; j <str.length() ; j++) {

            for (int i = 0; i <str.length() ; i++) {
                char ch=str.charAt(i);
                if(ch==str.charAt(j)){
                    n++;
                }
                if(result.contains(""+ch)){
                    continue;
                }
                result+=ch;
                result+=n;
            }

        }
        System.out.println(result);

        }
    }

         */


 /*
 Write a program that can find the frequency of the characters from a string
 Ex:
 str = "aabcccd";
 output:
 a2b1c3d1
 */
