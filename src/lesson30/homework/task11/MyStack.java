package lesson30.homework.task11;

import java.util.Objects;
import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("First");
        stringStack.push("Second");
        stringStack.push("Third");
        stringStack.push("Fourth");

        System.out.println(stringStack);

        String stringForSearch = "Third";

        stringStack.search(stringForSearch);

        System.out.println("Элемент " + stringForSearch + " находится на глубине " + stringStack.search(stringForSearch));


    }
}
