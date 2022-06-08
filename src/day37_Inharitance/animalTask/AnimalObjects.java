package day37_Inharitance.animalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog("Alex","terier",'F',2,"small","white");
        //bir önceki konuda burada setInfo ile giriyorduk şimdi buna gerek kalmadı!!
        System.out.println(dog1);
        dog1.bark();

        Cat cat1=new Cat("Miyaw","Ankara",'F',0,"XS","White");
        System.out.println(cat1);
        cat1.scratch();

        Parrot parrot1=new Parrot("Hello","Madagascar",'M',4,"Large","Orange");
        System.out.println(parrot1);
        parrot1.speak();




    }
}
