package day19_LoopPractices;

public class DuplicatedCharacters {
    public static void main(String[] args) {
        String s="abcccddeef";
        String result="";



        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);

            for (int j = i+1; j <s.length() ; j++) {
                char ch2=s.charAt(j);
                if (ch==ch2) {

                    result+=ch2;
                    break;
                }
            }

            }
        System.out.println(result.charAt(0));
        }
    }

//Write a program that can return the first duplicated character from a string