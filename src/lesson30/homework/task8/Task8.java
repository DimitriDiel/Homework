package lesson30.homework.task8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task8 {
    /*
    8. Напишите метод, который получает на вход Map и 
    возвращает Map, где ключи и значения поменяны местами. 
    Так как значения могут совпадать, то тип значения в Map
     будет уже не K, а Collection>

Map<K, V>

"A", 1
"B", 2
"C", 1
"D", 3



1 -> {A,C]
2 -> B
3 -> D



     */

    public static void main(String[] args) {

        Map<String , Integer> ourMap = new HashMap<>();
        
        ourMap.put("A",1);
        ourMap.put("B",2);
        ourMap.put("C",1);
        ourMap.put("D",3);
        
        Map <Integer, List<String>> newMap = swapMap(ourMap);

        System.out.println(newMap);

    }

    private static Map<Integer, List<String>> swapMap(Map<String, Integer> ourMap) {
        Map <Integer, List<String>> newMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : ourMap.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            // если у меня уже есть ключ в новой коллекции, то я просто добавляю значение в List
            // а если нет - то создаю новый с одним единственным элементом

            if (newMap.containsKey(value)) {
                newMap.get(value).add(key);
            } else {
                List <String> keyCollection = new ArrayList<>();
                keyCollection.add(key);
                newMap.put(value, keyCollection);
            }
        }

        return newMap;

    }

}
