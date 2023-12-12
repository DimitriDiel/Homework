package lesson15.task1;

public class ServiceArray {

    public void mirrorArray (String[] workingArray){

        int j = workingArray.length - 1;

        for (int i = 0; i < workingArray.length / 2; i++) {
            String temp = workingArray[i];
            workingArray[i] = workingArray[j];
            workingArray[j] = temp;
            j--;
        }
    }
}
