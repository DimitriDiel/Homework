package lesson24.operationLinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i <= 20; i++) {
            list.add(i, (int) (Math.random()*(100 - 1 + 1) + 1));

        }
        System.out.println(list);

        int max = 0;
        int min = 100;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max ){
                max = list.get(i);
            }
            if(list.get(i) < min){
                min = list.get(i);
            }

        }
        System.out.println("Max element = " + max);
        System.out.println("Min element = " + min);


        boolean notSorted = true;
        int temp;

        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    temp = list.get(i);
                    list.set(i,(list.get(i + 1)));
                    list.set(i + 1, temp);
                    notSorted = true;

                }
            }
        }
        System.out.println("Sorted List: " + list);

    }
}
