package day44_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {
        //person ve employee abstract class olduğu için burada objelerini oluşturamıyoruz sadece
        //çocukların object leri olabilir!!!!

        Tester tester=new Tester("Ali",33,'M',1949,"QA",90000);
        Developer developer=new Developer("Zeynep",16,'F',381,"Junior Developer",100000);
        Teacher teacher=new Teacher("Murat",46,'M',1975,"Flight Instructor",120000);
        Driver driver=new Driver("Ahmet",36,'M',1987,"Truck Driver",75000);

        System.out.println("--------------------------------------");

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();//persondan abstraclı(6,8,10,7)
        tester.bugReport();//testera özel
        tester.eat();//persondan sabit(baklava)
        System.out.println("----------------------------------");

        developer.work();
        developer.sleep();
        developer.eat();
        developer.unitTest();
       // developer.bugReport();
        System.out.println("----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();
        System.out.println("----------------------------");

        driver.work();
        driver.sleep();
        driver.eat();



    }


}
