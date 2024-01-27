package lesson30.task2;

import java.util.HashSet;

public class Task2 {

    private HashSet<String> uniqueWord = new HashSet<>();

    public HashSet<String> getUniqueWord() {
        return uniqueWord;
    }

    public Integer uniqueWordCount(String text){


        String[] words = text.trim().split(" ");
        for(String currentWord : words){
            if(!currentWord.isEmpty()){
                uniqueWord.add(currentWord);

            }
        }
        System.out.println(uniqueWord);

        return uniqueWord.size();
    }
    public HashSet<String> findLengthStringMor5(HashSet<String> uniqueWord){
        HashSet<String> elementsMor5 = new HashSet<>();
        for (String currentWord : uniqueWord){
            if(currentWord.length() > 4){
                elementsMor5.add(currentWord);
            }
        }
        return elementsMor5;

    }

}
