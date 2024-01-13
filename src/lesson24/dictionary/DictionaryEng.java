package lesson24.dictionary;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryEng {
    public static void main(String[] args) {

        HashMap<String,String> dictionaryEngRus = new HashMap<>();

        dictionaryEngRus.put("Apple", "Яблоко");
        dictionaryEngRus.put("Bus", "Автобус");
        dictionaryEngRus.put("Tree", "Дерево");
        dictionaryEngRus.put("Song", "Песня");
        dictionaryEngRus.put("Box", "Коробка");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово на английском");

        String word = scanner.next();

        if(dictionaryEngRus.containsKey(word)){
            System.out.println("Перевод: " + dictionaryEngRus.get(word));
        }else {
            System.out.println("Слово в словаре не найдено");
        }

        dictionaryEngRus.remove("Box");

        System.out.println(dictionaryEngRus);

    }
}
