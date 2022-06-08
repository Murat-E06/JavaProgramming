package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name2 = "John";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;
        //&&:both, logical AND

        boolean isEligable2 = creditScore >= 700 && age2 >= 21 && income >= 60000;
        System.out.println(name2 + " is eligable for loan: " + isEligable2);
        System.out.println("----------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'M';
        //||: either, logical OR

        boolean isEligable3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligable to register " + isEligable3);
        System.out.println("-------------------------");

        String name4 = "James";
        String countryOfBirth = "USA";
        boolean meriedToUSCitizen = false;
        boolean iseligible4 = countryOfBirth == "USA" || meriedToUSCitizen == true;

        System.out.println(name4 + " is eligible to apply US citizenship: " + iseligible4);
        System.out.println("-------------------------");

        String student = "Anna";
        double gpa = 2.5;
        int familyIncome = 400000;
        boolean isEligable5 = gpa >= 3.5 || familyIncome <= 60000;
        //false             false

        System.out.println(student + " is eligable for schollarship " + isEligable5); //false
        System.out.println("-------------------------");

        String student2 = "Ali";
        double gpa2 = 2.5;
        int familyIncome2 = 40000;
        boolean isEligable6 = gpa2 >= 3.5 || familyIncome2 <= 60000;
        //     false  |\ true

        System.out.println(student2 + " is eligable for schollarship " + isEligable6); // true
        System.out.println("-------------------------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2; //false
        System.out.println("result3 = " + result3);
        System.out.println("--------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
