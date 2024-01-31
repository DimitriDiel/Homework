package lesson30.homework.task1;

import java.util.LinkedList;

public class Task1Demo {
    public static void main(String[] args) {

        Task1 task1 = new Task1();

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("first");
        linkedList.add("second");
        linkedList.add("third");
        linkedList.add("fourth");
        linkedList.add("second");
        linkedList.add("fourth");

        System.out.println(linkedList);

        System.out.println(task1.uniqueString(linkedList));

    }
}
