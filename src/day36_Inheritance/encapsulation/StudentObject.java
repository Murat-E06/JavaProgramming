package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Ali",2,'E','Z',"Gorele");

        System.out.println(student1);//Student{name='Ali', age=0, gender= , grade= , schoolName='Gorele'}

        Student student2=new Student("Ahmet",29,'M','B',"Keykubat");

        student2.setAge(32);

        System.out.println(student2);//age 32





    }
}
