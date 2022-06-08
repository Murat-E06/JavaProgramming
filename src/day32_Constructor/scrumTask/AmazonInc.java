package day32_Constructor.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {

        String company="Amazon Inc";

        ProductOwner po=new ProductOwner("Muhtar",26,'M',1,160000,company);//company name yerine direk biraz önce ol. company ile değiştirdik

        BusinessAnalyst ba=new BusinessAnalyst("Cos",46,'M',2,150000,company);

        ScrumMaster sm=new ScrumMaster("Omer",32,'M',3,145000,company);

        Tester tester1=new Tester("Murat",46,'M',"SDET",11,100000,company);

        Tester tester2=new Tester("Zeynep",15,'F',"QA",381,90000,company);

        Tester tester3=new Tester("Meriyem",15,'F',"QA",333,80000,company);

        Tester[]testers={tester1,tester2,tester3};

        Developer developer1=new Developer("Ali",72,'M',"Java Developer",1949,100000,company);

        Developer developer2=new Developer("Abid",45,'M',"Senior Developer",33,110000,company);


        ScrumTeam scrumTeam=new ScrumTeam(po,ba,sm);
        System.out.println(scrumTeam);//ScrumTeam{PO=Muhtar, BA=Cos, SM=Omer, testers=0, developers=0}

        scrumTeam.addDeveloper(developer1);
        scrumTeam.addDeveloper(developer2);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);//ScrumTeam{PO=Muhtar, BA=Cos, SM=Omer, testers=3, developers=2}

        System.out.println("--------------------------------------");

        for (Tester tester : scrumTeam.testers) {//scrumTeam.testers.for yaptık. scrumTeam.testers bir array list ol icin for ile each for a çevirdik!!
            System.out.println(tester.name+" : "+tester.salary);//Murat : 100000.0 Zeynep : 90000.0 Meriyem : 80000.0

        }
        System.out.println("----------------------------");
        for (Developer developer : scrumTeam.developers) {
            System.out.println(developer.name+" : "+developer.salary);//Ali : 100000.0 Abid : 110000.0

        }

    }
}
