package lesson24.names;

import java.util.HashSet;

public class Names {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Dima");
        names.add("Vasja");
        names.add("Kostj");
        names.add("Mark");
        names.add("Dima");
        names.add("Kristian");
        names.add("Viktor");
        names.add("Dima");
        names.add("Olga");
        names.add("Vasja");


        System.out.println(names);

        System.out.println(names.size());

        System.out.println(names.contains("Olga"));





    }
}
