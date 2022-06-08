package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "James King", // we use , instead of ; for all string names we use only one String statement.
                buildingNumber = "2282B",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22301A"; // end of the Strings we must use ;
        

        /*
        Shipping Address Format:
        name
        buildingNumber streetName
        city, state zipCode
         */
        System.out.println(name+"\n"+buildingNumber+" " + streetName +"\n"+city+", "+state+" "+zipCode);
        System.out.println("----------------");

        String address = name+"\n"+buildingNumber+" " + streetName +"\n"+city+", "+state+" "+zipCode;
        /*
         burada stringleri birleştirdiğimiz için "" kullanmıyoruz.
         eğer text olsaydı kullanacaktık diğerlerinde olduğu gibi


         */
        System.out.println(address); // stringler dizisi tek bir stringe atanabiliyor


    }
}
