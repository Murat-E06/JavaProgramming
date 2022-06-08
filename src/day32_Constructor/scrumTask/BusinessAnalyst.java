package day32_Constructor.scrumTask;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);//jobtitle belli ol icin girdik
    }

    public void analyze(){
        System.out.println(name+" is analyzing documents");
    }
}
