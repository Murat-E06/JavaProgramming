package day24_CustomMethod_Return;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {
        nameOfMonth(5);

    }
    public static void nameOfMonth(int number){

        if(number<1||number>12){
            System.out.println("Invalid");
            return;//exits nameOfMethod bir önceki örnekte olduğu gibi. muhtar bu return metodun void metodda da kullanılabileceğini çok önemsiyor!!! bazı programcılar bunu bilmiyorlarmış :)
        }
        String name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":(number==5)?"May"
                :(number==6)?"Jun":(number==7)?"Jly":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct"
                :(number==11)?"Nov":"Dec";

        System.out.println("Month name = " + name);
    }


}
