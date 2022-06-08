package day32_Constructor.scrumTask;

public class Tester extends Employee{//Tester IS AN Employee, Tester IS A Person Also


    public Tester(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender, jobTitle, id, salary, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle+" "+name+" is creating ticket");
    }
    //ayrıca toString oluşturmaya gerek kalmadı, employe de olusturduğumuz icin burası orayı kullanıyor
    //ve ilave kendisine ozel variable yok


}
