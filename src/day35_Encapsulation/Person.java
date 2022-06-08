package day35_Encapsulation;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {//Muhtar adviced to this static block to asiggn the variables not to above static section at line 9
        planet="Earth";  //if we use multiple times this variables we should use this static block!!
        isHuman=true;  //"even we use only one times we should create static block" said Muhtar!!
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;
    }

    //eğer bir metod olusturacaksak instance kullanıyorsak instance metod, static member kull. isek
    // static metod kullanacağız örneğin;

    public static void printPlanetName(){//static method just one copy!!
        System.out.println("Planet name is "+planet);//planet staic ol. icin burada kullanabiliyoruz static metod
       // System.out.println(name); name instance ol. icin hata veriyor static ol. tanımlayamıyoruz
        //but instance method can also include both instance and static members!!
        //toString method is instance metod
    }

    public void eat(String food){//instance metod multiple copy!!
        System.out.println(name+" is eating "+food);
    }
    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }
    //instance metod belongs to the object not class!!

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +//we can add static members inside the to string method(instance method)
                '}';                            //toString method is instance metod
        //static is clas member, instances belongs to the object, objects has came from class !!
    }
}

/*
Create a class named Person:
Variables:
name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
Add a constructor to initialize all the fields
Add a static block to initialize all the statics
Methods:
printPlanetName() eat(String food) drink(String drink)
toString()
 */
