package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1=new Student();
        student1.setInfo("Zeynep",'F',15,429874924,'A');
        //System.out.println(student1);

        Student student2=new Student();
        student2.setInfo("Ahmet",'M',34,423424,'B');
        //System.out.println(student2);

        Student student3=new Student();
        student3.setInfo("Mehmet",'M',42,57435,'C');
       // System.out.println(student3);

        Student student4=new Student();
        student4.setInfo("Meryem",'F',14,38765,'A');
       // System.out.println(student4);

        Student student5=new Student();
        student5.setInfo("Ali",'M',72,84755,'C');
        //System.out.println(student5);

        Student[]students={student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("--------------------------------");

        ArrayList<Student>earlyBirds=new ArrayList<>();//'A'-> loop
        ArrayList<Student>angryBirds=new ArrayList<>();

        for (Student student : students) {//burada students.for yaptık bütün öğrenciler orada A olanları 1. arrayListe
            if(student.grade=='A'){
                earlyBirds.add(student);
                }else{
                angryBirds.add(student);
            }
        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        System.out.println(earlyBirds.size());//2


    }

}
