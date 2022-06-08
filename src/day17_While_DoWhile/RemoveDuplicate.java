package day17_While_DoWhile;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "AABBCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);//"A","A","B","B,"C","C
            if (result.contains(ch)) {//***eğer bir üüst satırı string ol.değiştirmeseydik burada contains(""+ch) da yapabilirdik. takıldığın yerde "" ilave et.
                continue;//skip, (break means exit)
            }
            result += ch;

        }
        System.out.println(result);


    }
}
