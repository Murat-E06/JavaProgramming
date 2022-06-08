package day52_Map_FunctionalInterface;

public class Test2 {
    public static void main(String[] args) {

      //  Burada da 2 data lı olanı kullandık hem data(n)  hem de return type (Integer String..) ı girebildik

        MySecondFunctionalInterface<String>printEach=s->{
            for (String each : s.split("")) {//s represent String
                System.out.println(each);
            }
        };
        printEach.test("Wooden Spoon");

        MySecondFunctionalInterface<Integer>cube=n-> System.out.println(n*n*n);
        cube.test(5);








    }
}
