package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        //CapitalOne is a bank

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok", 12364);
        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();//Your available balance is 1000.0

        account1.withdraw(900);
        account1.checkBalance();//Your available balance is 100.0
        System.out.println("-----------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Zeynep", 45775758);

        account2.deposit(15000);
        account2.checkBalance();


    }
}
