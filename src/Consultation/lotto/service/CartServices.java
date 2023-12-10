package Consultation.lotto.service;

import Consultation.lotto.entity.Cart;

import java.util.Arrays;
import java.util.Random;

public class CartServices {

    public void fillNewCart(Cart cartForFilling, int range){
        Random random = new Random();
        int[] workingArray = cartForFilling.getCartArray();
        for (int i = 0; i < workingArray.length; i++) {
            int newNumber;
            do {
                newNumber = random.nextInt(range) + 1;
            }while (isNumberInArray(workingArray, newNumber));

            workingArray[i] = newNumber;
        }
        Arrays.sort(workingArray);
    }
    private boolean isNumberInArray(int[] workingArray, int checkNumber){
        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] == checkNumber){
                return  true;
            }
        }
        return false;
    }
}
