package day44_Abstraction.employeeTask;

public abstract class Employee extends Person{//parent class//2. abstract ilave ettik error gitti//4. extends Person

    private final int id;//0// id sabit=> final
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, int id, String jobTitle, double salary) {//5. errorlar gider cont. ilave edince
        super(name, age, gender);
        if(id<=0){//7.
            throw new RuntimeException("Invalid ID: "+id);
        }
        this.id = id;//****id final ol için setter yok ama yukarıdakileri aynı amaçla ilave edebiliyoruz
       // this.jobTitle = jobTitle;
        setJobTitle(jobTitle);//8.
       // this.salary = salary;
        setSalary(salary);
    }

    public int getId() {//3. getter setter id nin setter ı yok çünkü final
        return id;
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

    public abstract void work();//1.abstract metod herkesin çalışması farklı!!

    @Override
    public String toString() {//6. to string
        return "Employee{" +
                ", name=" + getName() +//ilave
                ", age=" + getAge() +//ilave
                ", gender=" + getGender() +//ilave
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
