package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {
        System.out.println("-----------------Push up started------------------");

        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPush up "+i);//r escape sequences means that rewrite
           // try {
           //     Thread.sleep(1500);//equals 1.5 second
          //  }catch (InterruptedException e){
           //     e.printStackTrace();
          //  }
            sleep(1.5);//yukarıdaki try&catch blok yerine aşağıda oluşturduğumuz sleep metodu çağıdık
            //selenyum da çok kullanılıyormuş muhtar said
        }

        System.out.println("\n-----------------Push up completed------------------");

        System.out.println("-----------------Pull up started------------------");

        for (int i = 1; i <=20 ; i++) {
            System.out.print("\rPull up "+i);//r escape sequences means that rewrite
            try {
                Thread.sleep(500);//equals 0.5 second
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("\n-----------------Pull up completed------------------");

    }

    public static void sleep(double seconds){//kendi timer metodumuz
        try {
            Thread.sleep((long)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
/*
MorningWorkOut:
1. Do 30 push-ups and try pausing 1.5 seconds in each
2. Do 20 Pull-ups and try pausing 0.5 seconds in each
 */