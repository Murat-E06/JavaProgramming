package day39_Recap.cydeoTask;

public class Employee extends Person{

    private int employeeID;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }//bu clas da name  olmadığı person da ol. icin oradan get ile çağırdık orada da getter yapmıstık

    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +//aynı sekilde
                ", age=" + getAge() +//aynı sekilde burada gender yok persondan cağırıyoruz
                ", gender=" + getGender() +//aynı sekilde burada gender yok
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Create a sub class of Person named Employee:
Extra variables:
employeeId, jobTitle, salary
Encapsulate all the fields
Add a constructor to set all the fields
Methods:
work()
toString()
 */