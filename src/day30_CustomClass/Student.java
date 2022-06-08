package day30_CustomClass;

public class Student {

    public String name;//instance variables
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gender, int age,int ID, char grade){//local variables
        this.name=name;//this keyword helps to call  instance variables eğer kullanmazsak local variable default ol. geliyor.
        this.gender=gender;
        this.age=age;
        this.ID=ID;
        this.grade=grade;
        //kısayol to create setInfo sağ tuş, generate, constructor,hepsini seç, ok, ismi setInfo olarak burada değiştir
    }

    public String toString() {//right click generate, to string, unclick,ok enter.
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name+" is coding");
    }
    public void sleep(){
        System.out.println(name+" is sleeping");
    }
    //totally we create 5 attributes and 4 actions



}
