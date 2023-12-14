package Consultation.lotto2.service;

import Consultation.lotto2.entity.Cart;
import Consultation.lotto2.repository.CartRepository;

public class CreateCart {

    int numberInTheEachCart;

    int numberInTheDrum;

    CartServices cartServices = new CartServices();
    CartRepository cartRepository = new CartRepository(15);

    public void createCards() {
        Cart[] carts = cartRepository.getCarts();

        for (int i = 0; i < carts.length; i++) {
            carts[i] = new Cart(numberInTheEachCart);
            cartServices.fillNewCard(carts[i], numberInTheDrum);
        }
    }
}
