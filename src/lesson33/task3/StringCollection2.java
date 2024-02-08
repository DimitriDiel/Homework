package lesson33.task3;

import java.util.ArrayList;
import java.util.List;

public class StringCollection2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("gold");
        strings.add("red");
        strings.add("parameter");
        strings.add("collection");


        System.out.println("Result of reduce: " + strings.stream().reduce((c1, c2) -> c1 + " " +c2));

    }
}
