package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setInfo("Max","Kangal",'M',5,"Medium","Grey");

        dog.eat();
        dog.sleep();
        dog.move();
        dog.bark();
        // dog.hunt(); error
        System.out.println(dog);

        Cat cat=new Cat();
        cat.setInfo("Pisi","Van",'F',1,"Small","White");

        cat.eat();
        cat.move();
        cat.drink();
       // cat.bark(); error
        cat.scratch();
        System.out.println(cat);

        Tiger tiger=new Tiger();
        tiger.setInfo("Khan","Bengal",'F',4,"Large","Brown");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
      //  tiger.bark(); error
        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);





    }
}
