package day32_Constructor.scrumTask;

public class ProductOwner extends Employee{//PO IS AN Employee
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Product Owner", id, salary, companyName);//jobTitle belli ol icin burada girdik..
    }//..ki daha sonra tek tek girmeyelim



}
