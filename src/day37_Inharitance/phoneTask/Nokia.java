package day37_Inharitance.phoneTask;

public class Nokia extends Phone{
    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfdefence(){
        System.out.println("You can use "+brand+" "+model+" as a self defence tool :)");
    }



}
/*
Methods:
call
text
selfdefence()
toString()
 */