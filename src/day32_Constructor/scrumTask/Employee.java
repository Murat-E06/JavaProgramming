package day32_Constructor.scrumTask;

public class Employee extends Person{//Employee IS A Person

    public String jobTitle;//önce ortak olmayanları mustakil ol. yazdık...
    public int id;//bunları önce yazmak gerekiyor, super metoddan sonra yazdırmıyor!! ve oraya da dahil olacağı ıcın!!
    public double salary;
    public String companyName;

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);//...sonra extend Person yaptık oto super i tıklamadan(comp.error varken)!! generate cont. yaptık(
        this.jobTitle = jobTitle;//..sonra bu hali yazdı ve error kalktı. Önce superi tıklayıp yaparsak olmuyor
        this.id = id;//..bu this satırları manuel ilave etmek gerekiyor!!!
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }

    public String toString() {//tekrar toString yaptık ve burada planladıklarımızı da seçerek toplamını yazdırdık..
        return "Employee{" +//..sırasını kendimiz ayarladık cut insert paste
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}
/*
name,gender,age, jobTitle,id,salary,companyName
work(), toString()
 */