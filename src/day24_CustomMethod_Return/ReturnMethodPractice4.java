package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {
        String str = "cccccdddddaaaaabbbbb";
        str = removeDuplicates(str);
        System.out.println(str);

    }
    //Remove duplicate and create new value: aaabbcc==>abc aproach: loop da çevir eğer resultta yoksa ilave et!

    public static String removeDuplicates(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {//ilk etapta result boş ilk ch gider sonra olmayan gider.
                result += each;             //devamı.. each e +"" ilave etmeseydik hata veriyordu. stringe ch atmak için sihirli dokunuş!!
            }
        }
        return result;

    }



}

