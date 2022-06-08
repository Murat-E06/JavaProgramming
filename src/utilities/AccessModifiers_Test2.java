package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);//Only works  out of the package one is public access modifiers
       //System.out.println(AccessModifiers.defaultData);//default access mod. is not visible outside the own package
       // System.out.println(AccessModifiers.privateData);//private access mod. is not visible outside the own class


        AccessModifiers.method1();
      //  AccessModifiers.method2(); it can not visible outside own package
     //   AccessModifiers.method3(); it can not visible outside own class



    }
}
