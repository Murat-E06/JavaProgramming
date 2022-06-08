package day31_Constructors;

public class Person {

    public String name;//3 instance variables.
    public char gender;
    public int age;

    public Person(String name, char gender, int age){//1 constructor with 3 parameters, it is similar to setInfo but this is the better
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
