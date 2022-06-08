package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#", "Python", "Python","Pascal"};//Unique is C#

        for (int j = 0; j < words.length; j++) {
            String element = words[j];

            int freq = 0;
            for (int i = 0; i < words.length; i++) {//finds the freq.
                if (words[i].equals(element)) {
                    freq++;
                }
            }
            if (freq == 1) {
                System.out.println(element);
            }


        }


    }
}
