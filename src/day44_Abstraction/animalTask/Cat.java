package day44_Abstraction.animalTask;

public final class Cat extends Animal implements Playable{//1 extend //5. add final
//2. metod override
// 3. add constructor to short cut intellij

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eats biryani");
    }

    public void meow(){//4.
        System.out.println(getName()+" is Meowing");
    }


    @Override
    public void play() {
        System.out.println(getName()+" is playing rope");
    }
}
/*
Cat
eat(): eats Biryani
 */