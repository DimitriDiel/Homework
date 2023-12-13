package lesson16.Tasks.phone2version.phone;

public class PhoneService {

    /*
    1. Вставить симку
    2. удалить симку
    3. Заменить симку с сохранением номера
    4. Получить смс
    5. удалить какую-то смску

     */

    public boolean insertSimCard(Phone phone, SimCard simCard,int slotSimCard){
        if (phone.getSimSlots(slotSimCard) == null) {
        phone.setSimSlots(slotSimCard,simCard);
        return true;
        } else {
            return false;
        }
    }

    public SimCard removeSimCard(Phone phone, SimCard simCard,int slotSimCard) {
        SimCard removedSimCard = phone.getSimSlots(slotSimCard);
        phone.setSimSlots(slotSimCard,simCard);
        return removedSimCard;
    }

    public SimCard changeSimCard(Phone phone, SimCard newSimCard, int slotSimCard){
            SimCard removedSimCard = phone.getSimSlots(slotSimCard);
            int oldNumber = removedSimCard.getNumber();
            newSimCard.setNumber(oldNumber);
            phone.setSimSlots(slotSimCard,newSimCard);
            removedSimCard.setNumber(0);
            return removedSimCard;

    }

    public boolean receivedSms(Phone phone, String message, int slotSimCard){

        String[] ourSmsMessages = phone.getSimSlots(slotSimCard).getSms();
        int emptyCell = firstEmptyCell(ourSmsMessages);
        if (emptyCell == -1) {
            System.out.println("Нет памяти для новой смс. Удалите прошлые сообщения!");
            return false;
        } else {
            ourSmsMessages[emptyCell] = message;
            return true;
        }
    }

    private int firstEmptyCell(String[] messages){
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteSmsMessage(Phone phone, int smsNumber, int slotSimCard){
        if (smsNumber >= 0 && smsNumber < 10) {
        phone.getSimSlots(slotSimCard).getSms()[smsNumber] = null;
        return true;
        } else {
            System.out.println("Нет сообщения с таким номером!");
            return false;
        }
    }

    public boolean deleteAllMessages(Phone phone, int slotSimCard) {
        String[] newSmsMessages = new String[10];
        phone.getSimSlots(slotSimCard).setSms(newSmsMessages);
        return true;
    }

}
