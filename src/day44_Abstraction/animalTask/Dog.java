package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable {

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public  void bark(){
        System.out.println(getName()+" is barking");
    }



    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }

    public void play(){//we add public access mod. to interface method
        System.out.println(getName()+" is playing with ball");
    }
}
/*
Dog
eat(): eats Pizza
 */