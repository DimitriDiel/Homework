package lesson30.homework.task3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
    /*
    В классе IntegerListDemo создайте список целых чисел.
    Продемонстрируйте как:
   - добавить в список элемент (в начало и в конец)
   - узнать длину списка
   - удалить элемент из списка (по индексу и без)
   - узнать пустой список или нет
   - обойти список и вывести на консоль каждый элемент.
     */

        List<Integer> integerList = new ArrayList<>();

        integerList.add(0,1);
        integerList.add(1,2);
        integerList.add(2,3);

        integerList.addFirst(0);
        integerList.addLast(4);

        System.out.println(integerList);
        System.out.println();
        System.out.println(integerList.size());

        integerList.remove(4);
        System.out.println(integerList);

        integerList.removeFirst();
        System.out.println(integerList);

        System.out.println(integerList.isEmpty());

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
    }
}
