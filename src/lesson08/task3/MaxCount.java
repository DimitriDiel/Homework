package lesson08.task3;

public class MaxCount {

    public int countRepeat(int[] workingArray, int findNumber){
        int counter = 0;
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == findNumber) {
                counter++;
            }
        }
        return counter;}
}
