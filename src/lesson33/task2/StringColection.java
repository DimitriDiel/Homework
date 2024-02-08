package lesson33.task2;

import java.util.ArrayList;
import java.util.List;

public class StringColection {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("gold");
        stringList.add("red");
        stringList.add("parameter");
        stringList.add("collection");

        List<String> result = stringList.stream()
                .filter(string -> (string.length() % 2) != 0)
                .toList();

        System.out.println(result);


    }
}
