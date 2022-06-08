package day39_Recap.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer=new Developer("Ali",33,'M',1949,"Java Developer",110000);

        Tester tester=new Tester("Murat",46,'M',11,"SDET",90000);

        Teacher teacher=new Teacher("Ayten",55,'F',44,"Primary Teacher",100000);

        Student student=new Student("Zeynep",15,'F',381,"Math");

        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(student);
        System.out.println("----------------------------");

        developer.setAge(29);
        System.out.println(developer.getAge());
        System.out.println(developer);
        System.out.println("-----------------------");
        developer.work();
        tester.work();
        teacher.work();
      // student.work(); error student is not an employee
        System.out.println("--------------------------------");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();
        System.out.println("--------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

      // tester.fixingBugs();
        tester.createTicket();
        System.out.println("--------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

      //  teacher.createTicket();
        System.out.println("-------------------------");
        student.eat();
        student.sleep();
        student.drink();

        // student.fixingBugs();
        student.study();




    }
}
/*
Create a class named Cydeo:
create objects of Tester, Developer,Teacher, Student
test all the functions of each objects
Analyze the relationships between the classes
 */