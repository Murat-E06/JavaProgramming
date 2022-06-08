package day44_Abstraction.employeeTask;

public final class Developer extends Employee{//extends en son da final ilave etti başka bir class ona extend olmayacağı için
//en son final ilave etik it can never be extended any other class anymore
    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);//2
    }

    @Override//3. implement mettod sağ tuşla da oluyor intellij yardımıyla da
    public void work() {
        System.out.println(getName()+" is writing codes");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" sleps 6 hours");
    }

    public void unitTest(){//4
        System.out.println(getName()+" is unit testing");
    }
}
