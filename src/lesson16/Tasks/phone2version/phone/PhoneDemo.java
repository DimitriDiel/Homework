package lesson16.Tasks.phone2version.phone;

import java.util.Arrays;

public class PhoneDemo {
    public static void main(String[] args) {

                Case phoneCase = new Case("Red","leather");
                Phone phone = new Phone(123456789, "Example Model",phoneCase);
                SimCard simCard1 = new SimCard(987654321);
                SimCard simCard2 = new SimCard(123456789);

                PhoneService phoneService = new PhoneService();


                // Проверка вставки сим карты
                boolean inserted = phoneService.insertSimCard(phone, simCard1);
                if (inserted) {
                    System.out.println("Sim карта вставлена: " + phone);
                } else {
                    System.out.println("Ошибка вставки Sim карты.");
                }

                // Проверка получения смс
                phoneService.receivedSms(phone, "Привет!");
                phoneService.receivedSms(phone, "Как дела?");

                System.out.println("Полученные смс: " + Arrays.toString(phone.getSimCard().getSms()));

                // Проверка удаления смс
                phoneService.deleteSmsMessage(phone, 1);
                System.out.println("Смс после удаления: " + Arrays.toString(phone.getSimCard().getSms()));

                // Проверка удаления всех смс
                phoneService.deleteAllMessages(phone);
                System.out.println("Смс после удаления всех: " + Arrays.toString(phone.getSimCard().getSms()));


                // Проверка получения всех смс
                phoneService.receivedSms(phone, "Message1");
                phoneService.receivedSms(phone, "Message2");
                phoneService.receivedSms(phone, "Message3");
                phoneService.receivedSms(phone, "Message4");
                phoneService.receivedSms(phone, "Message5");
                phoneService.receivedSms(phone, "Message6");
                phoneService.receivedSms(phone, "Message7");
                phoneService.receivedSms(phone, "Message8");
                phoneService.receivedSms(phone, "Message9");
                phoneService.receivedSms(phone, "Message10");

                System.out.println("Смс после удаления всех: " + Arrays.toString(phone.getSimCard().getSms()));

                phoneService.receivedSms(phone, "Message11");

                System.out.println("=======================================");
                System.out.println(phone);

                // Проверка замены сим карты
                SimCard removedSim = phoneService.changeSimCard(phone, simCard2);
                System.out.println("Старая сим карта: " + removedSim);
                System.out.println("Новая сим карта: " + phone.getSimCard());

                System.out.println("=======================================");
                System.out.println(phone);

                // Проверка удаления сим карты
                SimCard removed = phoneService.removeSimCard(phone);
                System.out.println("Удаленная сим карта " + removed);
                System.out.println(" Телефон после удаления сим карты: " + phone);


            }

}
