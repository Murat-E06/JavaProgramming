package day30_CustomClass;

public class EmployeeObjects {
    public static void main(String[] args) {
        //***Good Q****
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("Ali", 'M', 25, 4545, "Developer", 100000, true);
        employee2.setInfo("Anna", 'F', 28, 5355, "QA", 85000, true);
        employee3.setInfo("David", 'M', 35, 3344, "QA", 45000, false);
        employee4.setInfo("Lina", 'F', 38, 2233, "Manager", 80000, true);
        employee5.setInfo("Kevin", 'M', 45, 2232, "Senior QA", 110000, true);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int fullTime = 0;
        int partTime = 0;
        double maxSalary=employees[0].salary;
        double minSalary=employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime) {
                fullTime++;
            } else {
                partTime++;
            }
            if(employee.salary>maxSalary){
                maxSalary=employee.salary;
            }
            if(employee.salary<minSalary){
                minSalary=employee.salary;
            }


        }
        System.out.println("fullTime = " + fullTime);
        System.out.println("partTime = " + partTime);
        System.out.println("maxSalary = " + maxSalary);
        System.out.println("minSalary = " + minSalary);


    }


}
/*
1.Create 5 Employee objects
2.store those objects into an array
3.how many employees are full time employee?
4.what is the min. salary?
5.what is the max salary?
 */