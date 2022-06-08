package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly=true;//static&final by default

   /*
    public static void method1(){
        System.out.println(isFriendly);
    }
    */

   // public abstract void play();
    void play(); //public and abstract by default no need to write
    //abstracta ol. gibi body yok child claslarda oluşturacağız


}
