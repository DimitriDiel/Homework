package lesson30.homework.task9;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {

        Map<Integer, Integer> myMap = new HashMap<>();

        while (myMap.size() <= 9){
            int k = (int) (Math.random()*100);
            int v = k * k;
            myMap.put(k,v);

        }
        System.out.println(myMap);

    }
}
