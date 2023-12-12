package lesson16.Tasks;

public class PhoneDemo {
    public static void main(String[] args) {

        SimCard simCard = new SimCard(911);

        Phone phone = new Phone(111,"Samsung");

        PhoneService phoneService = new PhoneService();

        phoneService.insertSimCard(phone,simCard);

        System.out.println(phone);

        SimCard newSimCard = new SimCard(103);

        phoneService.changeSimCard(phone,newSimCard);

        SimCard removedSimCard = phoneService.changeSimCard(phone,newSimCard);

        System.out.println(removedSimCard);

        System.out.println(phone);

        phoneService.receivedSms(phone,"Hello!");

        System.out.println(phone);

        phoneService.receivedSms(phone,"Hello!");

        phoneService.receivedSms(phone,"Hello!");

        phoneService.receivedSms(phone,"Hello!");

        phoneService.receivedSms(phone,"Hello!");

        phoneService.receivedSms(phone,"Hello!");

        phoneService.receivedSms(phone,"Hello!");

        phoneService.receivedSms(phone,"Hello!");

        phoneService.receivedSms(phone,"Hello!");

        phoneService.receivedSms(phone,"Hello!");

        System.out.println(phone);

        phoneService.receivedSms(phone,"Hello!");

        System.out.println(phone);

        phoneService.deleteSmsMessage(phone,0);

        System.out.println(phone);

        phoneService.deleteAllMessages(phone);

        System.out.println(phone);

        phoneService.removeSimCard(phone);

        SimCard removedSimCard1 = phoneService.removeSimCard(phone);

        System.out.println(removedSimCard1);

        System.out.println(phone);


    }
}
