package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 75;

        if (score >= 0 && score <= 100) {
            //  5 condition, regular if statements
            if (score >= 90) { // score<=100 is not necessary because first if controlled it
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("invalid score");
        }
        System.out.println("----------------------------");
        //Use ternaries to convert to second solution.
        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great"
                : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed" : "invalid score";

        System.out.println(result);
        System.out.println("----------------------------------");
        //soulution 3 muhtar's advice, mixing ternaires and if statements
        String result2 = "";
        if (score >= 0 && score <= 100) {
            result2 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great"
                    : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed";
        } else {
            result2 = "invalid score";
        }
        System.out.println(result2);


    }
}
