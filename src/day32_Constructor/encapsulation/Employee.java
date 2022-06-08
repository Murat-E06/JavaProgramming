package day32_Constructor.encapsulation;

public class Employee {

    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
       // this.name = name;
        setName(name);//burada aşağıdakileri tanımladık ki şartları sağlayanları kullanalım
       // this.gender = gender;
        setGender(gender);// more security
       // this.age = age;
        setAge(age);
        //this.salary = salary;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            return;
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            return;//exit
        }
        this.gender = gender;//this stat. will exwcuted when if cond. is false!!
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if (age < 16 || age > 90) {//it gets much more secure!!!
            return;
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            return;
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
/*
Create an Employee Class:
private variables:
name, gender, age, salary
Encapsulate all the private fields
1. Name can not be empty
2. gender can not anything other than female or male
3. age can not be less than 16, and greater than 90
4. salary can not be zero or negative
 */