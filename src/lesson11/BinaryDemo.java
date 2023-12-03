package lesson11;

import java.util.Arrays;

public class BinaryDemo {

    public static void main(String[] args) {


    int[] array = {1,3,5,7,9,12,15,19,21,26,29,35,39,43,48,50,100};


    int searchNumber = 19;

    BinarySearch binarySearch = new BinarySearch();

    binarySearch.search(array,searchNumber);


    }

}
