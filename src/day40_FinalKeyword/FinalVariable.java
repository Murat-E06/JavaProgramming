package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;//constructor seçtikten sonra comp. error gidiyor
    final static String name;
    static {
        name="EU8";//static i devamlı değiştirebiliyoruz eu9,10 yapabiliriz fakat final asla!!
    }

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

      final  double pi=3.14;//pi now is unchangeble

        final String name;//ilk girilen isim kalır artık değişmez
        name="java";
     //   name="Wooden Spoon";// error
        System.out.println(name);
        System.out.println("--------------------------");

        FinalVariable obj=new FinalVariable("May/02");
       // obj.birthDay="Jun/01";//gives comp. error beause final var cant change
        System.out.println(obj.birthDay);
        System.out.println("------------------------");

     //  FinalVariable.name="Python";//error
        System.out.println(FinalVariable.name);
    }
}
