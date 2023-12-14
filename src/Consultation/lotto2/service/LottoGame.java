package Consultation.lotto2.service;

import Consultation.lotto2.entity.Cart;
import Consultation.lotto2.entity.Player;

import java.util.Arrays;

public class LottoGame {

    private Player[] players;
    Drum drumPrep = new Drum();
    CreateCart createCart = new CreateCart();
    UserInput ui = new UserInput();

    public LottoGame(int numberInTheEachCart, int numberInTheDrum) {
        createCart.numberInTheEachCart = numberInTheEachCart;
        createCart.numberInTheDrum = numberInTheDrum;
        drumPrep.prepareGameDrum(numberInTheDrum);
        createCart.createCards();
    }

    public void startGame() {

        int playersNumber = getPlayersNumber();

        inputPlayersDetails(playersNumber);

        boolean noWinner = true;
        int drumCounter = 0;

        while (noWinner) {
            int currentNumber = drumPrep.getDrum()[drumCounter];
            drumCounter++;
            noWinner = isNoWinner(currentNumber);
        }

        printWinners(drumCounter);

        System.out.println("=============================================");

        printAllPayersCarts();

    }

    public void printAllPayersCarts(){
        for (int i = 0; i < players.length; i++) {
            System.out.println();
            System.out.println("Игрок: " + players[i].getNickname());
            for (int j = 0; j < players[i].getCarts().length; j++) {
                System.out.println("Карточка №" + (j + 1));
                System.out.println(Arrays.toString(players[i].getCarts()[j].getCartArray()) + " выпало " + players[i].getCartsMatchesCount()[j] + " номеров.");
            }
        }
    }


    public void printWinners(int drumCounter) {
        System.out.println("\n На " + drumCounter + " ходу СТОП ИГРА!");
        // печать барабана до момента выигрыша
        for (int i = 0; i < drumCounter; i++) {
            System.out.print(drumPrep.getDrum()[i] + ", ");
        }

        System.out.println();

        // печать выигрышных карточек

        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].getCartsMatchesCount().length; j++) {
                if (players[i].getCartsMatchesCount()[j] == createCart.numberInTheEachCart) {
                    System.out.println("Поздравляем игрока: " + players[i].getNickname());
                    System.out.println("Выигрышная карточка: " + Arrays.toString(players[i].getCarts()[j].getCartArray()));
                }
            }
        }

    }


    private boolean isNoWinner(int currentNumber) {
        boolean noWinner = true;

        for (int i = 0; i < players.length; i++) {
            if (players[i].checkPlayersCarts(currentNumber)) {
                noWinner = false;
            }
        }
        return noWinner;
    }

    private void inputPlayersDetails(int playersNumber) {
        for (int i = 0; i < playersNumber; i++) {
            String playerNickName = ui.uiText("Введите nickname для игрока:");
            Cart cart1 = createCart.cartRepository.getCarts()[i * 3 + 0]; // нумерация элементов этого массива 0,1,2,3,4....14
            Cart cart2 = createCart.cartRepository.getCarts()[i * 3 + 1];
            Cart cart3 = createCart.cartRepository.getCarts()[i * 3 + 2];

            players[i] = new Player(playerNickName, cart1, cart2, cart3);

            System.out.println(players[i]);
        }
    }

    private int getPlayersNumber() {
        int playersNumber = ui.uiInt("Введите количество игроков:");
        players = new Player[playersNumber];
        return playersNumber;
    }
}
