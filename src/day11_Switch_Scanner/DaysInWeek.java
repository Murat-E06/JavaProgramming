package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number = 5;
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;// exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;// exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:// exits the switch after executing the case block
                System.out.println("Thursday");
                break;// exits the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break;// exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;// exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break;// exits the switch after executing the case block
            default:
                System.out.println("Invalid");
                break;//break yazmasak da bir sonraki } den çıkacağı için yazmasak da olur eğer en sonda ise default steat.
        }


    }
}
