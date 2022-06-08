package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100, 90, 75, 85, 65, 55, 45, 73, 73,87, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores);//hepsini gradeA nın içine attık

        gradeOfA.removeIf(p -> p < 90);
        System.out.println(gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);
        gradeOfB.removeIf(p -> !(p >= 80 && p <= 89));
        System.out.println(gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);
        gradeOfC.removeIf(p -> !(p >= 70 && p <= 79));
        System.out.println(gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);
        gradeOfD.removeIf(p -> !(p >= 60 && p <= 69));
        System.out.println(gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);
        gradeOfF.removeIf(p -> p>59);
        System.out.println(gradeOfF);

        System.out.println("Total number of A: "+gradeOfA.size());
        System.out.println("Total number of B: "+gradeOfB.size());
        System.out.println("Total number of C: "+gradeOfC.size());
        System.out.println("Total number of D: "+gradeOfD.size());
        System.out.println("Total number of F: "+gradeOfF.size());


    }
}
