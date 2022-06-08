package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 0 && score <= 100) {
            //  5 condition
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
        System.out.println("---------------------------");

        String result = ""; // Temporary, (we may not use each print statement)

        if (score >= 0 && score <= 100) {
            //  5 condition
            if (score >= 90) { // score<=100 is not necessary because first if controlled it
                result = "Excellent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "invalid score";
        }
        System.out.println("result = " + result);
    }
}


