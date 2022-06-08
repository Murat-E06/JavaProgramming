package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName=studentName;
        schoolName="Cydeo School";
    }

    static {
        schoolName="Cydeo School";
    }

}

class CydeoStudentObject{//aynı cass içinde 2 class olusturduk hem const. hem de object classes

    public static void main(String[] args) {
         CydeoStudent student1=new CydeoStudent("Ali");
         CydeoStudent student2=new CydeoStudent("Oya");

        System.out.println(student1.schoolName);//Cydeo School
        System.out.println(student2.schoolName);//Cydeo School
    }




}
