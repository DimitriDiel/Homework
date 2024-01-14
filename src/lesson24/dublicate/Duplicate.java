package lesson24.dublicate;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {

        ArrayList<String> duplicate = new ArrayList<>();

        duplicate.add(0, "Apple");
        duplicate.add(1, "Apple");
        duplicate.add(2, "Bus");
        duplicate.add(3, "Cat");
        duplicate.add(4, "Dog");
        duplicate.add(5, "Apple");

        System.out.println(duplicate);

        HashSet<String> duplicateHashSet = new HashSet<>(duplicate);

        System.out.println(duplicateHashSet);

        duplicateHashSet.add("Car");

        System.out.println(duplicateHashSet);

        ArrayList<String> duplicateAfterAdd = new ArrayList<>(duplicateHashSet);

        System.out.println(duplicateAfterAdd);

    }
}
