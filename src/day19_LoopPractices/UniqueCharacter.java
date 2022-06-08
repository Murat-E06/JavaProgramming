package day19_LoopPractices;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str="aabccdeef";
        String result="";//"bdf"

        for (int j = 0; j < str.length(); j++) {

            char ch=str.charAt(j);
            int count=0;

            for (int i = 0; i <str.length() ; i++) {//compares the outer loop picked each character and count
                char each=str.charAt(i);
                if(ch==each){
                    count++;

        }
            }
            if(count==1){//if(count>1) equals not unique, duplicated)
                result+=ch;
            }
        }
        System.out.println("result = " + result);


    }
}
