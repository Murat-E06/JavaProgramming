package day37_Inharitance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("Iphone 13 Pro Max","6.7 inches",1000,"Blue");

        Samsung samsung=new Samsung("galaxy S19","6 inches",900,"Black");

        Nokia nokia=new Nokia("6110","4 İnches",50,"Yellow");

        System.out.println(iphone);//Phone{brand='Apple', model='Iphone 13 Pro Max', size='6.7 inches', price=$1000.0, color='Blue', has battery='true'}
        System.out.println(samsung);
        System.out.println(nokia);
        System.out.println("-------------------------");

        iphone.call(911);
        samsung.text(112312313);
        nokia.selfdefence();
        samsung.freeze();
        iphone.faceTime("merbas34@gmail.com");
        System.out.println("--------------------------------------");




    }
}
