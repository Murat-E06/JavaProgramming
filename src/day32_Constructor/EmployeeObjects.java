package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1=new Employee("Ali");
        Employee employee2=new Employee("Murat",'M');
        Employee employee3=new Employee("Can",'M',"SDET");

        System.out.println(employee1);//Employee{name='Ali', gender= , jobTitle='null', salary=0.0}
        System.out.println(employee2);//Employee{name='Murat', gender=M, jobTitle='null', salary=0.0}
        System.out.println(employee3);//Employee{name='Can', gender=M, jobTitle='SDET', salary=0.0}


    }
}
