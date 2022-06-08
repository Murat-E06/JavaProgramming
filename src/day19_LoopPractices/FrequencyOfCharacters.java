package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        String result = "";//a2b1c3d1

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);//each character
            int count = 0;
            for (int i = 0; i < str.length(); i++) {//find frequency
                char each = str.charAt(i);//each character
                if (ch == each) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += count;

        }
        System.out.println("result = " + result);
    }
}
