package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        //find max number 100 & 200
        int maxNumber=max(100,200);
        System.out.println(maxNumber);

        // multiply max number by 2
        int multiplication=maxNumber*2;//void methodda bunu yapamazdık!!
        System.out.println(multiplication);


    }
    public static int max(int a,int b){
        int result=0;
        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;//burası önemli print stat kullanmıyoruz bu şekilde bağlıyoruz. aslında atamış oluyoruz.
    }




}
