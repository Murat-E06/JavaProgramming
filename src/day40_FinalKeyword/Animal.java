package day40_FinalKeyword;

public class Animal {
//first create instance but it gives comp error
    private String name;
    private final String breed;
    private final String gender;
    private final String color;
    private  String size;
    private  String age;

//second after create const. comp error goes
    public Animal(String name, String breed, String gender, String color, String size, String age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }


////--------------getters-------------------
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getAge() {
        return age;
    }
    ////---------------Setter-------------------
//there are 3 setters exclude finals(nonfinals)
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(String age) {
        this.age = age;
    }
    ////-----------------------------------

    public void eat(){
        System.out.println(name+" is eating");
    }

    public final void drink(){//btn hayvanlar için değişmeyen method ol. icin final.can not be override
        System.out.println(name+" is drinking water");
    }


}
