package lesson30.homework.task10;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {

        Set<String> strings = new HashSet<>();

        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("FFF");

        System.out.println(strings.contains("DDD"));

        Map<String,Integer> stringIntegerMap = new TreeMap<>();

        String s1 = "GGGGGG";
        String s2 = "jjjjj";
        String s3 = "oooo";
        String s4 = "zzz";
        String s5 = "ee";

        stringIntegerMap.put(s1, s1.length());
        stringIntegerMap.put(s2, s2.length());
        stringIntegerMap.put(s3, s3.length());
        stringIntegerMap.put(s4, s4.length());
        stringIntegerMap.put(s5, s5.length());


        System.out.println(stringIntegerMap);


    }
}
