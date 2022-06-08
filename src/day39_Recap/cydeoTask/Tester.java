package day39_Recap.cydeoTask;

public class Tester extends Employee{//not person extends employee

    //Only the constructor can call the other constructor muhtar says a lot
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");

    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is tasting");
    }
}

/*
Create a sub class of Employee named Tester
Override the work method
Extra methods:
createTicket()
 */
