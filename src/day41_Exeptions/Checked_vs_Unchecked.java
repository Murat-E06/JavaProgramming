package day41_Exeptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exception:while we execute RUN it gives exception (error)

        int a = 10;
        int b = 0;
        //System.out.println(a / b);//while we RUN this it gives "ArithmeticException" and "Process finished with exit code 1"
        //1 means something went wrong
       // System.out.println("Wooden Spoon");//yukarıda 1 verdiği için burayı yazmaz!!

        char[]characters={'A','B','C'};
       // System.out.println(characters[99]);//OutOfBoundException+"Index 99 out of bounds for length 3"

       Student student=null;
      //  System.out.println(student.getName());//"NullPointerException"
      //  student.study();

        final String str="wooden Spoon";
      //  str=null;
      //  System.out.println(str.toUpperCase());

        String str2="";//""==object but null!=object
        System.out.println(str2.isEmpty());//true
        System.out.println("--------------------------------------------");

        //checked Exception:while we r writing cog it gives comp. error

        System.out.println("Hello");

      //  Thread.sleep(3000);//unreported exception...
        System.out.println("Cydeo");

     //   FileInputStream file= new FileInputStream("path of the file");//checked. unreported exception. compiler checks it and
        //gives an error

        System.out.println("java".charAt(20000));//unchecked. comp. doesnt check it and does not give any error while we run it that is the difference




    }
}
