package day45_Abstraction;

public interface PropertiesOfInterface {//interface can not be final but variables only be static and final

    int a=100;//static&final by default
    static int b=200;//final by default

    /*//constructor does not work in abstract class interface has not an object

    public PropertiesOfInterface(int a){
        this.a=a;
    }

 */

    /*

    static {//interface not a class static use in class therefore ststic does not work
        b=100;
    }
    */

   /*

    public void method1(){//no object in interface therefore  instance method does not work
        System.out.println("Instance method");
    }
    */

    public static void method2(){//public unnecessary
        System.out.println("Static method");
    }
    public abstract void method3();//java 8 e kadar sadece abstract method kullanılabiliyormuş interface de muhtar said
    //public abstract unnecessary no need to write

    default void drinkmethod4(){//public, default unnecessary
        System.out.println("Default method");
    }

}

class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

    }
}
