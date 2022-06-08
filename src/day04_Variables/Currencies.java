package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        /*
        1000$=?liras and euros
        1$=13,5 TRY
        1$=0.86 €
         */
        int dollar = 1000;
        double lira = dollar * 13.5;
        double euro = dollar * 0.86;

        System.out.println("dollars = " + dollar);
        System.out.println("euros = " + euro);
        System.out.println("lira = " + lira);

    }
}
