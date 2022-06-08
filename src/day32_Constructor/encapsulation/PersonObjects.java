package day32_Constructor.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {
        Person p1=new Person();
        // p1.name="Ali"; //Person class da bunlar private ol. için başka class ta çalışmıyorlar encapsulate yapacağız getter&setter
        //  p1.age="72";
        p1.setName("Ali");
        p1.setAge(72);

      //  System.out.println(p1.name+" : "+p2.age);

        System.out.println(p1.getName()+" : "+p1.getAge());



    }





}
