package day08_IfStatements;

public class SchoolType {
    public static void main(String[] args) {
        /*
        Given a number(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
Assume that the given number is 1 ~ 18
         */
        byte age = 14;
        boolean elementary = age >= 1 && age <= 5;
        boolean middle = age >= 6 && age <= 8;
        boolean high = age >= 9 && age <= 12;
        boolean college = age >= 13 && age <= 16;
        boolean grad = age >= 17 && age <= 18;
        if (elementary) {
            System.out.println("Ahmet is in Elementary school");
        }
        if (middle) {
            System.out.println("Ahmet is in Middle school");
        }
        if(high){
            System.out.println("Ahmet is in High school");
        }
        if(college){
            System.out.println("Ahmet is in College");
        }
        if(grad){
            System.out.println("Ahmet is grad");
        }
    }
}
