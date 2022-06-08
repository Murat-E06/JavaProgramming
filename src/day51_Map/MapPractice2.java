package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        //  1 who has the maximum and minimum salary?
        String name1 = "";
        int maxSalary = Integer.MIN_VALUE;

        String name2 = "";
        int minSalary = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String eachKey = pair.getKey();//name
            Integer eachValue = pair.getValue();//salary

            if(eachValue > maxSalary){
                maxSalary = eachValue;
                name1 = eachKey;
            }

            if(eachValue < minSalary){
                minSalary = eachValue;
                name2 = eachKey;
            }

        }


        System.out.println(name1);
        System.out.println(name2);


        System.out.println("----------------------------------------------");

        //how many employees has the salary between 120k ~ 150K?

        int count = 0;

        for (Integer eachValue : map.values()) {
            if(eachValue >= 120000 && eachValue <= 150000){
                count++;
            }
        }

        System.out.println(count);


        System.out.println("----------------------------------------------");

        //   1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> pair : map.entrySet()) {//pairsleri for çevrimine atıyoruz
            if( pair.getValue() < 118000){//pairin value su 118 den kçkse
                System.out.println(pair.getKey());//bana pairin value su yani ismi ver
            }
        }


        System.out.println("----------------------------------------------");

        // 1.5 increase the salary employee by 10K if the current salary of employee is less than 120K

        System.out.println(map);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {//pairsleri al
            if(entry.getValue() < 120000){//120k den kçük value leri ayır
                entry.setValue(entry.getValue()+10000);//ve onlara 10k ilave et(set yap)
            }
        }

        System.out.println(map);

    }


}

/*
1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */



