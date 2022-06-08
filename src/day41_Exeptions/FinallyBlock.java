package day41_Exeptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int[]arr={1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");//it is written
            e.printStackTrace();
           // System.exit(0);//if we dont want to execute finally block we add this. İnt. Q
        }finally {
            System.out.println("Finally Block");//it is written also
        }



    }
}
