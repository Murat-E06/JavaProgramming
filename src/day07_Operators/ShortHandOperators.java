package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        // assigment: =
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number); //200


        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "wooden Spoon";
        System.out.println("word = " + word);

        word = "Cydeo";
        System.out.println("word = " + word); // variables always remember last initialize value
        System.out.println("----------------------------");

        //Additional assignment
        int x = 100;
        System.out.println(x + 200); //300// but x hala 100. 100 ü değiştirmeden 300 yaptık
        x += 200;
        System.out.println(x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str); //concatenation

        double num1 = 2.5;
        num1 += 5.5;
        System.out.println("num1 = " + num1); //8 addition

        double availableBalance = 1000.50;
        // deposit 300$
        availableBalance += 300; // 1000.50+300=1300.50$
        System.out.println("availableBalance = " + availableBalance);
        //withdrawing 500$
        availableBalance -= 500; // availableBalance= 1300.500=800.5
        //withdrawing 200$ and depositing 400$
        availableBalance -= 200; //800.5-200=600.5
        availableBalance += 400; //600.5+400=1000.5
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("---------------------------------");
        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *= 2; //salary= salary*2 ikisi de olur ilki daha kısa. 2 ile çap sonucu salary olarak ata!
        System.out.println("salary = " + salary);

        double doge = 0.000000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);
        System.out.println("-----------------------------");

        double num2 = 25000.0;
        //num2= num2/2 burada da 2 ye bölüyoruz ama num2 25000.0 olarak devam ediyor.
        num2 /= 2; // num2 2 ye bölünüyor ve yeni değer 12500.0 olarak atanıyor.
        System.out.println("num2 = " + num2);
        System.out.println("-----------------------------------");
        double num3 = 100;
        num3 %= 3; // 100/3 den kalan 1 i num3 olarak atar.
        System.out.println("num3 = " + num3);
        System.out.println("-----------------------------------");
        int amaunt = 127; //cents, quarters? and cents?

        int quarter = amaunt / 25;
        int cent = amaunt % 25;

        System.out.println("quarter = " + quarter);
        System.out.println("cent = " + cent);
        System.out.println("------------------------------");
        int y = 300;
        y %= 16;
        System.out.println("y = " + y);// y=300/16 dan kalan 12


    }
}
