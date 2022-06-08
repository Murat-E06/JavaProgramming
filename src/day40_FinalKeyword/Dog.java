package day40_FinalKeyword;

public final class Dog extends Animal{
    public Dog(String name, String breed, String gender, String color, String size, String age) {
        super(name, breed, gender, color, size, age);
    }

    public void eat(){
        System.out.println(getName()+" is eating dog food");
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }

   // public final void drink(){//final method can not be overridden
  //      System.out.println(getName()+" is drinking beer ");
  //  }

}
