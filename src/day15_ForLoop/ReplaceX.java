package day15_ForLoop;

public class ReplaceX {
    public static void main(String[] args) {
        String str = "xcodeX";
        String result = str.replace('x', 'a').replace("X", "a");//if we use str later we must give another string name for exmple result
        System.out.println(result);


    }
}
/*
input:xcodeX
output:acodea
 */
