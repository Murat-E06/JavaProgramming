package day30_CustomClass;

public class Dog {
    //no need to main method, because we dont print any value in this method

    //every single attributes are objects:
    public String name;
    public String bread;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name=dogName;
        bread=dogBreed;
        age=dogAge;
        gender=dogGender;
        size=dogSize;
        color=dogColor;
    }

    //actions are methods
    public void eat(){
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }

    public String toString() {//how we create it:right click, Generate, toString, çeki kaldır, ok. dog object class ta yazdırabilmek için
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
Attributes:
name,age,gender,breed,size,color

Actions:
eat(),play(), bark()

 */