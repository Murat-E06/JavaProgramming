package day36_Inheritance.employee;

public class ITCompany {
    public static void main(String[] args) {

        Tester tester=new Tester();
        tester.setInfo("Murat",'M',46,"SDET",1606,1500,"Philips");
        tester.test();//Murat is testing
        System.out.println(tester);//Employee{name='Murat', gender=M, age=46, jobTitle='SDET', id=1606, salary=1500.0, companyName='Philips'}

        Developer developer=new Developer();
        developer.setInfo("Zeynep",'F',26,"Junior Developer",381,3500,"Sony");
        developer.code();
        System.out.println(developer);

    }
}
