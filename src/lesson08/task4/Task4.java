package lesson08.task4;

public class Task4 {

    public int maxElement(int[] workingArray){
        int max = workingArray[0];
        for (int i = 1; i < workingArray.length; i++) {
            if (max < workingArray[i]) {
                max = workingArray[i];
            }
        }
        return max;
    }
    public int minElement(int[] workingArray){
        int min = workingArray[0];
        for (int i = 1; i < workingArray.length; i++) {
            if (min >  workingArray[i]) {
                min = workingArray[i];
            }
        }
        return min;
    }

    public int calcDifference(int max, int min) {
        return max - min;
    }
}
