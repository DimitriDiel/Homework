package lesson16.tasks.phone2version.phone;

import java.util.Arrays;

public class PhoneDemo {
    public static void main(String[] args) {

                Case phoneCase = new Case("Red","leather");
                Phone phone = new Phone(123456789, "Example Model",phoneCase);
                SimCard simCard1 = new SimCard(987654321);
                SimCard simCard2 = new SimCard(123456789);


                PhoneService phoneService = new PhoneService();


                // Проверка вставки сим карты
                boolean inserted = phoneService.insertSimCard(phone,simCard1,0);
                if (inserted) {
                    System.out.println("Sim карта вставлена: " + phone);
                } else {
                    System.out.println("Ошибка вставки Sim карты.");
                }
                boolean inserted2 = phoneService.insertSimCard(phone,simCard2,1);
                if (inserted) {
                 System.out.println("Sim карта вставлена: " + phone);
                } else {
                    System.out.println("Ошибка вставки Sim карты.");
                 }

                // Проверка получения смс
                phoneService.receivedSms(phone, "Привет!",0);
                phoneService.receivedSms(phone, "Как дела?",0);

                System.out.println("Полученные смс: " + Arrays.toString(phone.getSimSlots(0).getSms()));

                // Проверка удаления смс
                phoneService.deleteSmsMessage(phone, 1,0);
                System.out.println("Смс после удаления: " + Arrays.toString(phone.getSimSlots(0).getSms()));

                // Проверка удаления всех смс
                phoneService.deleteAllMessages(phone,0);
                System.out.println("Смс после удаления всех: " + Arrays.toString(phone.getSimSlots(0).getSms()));


                // Проверка получения всех смс
                phoneService.receivedSms(phone, "Message1",0);
                phoneService.receivedSms(phone, "Message2",0);
                phoneService.receivedSms(phone, "Message3",0);
                phoneService.receivedSms(phone, "Message4",0);
                phoneService.receivedSms(phone, "Message5",0);
                phoneService.receivedSms(phone, "Message6",0);
                phoneService.receivedSms(phone, "Message7",0);
                phoneService.receivedSms(phone, "Message8",0);
                phoneService.receivedSms(phone, "Message9",0);
                phoneService.receivedSms(phone, "Message10",0);

                System.out.println("Смс после удаления всех: " + Arrays.toString(phone.getSimSlots(0).getSms()));

                phoneService.receivedSms(phone, "Message11",0);

                System.out.println("=======================================");
                System.out.println(phone);

                // Проверка замены сим карты
                SimCard removedSim = phoneService.changeSimCard(phone,simCard2,0);
                System.out.println("Старая сим карта: " + removedSim);
                System.out.println("Новая сим карта: " + phone.getSimSlots(0));

                System.out.println("=======================================");
                System.out.println(phone);

                // Проверка удаления сим карты
                SimCard removed = phoneService.removeSimCard(phone,simCard1,0);
                System.out.println("Удаленная сим карта " + removed);
                System.out.println(" Телефон после удаления сим карты: " + phone);


            }

}
