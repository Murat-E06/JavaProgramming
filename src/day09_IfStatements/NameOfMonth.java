package day09_IfStatements;

public class NameOfMonth {
    public static void main(String[] args) {
        String month;
        int n = 5;

        if (n == 1) {
            month = "January";
        } else if (n == 2) {
            month = "February";
        } else if (n == 3) {
            month = "March";
        } else if (n == 4) {
            month = "April";
        } else if (n == 5) {
            month = "May";
        } else if (n == 6) {
            month = "June";
        } else if (n == 7) {
            month = "July";
        } else if (n == 8) {
            month = "Agust";
        } else if (n == 9) {
            month = "September";
        } else if (n == 10) {
            month = "October";
        } else if (n == 11) {
            month = "November";
        } else {
            month = "December";
        }
        System.out.println("month = " + month);

    }
}
