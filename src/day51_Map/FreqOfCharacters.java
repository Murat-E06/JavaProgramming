package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfCharacters {

    public static void main(String[] args) {
        //***PIQ****
        //Use Map
        //str="bbcccaaaaa"
        // output:{b=2,c=3,a=5=

        String str = "bbcccaaaaa";

        //Collections.frequency()

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();//{b=2,c=3,a=5}

        for (String each : arr) {//each chars. of String
            int frequency=Collections.frequency(Arrays.asList(arr), each);
            result.put(each, frequency );
        }
        System.out.println(result);

    }


}
