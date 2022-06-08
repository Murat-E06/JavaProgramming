package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Murat", 6, "QA", 110000);
        Tester tester2 = new Tester("Zeynep", 381, "QA", 142000);
        Tester tester3 = new Tester("Ali", 1949, "SDET", 135000);
        Tester tester4= new Tester("Mehmet", 55, "SDET", 115000);

        Tester[]testers={tester2,tester3,tester4};

        //4 developers objects
        Developer developer1=new Developer("Muhtar",11,"Java Developer",125000);
        Developer developer2=new Developer("Asiya",22,"Java Master",185000);
        Developer developer3=new Developer("Oscar",33,"Software Developer",125000);
        Developer developer4=new Developer("Gungor",44,"Senior Developer",200000);

        Developer[]developers={developer2,developer3,developer4};

        //1 ScrumTeam Object
        ScrumTeam scrum=new ScrumTeam("Adem","Mahmut","Cos",14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);
        System.out.println("-----------------------------------");

        for ( Tester eachTester :scrum.testersList  ){
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }
        System.out.println("--------------------------------");

        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }
        System.out.println("-------------------------------------");

        scrum.removeTester(55);
        scrum.removeDeveloper(44);

        System.out.println(scrum);

    }
}

/*
create a class called MyScrumTeam:
                    1. create an array of Testers and add the testers from your group
                    2. create an array of developers add the developers from your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
