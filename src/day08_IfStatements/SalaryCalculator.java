package day08_IfStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50,
                weeklyHours = 45; //aralara virgül konularak tek satırda da gösterilebilir! int yazmaya gerek yok eğer her ikisi de int ise!
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax =$" + stateTax);
        System.out.println("Federal tax =$" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Net income = $" + salaryAfterTax);

       /*
        3. create a class SalaryCalculator
        3.1 declare the fallowing variables
        hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

        3.2 use given info in above variables to calculate the fallowings:
        1. salaryBeforeTax
        2.stateTax
        3.federalTax
        4.salaryAfterTax

        Hint: salaryBeforeTax=hourlyRate*weeklyHours*52
        */
    }
}
