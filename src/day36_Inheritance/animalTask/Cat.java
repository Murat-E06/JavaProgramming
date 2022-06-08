package day36_Inheritance.animalTask;

public class Cat extends Animal {//Cat Is An Animal: Is A relationship

    public void scratch(){
        System.out.println(name+" is scratching");
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }




}

//Cat has 6 vars and 6 methods(from the Animal class)+2 methods own= total 8methods
