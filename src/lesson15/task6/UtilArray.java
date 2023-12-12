package lesson15.task6;

public class UtilArray {

    public void fillArray (int[] array){

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 10);
        }
    }

    public void replaceElements(int[] array){

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                array[i] = 0;
            }

        }

    }
}
