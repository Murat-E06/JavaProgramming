package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200;//access mod.:default
    private static int privateData = 300;

    public static void method1(){//metod olusturduk diğer yerlerde kullanmak için
        System.out.println("Public");
    }

    static void method2(){//default ol. icin ayrıca default yazmamıza gerek olmuyor
        System.out.println("Default");
    }

    private static void method3(){
        System.out.println("Private");
    }



    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }

}
