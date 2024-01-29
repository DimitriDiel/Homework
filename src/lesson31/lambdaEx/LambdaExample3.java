package lesson31.lambdaEx;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample3 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        list1.add("Toronto");
        list1.add("Berlin");
        list1.add("Leipzig");
        list1.add("London");

        list2.add("Paris");
        list2.add("Madrid");
        list2.add("Roma");
        list2.add("Istanbul");

        ListMerge listMerge = ((list3, list4) -> {
            List<String> listResult = new ArrayList<>(list3);
            listResult.addAll(list4);

            return listResult;
        });

        List<String> resultList = listMerge.merge(list1,list2);
        System.out.println(resultList);


    }
}
