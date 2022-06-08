package day40_FinalKeyword;

public class Zoo {
    public static void main(String[] args) {
        Dog dog=new Dog("Dunya","kangal","M","grey","Medium","two");

        System.out.println(dog.getName());
        System.out.println(dog.getGender());

        dog.drink();
    }
}
