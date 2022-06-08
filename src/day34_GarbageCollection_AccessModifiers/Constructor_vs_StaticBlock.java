package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static Block");//first executed
    }

    public Constructor_vs_StaticBlock(){//object oluşturmadığımız için çalışmaz
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Constructor_vs_StaticBlock();//main metodun altında çalışır Constructor yazar
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
    }




}
