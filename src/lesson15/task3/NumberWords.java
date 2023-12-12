package lesson15.task3;

public class NumberWords {

    private int numOfWord = 0;

    public void counterWord (String text){

        text = text.trim();

        if (!text.isEmpty()){
            numOfWord++;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' '){
                    numOfWord++;
                }

            }
        }

    }

    public int getNumOfWord() {
        return numOfWord;
    }

}
