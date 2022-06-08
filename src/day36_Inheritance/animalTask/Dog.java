package day36_Inheritance.animalTask;

public class Dog extends Animal {//we add extends Animal because "Dog Is An animal"
    //      child       parent
    //extend in importtan farkı: importta Animal dan ödünç alabilir özellikleri, extend de Animalın özelliklerine kendiliğinden sahip oluyor
    //import:barrowing, extend:owning

    public void bark(){
        System.out.println(name+" is barking");
    }




}
/*
dog class has:
6 variables
6 methods
but we cant see. we write 3 lines of code but it has may be 100 lines codes from the animal class
 */