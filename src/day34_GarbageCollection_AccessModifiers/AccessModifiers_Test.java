package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);
      //  System.out.println(AccessModifiers.privateData);//it can not visible and reachable outside the own class


        AccessModifiers.method1();
        AccessModifiers.method2();
      //  AccessModifiers.method3();//private is not visible outside the class also its method's is not

    }


}
