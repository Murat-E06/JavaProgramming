package day41_Exeptions;

import day39_Recap.cydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee = null;

        try{
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second exception Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){//insurance catch block if the others can not catch the fish, this block %100 catchs the fish :)
            System.out.println("Fourth catch block");//only this stat writen
        }
        System.out.println("Test completed");
        System.out.println("--------------------------------");

        try{
            System.out.println("Java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }



    }
}
