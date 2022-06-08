package day37_Inharitance.phoneTask;

public class Iphone extends Phone{
 //first child class (parent class ta const. kull. icin burada super keyword kullanıyoruz.
 //onun için de extend yazdıktan sonra kırmızı alt çizgiye dokunup super e tıklıyoruz kendi otomatik atıyor!!

    public Iphone(String model, String size, double price, String color) {//buradan brand i sildik sonra...
        super("Apple", model, size, price, color);//... buradaki brandi çift tıkladık ""arasına Apple yazdık!!
        //daha sonra object classta Apple girmeye gerek kalmayacak!!
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" can do a face time with phone number: "+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand+" "+model+" can do a face time with email: "+email);
    }





}
/*
Variables:
same->extends Phone
Methods:
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)
toString
 */