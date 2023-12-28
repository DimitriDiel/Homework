package lesson08.task4;

public class Task4Demo {
    public static void main(String[] args) {

        int[] array = {10,5,17,2,20,15,9,4};

        Task4 task4 = new Task4();



        int max = task4.maxElement(array);

        int min = task4.minElement(array);

        int difference = task4.calcDifference(max,min);

        System.out.println("разница между максимальным " + max +  " и минимальным " + min + " значениями равна " + difference + ".");


    }
}
