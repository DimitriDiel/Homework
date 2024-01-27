package lesson30.task5;

import java.util.LinkedList;

public class Task5 {

    public LinkedList<String> compareLists(LinkedList<String> list1, LinkedList<String> list2){
        LinkedList<String> comparedList = new LinkedList<>();

        for (int i = 0; i < list2.size(); i++) {
            if(list1.contains(list2.get(i))){
                comparedList.addLast(list2.get(i));
            }
        }
        return comparedList;
    }

    public static void main(String[] args) {

        Task5 task5 = new Task5();

        LinkedList<String> list1 = new LinkedList<>();
        list1.addLast("aaaaa");
        list1.addLast("bbbbb");
        list1.addLast("ccccc");
        list1.addLast("ddddd");

        LinkedList<String> list2 = new LinkedList<>();
        list2.addLast("aaaaa");
        list2.addLast("bbbbb");
        list2.addLast("ddddd");

        System.out.println(task5.compareLists(list1, list2));

    }

}
