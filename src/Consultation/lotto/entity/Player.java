package Consultation.lotto.entity;

import java.util.Arrays;

public class Player {

    private String nickname;

    private Cart[] carts;

    private int[] cartsMatchesCount;

    public Player(String nickname, Cart cart1, Cart cart2, Cart cart3) {
        this.nickname = nickname;
        cartsMatchesCount = new int[3];
        carts = new Cart[3];
        carts[0] = cart1;
        carts[1] = cart2;
        carts[2] = cart3;

    }

    public  boolean checkPlayersCarts(int numberFromDrum){
        for (int i = 0; i < carts.length; i++) {
            for (int j = 0; j < carts[i].getCartArray().length; j++) {
                if (carts[i].getCartArray()[j] == numberFromDrum){
                    cartsMatchesCount[i] ++;
                }
                
            }

        }
        for (int i = 0; i < cartsMatchesCount.length; i++) {
            if(cartsMatchesCount[i] == carts[i].getCartArray().length){
                return true;

            }

        }
        return false;

    }

    public String getNickname() {
        return nickname;
    }

    public int[] getCartsMatchesCount() {
        return cartsMatchesCount;
    }

    public Cart[] getCarts() {
        return carts;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", carts=" + Arrays.toString(carts) +
                '}';
    }
}
