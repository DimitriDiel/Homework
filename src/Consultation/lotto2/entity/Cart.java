package Consultation.lotto2.entity;

import java.util.Arrays;

public class Cart {

    int numberInTehCart;
    private int[] cartArray ;

    public Cart(int cartArrayRange) {
        this.cartArray = new int[cartArrayRange];
        numberInTehCart = cartArrayRange;
    }

    public int getNumberInTehCart() {
        return numberInTehCart;
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
