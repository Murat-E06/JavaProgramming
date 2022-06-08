package day32_Constructor.scrumTask;

public class ScrumMaster extends  Employee{//SM İS AN Employee
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }



}
