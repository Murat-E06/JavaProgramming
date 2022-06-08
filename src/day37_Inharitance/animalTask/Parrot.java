package day37_Inharitance.animalTask;

public class Parrot extends Animal{

    public String parrotWingColor;//eğer bunu sonradan ilave etmek istersek

    public Parrot(String name, String bread, char gender, int age, String size, String color) {
        super(name, bread, gender, age, size, color);
        this.parrotWingColor=parrotWingColor;
    }
    public void speak(){
        System.out.println(name+" is speaking");
    }


}
