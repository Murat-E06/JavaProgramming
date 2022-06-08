package day44_Abstraction.employeeTask;

public final class Tester extends Employee {//1.employee ye extend yaptık o da persona uzandığı için persona yapmadık
    //böylece hem employee den hem de onun zerinden persondan çekecek daha zengin olacak!!
    //7.en son olarak final ilave ettik inherit yapılamayacak artık

    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {//5. intellij tavsiyesi ile const ilave ettik başlık satırı error line
        super(name, age, gender, id, jobTitle, salary);
    }


    @Override
    public void work() {//2. kırmızı çizgi zerinde iken(extends satırında) intellij tavsiyesi implement metods seçtik
        System.out.println(getName()+" is testing the app.");//3.
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleps 8 hours");//4
    }

    public void bugReport(){//6. ilave metod yaptık testera özel
        System.out.println(getName()+" is creating bug reports");
    }

    //to stringe gerek yok hepsini parent ten çekiyor ilave edecek bir şey yok!!!




}
