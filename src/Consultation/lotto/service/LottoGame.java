package Consultation.lotto.service;

import Consultation.lotto.entity.Cart;
import Consultation.lotto.entity.Player;
import Consultation.lotto.repository.CartRepository;



public class LottoGame {

    private int[] drum;
    private Player[] players;

    CartServices cartServices = new CartServices();
    CartRepository cartRepository= new CartRepository(15);

    UserInput ui = new UserInput();


    public LottoGame() {
        prepareGameDrum();
        createCarts();

    }

    private void prepareGameDrum(){
        drum = new int[90];
        for (int i = 1; i <= 90; i++) {
            drum[i - 1] = i;

        }
        for (int i = drum.length - 1; i > 1; i--) {
            int j = (int) (Math.random() *i);
            int temp = drum[i];
            drum[i] = drum[j];
            drum[j] = temp;

        }
    }
    private void createCarts(){
        Cart[] carts = cartRepository.getCarts();

        for (int i = 0; i < carts.length; i++) {
            carts[i] = new Cart(15);
            cartServices.fillNewCart(carts[i],90);

        }
    }

    public void startGame(){
        int playersNumber = ui.uiInt("Введите кол-во игроков");
        players = new Player[playersNumber];
        for (int i = 0; i < playersNumber; i++) {
            String playerNickname = ui.uiText("Введите Nickname игрока");
            Cart cart1 = cartRepository.getCarts()[i * 3 + 0];
            Cart cart2 = cartRepository.getCarts()[i * 3 + 1];
            Cart cart3 = cartRepository.getCarts()[i * 3 + 2];

            players[i] = new Player(playerNickname,cart1,cart2,cart3);

            System.out.println(players[i]);

        }

        boolean noWinner = true;
        int drumCounter = 0;

        while (noWinner){

            int currentNumber = drum[drumCounter];

            System.out.print(currentNumber + ", ");

            for (int i = 0; i < players.length; i++) {
                if (players[i].checkPlayersCarts(currentNumber)){
                    System.out.println("Игрок " + players[i].getNickname() + " выиграл!!!");
                    noWinner = false;
                }


            }
            drumCounter++;

        }
    }
}
