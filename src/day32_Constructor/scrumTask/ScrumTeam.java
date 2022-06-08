package day32_Constructor.scrumTask;

//there is no İS A relation there is HAS A relation (later )
//Scrum team is not an employee or a person
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;

    public ArrayList<Tester>testers=new ArrayList<>();
    public ArrayList<Developer>developers=new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addtester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }//  burada local var(testers) ile (testers=arraylist) aynı olduğu için this keyword kullanılıyor!!!

    public void removeTester(int id){
        testers.removeIf(p->p.id==id);
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[]developers){
        this.developers.addAll(Arrays.asList(developers));
    }////  burada local var (developers) ile (developers=arraylist) aynı olduğu için this keyword kullanılıyor!!!

    public void removeDeveloper(int id){
        developers.removeIf(p->p.id==id);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +//name i biz ilave ettik soruda öyle
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", testers=" + testers.size() +//size ı biz ilave ettik
                ", developers=" + developers.size() +
                '}';
    }
}
