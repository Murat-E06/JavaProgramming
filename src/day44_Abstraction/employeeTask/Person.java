package day44_Abstraction.employeeTask;

public abstract class Person {//2. abstract ilave ettik error kalktı//grand parent class
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {//6. change this to sets
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {//4. getter and setter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//5. if use an extra cond. we can ad inside setter
        if(age<=0){
            throw new RuntimeException("Invalid age: "+age);//if cond is true throw stat. implement
        }
        this.age = age;//or if stat. is false (age is valid) this stat implement(apply)
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public abstract void sleep();//1. body yok comp. error var. child class ta body var ve ayrıntısı orada burada sadece izin veriliyor

    public void eat(){
        System.out.println(name+" is eating baklava");//3. herkes için ortaksa abstract yapmıyoruz body çakıp burada tanımlıyoruz ve bitiyor herkes baklava yiyecek
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
