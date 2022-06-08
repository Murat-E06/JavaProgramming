package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("wooden", "spoon");//W.S

        System.out.println("------------------");

        domain("Cydeo.School@gmail.com ");//gmail

        System.out.println("-------------------");

        String[]emails={"adam@gmail.com","adam@yahoo.com","madam@cydeo.com","zeynep@hotmail.com"};
        for (String each : emails) {
            domain(each);     //hepsinin domainini yazdırır!!!
        }
        System.out.println("------------------------------");

        nameOfMonth(5);




    }
    //1. create a method that can display the initials of the person. initials(String firstName, String lastName)

    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //2. create domain of e mail. domain(String email)// Cydeo.School@gmail.com //2'inci . için lastIndexOf

    public static void domain(String email){
        String domain=email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));
        System.out.println("domain = " + domain);
    }

    //3. Display the name of the months based on given number.

    public static void nameOfMonth(int number){
        String name="";
        if(number>=1&&number<=12){
            name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":(number==5)?"May"
                    :(number==6)?"Jun":(number==7)?"Jly":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct"
                    :(number==11)?"Nov":"Dec";
        }else{
            name="Invalid";
        }
        System.out.println("Month name = " + name);

    }

    //4.Display the name of the day based on given number.

    public static void nameOfDay(int number){


    }

    //5. Display the how many days a month has.

    public static void daysInMonth(int number){

    }





}
