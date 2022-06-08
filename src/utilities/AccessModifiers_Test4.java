package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

      //  System.out.println(AccessModifiers_Test4.name1);// default is not visible outside tha package
        System.out.println(AccessModifiers_Test4.name2);//protected always visible outside the package in subclass only


      //  AccessModifiers_Test4.method1();//default method is not visible outside tha package
        AccessModifiers_Test4.method2();//protected method always visible outside the package in subclass only


    }
}
