package lesson30.homework.task12;

import java.util.ArrayDeque;

public class MyArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();

        integerArrayDeque.add(1);
        integerArrayDeque.add(2);
        integerArrayDeque.add(3);
        integerArrayDeque.add(4);
        integerArrayDeque.add(5);

        System.out.println(integerArrayDeque);

        integerArrayDeque.addFirst(0);
        integerArrayDeque.addLast(6);

        System.out.println(integerArrayDeque);

        System.out.println(integerArrayDeque.removeFirst());

    }
}
