package lesson30.task1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Task1 {

    public Set<String> uniqueString(LinkedList<String> linkedList){
        return new HashSet<>(linkedList);
    }

}
