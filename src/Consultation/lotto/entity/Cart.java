package Consultation.lotto.entity;

import java.util.Arrays;

public class Cart {

    private int[] cartArray;

    public Cart(int cartArrayRange) {
        this.cartArray = new int[cartArrayRange];
    }
    public int[] getCartArray() {
        return cartArray;
    }
    public void setCartArray(int[] cartArray) {
        this.cartArray = cartArray;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "cartArray=" + Arrays.toString(cartArray) +
                '}';
    }
}
