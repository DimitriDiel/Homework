package Consultation.lotto2;

import Consultation.lotto2.service.LottoGame;

public class LottoApp {
    public static void main(String[] args) {

        LottoGame game = new LottoGame(15, 90);

        game.startGame();
    }
}