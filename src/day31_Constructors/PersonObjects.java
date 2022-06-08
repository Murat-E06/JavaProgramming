package day31_Constructors;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Ali", 'M', 72);

        Person person2 = new Person("Ahmet", 'M', 34);

        Person person3=new Person("Zeynep",'F',15);
        person3.age=16;


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);//Person{name='Zeynep', gender=F, age=16}


    }


}
