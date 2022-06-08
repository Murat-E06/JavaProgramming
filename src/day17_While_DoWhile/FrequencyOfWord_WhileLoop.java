package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Java";
        int countJava = 0;
        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");//it means that delete "Java"
            countJava++;
        }
        System.out.println(countJava);
        System.out.println("------------------------");

        String str2 = "cat cat cat cat cat dog dog CAT CaT";
        str2 = str2.toLowerCase();
        int countCat = 0;
        while (str2.contains("cat")) {
            str2 = str2.replaceFirst("cat", "");// replaceFirst is deleting "cat"s in order and
            countCat++;//counting to deleting cats
        }
        System.out.println(countCat);
        System.out.println("-----------------------------");

        String str3 = "ali ali ali baba baba baba baba";
        int countAli = 0;
        int countBaba = 0;
        while (str3.contains("ali") || str3.contains("baba")) {//both count in same while loop
            if (str3.contains("ali")) {
                str3 = str3.replaceFirst("ali", "");
                countAli++;
            }
            if (str3.contains("baba")) {
                str3 = str3.replaceFirst("baba", "");
                countBaba++;
            }

        }
        System.out.println("countAli = " + countAli);
        System.out.println("countBaba = " + countBaba);
    }
}
