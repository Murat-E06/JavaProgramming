package day39_Recap.cydeoTask;

public class Student extends Person {//not employee extends person because student is not an employee it Is A Person


    private int studentID;
    private String fieldOfStudy;

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void study(){
        System.out.println(getName()+" is studying");

    }

    public String toString() {
        return "Student{" +
                " name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}



/*
Create a sub class of Person named Student
Extra variables:
studentId, fieldOfStudy
Encapsulate all the fields
Add a constructor to set all the fields
Encapsulate all the fields
Methods:
study()
 */
