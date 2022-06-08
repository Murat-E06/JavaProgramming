package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        System.out.println(offer1);//Offer{location='null', companyName='null', jobTitle='null', salary= $0.0, hasBenefit=false, hasPTO=false, isWHF=false, isFullTime=false}
        offer1.setInfo("Ankara", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("Istanbul", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("Izmir", "Philips", "BA", 100000, true, true, false, false);

        Offer offer4 = new Offer();
        offer4.setInfo("Samsun", "Apple Inc", "QE", 125000, true, true, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("Bursa", "Capital One", "SM", 115000, false, false, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        System.out.println("---------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p -> !p.isFullTime);//removes if the offer is not fulltime
        System.out.println(fullTimeOffers.size());//4

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!(p.location.equals("Ankara")||p.location.equals("Samsun")));//removes if the offer is not from local area
        System.out.println(localOffers.size());//2

        //diffrent q: we want to print 2 var.
        for (Offer each : myOffers) {
            System.out.println(each.companyName+" : "+each.salary);//5 tanesinin şirketlerini ve ücretini yazar
        }
        System.out.println("--------------------------");

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName+" : "+localOffer.salary);//Ankara ve Samsun daki şirket ve ücretleri yazar
        }





    }


}
/*
Create a class named MyOffers:
2.1 Create 7 objects of Offer
2.2 Create an array of Offers named myOffers and store all 7 objects of offers
2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
    2.3.1 Write a program that can remove the offer objects that are not full-time
2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
    2.4.1 Write a program that can remove all the offers that are not from local
2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
    2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
    2.6.1 Write a program that can remove all the offers that are not for SDET
2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
    2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
 */
