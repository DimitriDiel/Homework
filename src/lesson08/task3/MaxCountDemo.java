package lesson08.task3;

public class MaxCountDemo {

    public static void main(String[] args) {

        int[] array = {8,9,8,8,7,6,7,7,7,9,9,9,7,7,5,5,5,5,5,5,5,5};

        MaxCount maxCount = new MaxCount();

        int maxNumber = 0;
        int maxCounter = 0;
        int indexMaxNumber = 0;

        for (int i = 0; i < array.length; i++) {
           int tempCounter = maxCount.countRepeat(array,array[i]);
           if (maxCounter < tempCounter){
               maxCounter = tempCounter;
               maxNumber = array[i];
               indexMaxNumber = i;

           }

        }
        System.out.println("Число " + maxNumber + " с индексом " + indexMaxNumber + " повторяется: " + maxCounter);


        System.out.println(maxCount.countRepeat(array,5));
    }
}
