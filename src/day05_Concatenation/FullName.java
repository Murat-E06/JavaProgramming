package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Jimmy";
        String lastName = "King";
        int age = 55;
        String jobTitle = "SDET";
        String companyName = "Aple Inc";
        String fullName = firstName + " " + lastName; // in order to make a space between each names we use " "
        double salary = 100000.58;

        // Full name of the person is.....
        System.out.println("Full name of the person is " + fullName);

        //....is...years old
        System.out.println(fullName + " is " + age + " years old");

        //fullName is jobTitle, works at companyName, and fullName's salary is $salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and "
                + fullName + "'s salary is $" + salary);


    }
}
