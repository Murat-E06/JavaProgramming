package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Zeynep");
        Student student2 = new Student("Ahmet", 'M');
        Student student3 = new Student("Murat", 11);
        Student student4 = new Student("Ali", 11, 'B');
        Student student5 = new Student("Oya", 'F', 22);
        Student student6 = new Student("Nur", 'F', 33, 655);
        Student student7 = new Student("Fatma", 'F', 44, 345, 'A');

        System.out.println(student1==student2);

        Student[]students={student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));


    }



}
