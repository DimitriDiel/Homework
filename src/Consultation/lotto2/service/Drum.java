package Consultation.lotto2.service;

public class Drum {

    private int[] drum;

    public void prepareGameDrum(int numberInTheDrum) {
        // Создание и заполнение барабана
        drum = new int[numberInTheDrum];
        for (int i = 1; i <= numberInTheDrum; i++) {
            drum[i - 1] = i;
        }

        for (int i = drum.length - 1; i > 1; i--) {
            int j = (int) (Math.random() * i);
            int temp = drum[i];
            drum[i] = drum[j];
            drum[j] = temp;
        }
    }

    public void setDrum(int[] drum) {
        this.drum = drum;
    }

    public int[] getDrum() {
        return drum;
    }
}
