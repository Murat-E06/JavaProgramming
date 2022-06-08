package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=
        boolean result1 = 20 > 40; //false
        System.out.println(result1);//sout
        System.out.println("result1 = " + result1);//soutv+enter
        boolean result2 = 300>=150;
        System.out.println("result2 = " + result2);
        boolean result3 = 100>=100;
        System.out.println("result3 = " + result3);


        //credit score = 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >=720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        int score = 59;
        boolean hasFailed = score <= 59; // 59 dan küçük değil fakat eşit (2. önerme) o yüzden has failed "başarısız"
        System.out.println("hasFailed = " + hasFailed);
        System.out.println("------------------------------------");
        int x = 100;
        int y = 200;
        boolean equal = x==y; //false
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar"=="Good Guy"; //false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A'=='a'; // false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java"==" Java  "; //false due to some extra space
        System.out.println("result10 = " + result10);
        System.out.println("---------------------------------");

        boolean result11 = 100!=200; // true
        System.out.println("result11 = " + result11);


    }
}
