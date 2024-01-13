package lesson24.evaluationOfStudents;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EvaluationOfStudent {
    public static void main(String[] args) {

        HashMap<String, Integer> evaluation = new HashMap<>();

        evaluation.put("Ivanov", 1);
        evaluation.put("Petrov", 3);
        evaluation.put("Sidorov", 2);
        evaluation.put("Kirkorov", 4);
        evaluation.put("Galkin", 5);


        for (String key : evaluation.keySet()) {
            System.out.println(key + ": " + evaluation.get(key));
        }

        System.out.println("maximum evaluation : " + Collections.max(evaluation.values()));

        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : evaluation.entrySet())
        {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
            {
                maxEntry = entry;
            }
        }
        System.out.println(maxEntry);

    }

}
