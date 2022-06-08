package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[]name={"Cydeo School","Wooden Spoon","Java Programming","Manuel Testing"};

        for (String each : name) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);


        }

    }
}
