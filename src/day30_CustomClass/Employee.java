package day30_CustomClass;

public class Employee {

    public String name;//first we create manually this section
    public char gender;
    public int age;
    public int id;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;     //****right click,generate,constructor,select all,ok,change name setInfo, add void***
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {//right click,generate,tostring,ok in order to print
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");//finally 7 attributes 3 actions
    }







}
/*
Attributes:
    name,id,gender,age,jobTitle,salary,isFullTime(boolean)
Actions:
    toString():to be able to print each employee object
    setInfo():to be able to set all the attributes
    work():..
 */