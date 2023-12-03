package lesson11;

public class BinarySearch {

    public void search(int[] array, int searchNumber){

        int low = 0;

        int high = array.length - 1;

        int index = -1;

        while (low <= high){
            int mid = low + (high - low) / 2;
            if (array[mid] < searchNumber){
                low = mid + 1;
            } else if (array[mid] > searchNumber) {
                high = mid - 1;
            } else if (array[mid] == searchNumber){
                index = mid;
                break;

            }

        }
        System.out.println("Index = " + index);

    }
}
