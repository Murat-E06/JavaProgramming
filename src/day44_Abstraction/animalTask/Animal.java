package day44_Abstraction.animalTask;

public abstract class Animal {//10.aşağıdaki eat metodu abstract yaptığımız için burayı da abstract yaptık ve error kaybolur!!

    private String name;//1.
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public final static boolean canBreath;//2.
    //final:sabit olan özelliklerle ilgili. türü, rengi sabit ama yaşı değil!!
    //static: özelliğin tekrar sayısıyla ilgili. Sadece 1 tekrar 2. bir tekrarı yok ise pi, canlı, nefes almak vb

    static {
        canBreath=true;
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {//5.
        setName(name);
        this.breed = breed;
        if(!(gender=='M'||gender=='F')){//6.
            throw new RuntimeException("Invalid gender "+gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.color = color;
    }

    public String getName() {
        return name;
    }//3. //6 getter

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {//4.//but 3 setter
        if(name.isEmpty()){//7.
            throw new RuntimeException("Invalid name");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public final void drink(){//8.final metod ilave ettik ve diğer classlarda değiştirilmesini istemiyoruz sabit!!
        System.out.println(name+" "+breed+" drinks water");
    }

    public abstract void eat();//9.abstract ilave ettik her hayvan farklı şeyler yiyor ve kendi classlarında tanımlayacağız

    public String toString() {
        return getClass().getSimpleName()+ "{" +//11.Animal yerine getClass().getSimpleName() kullandık ki her sınıfta kendi ismi çıksın diye
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
    /*
    Create an abstract class named Animal:

        Variables:
        name, breed(final), gender(final),age, size, color(final)
        Encapsulate all the fields
        Add a constructor that can set all the fields
        Methods:
        eat(); ==> different animals eat different foods
        drink() ==> all the animals drink water
        toString() ==> to display the full info of the animal
         */



