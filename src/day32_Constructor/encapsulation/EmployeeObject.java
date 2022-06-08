package day32_Constructor.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

       Employee employee1=new Employee("",'Q',-20,-3500);
        System.out.println(employee1);////Employee{name='null', gender= , age=0, salary=0.0}
//girilen değerler Employee class taki tanımların dışında olduğu için yazmadı avantaj!!
//more controll and more secure (setter & getter)

        Employee employee2=new Employee("Ali",'M',72,3500);

        System.out.println(employee2);//Employee{name='Ali', gender=M, age=72, salary=3500.0}

        employee2.setAge(32);
        System.out.println(employee2);//age now 32 and more flexible

        employee2.setSalary(employee2.getSalary()+1500);
        System.out.println(employee2);//Employee{name='Ali', gender=M, age=32, salary=5000.0}
    }


}
