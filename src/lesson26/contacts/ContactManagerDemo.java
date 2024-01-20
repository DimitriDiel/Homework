package lesson26.contacts;

public class ContactManagerDemo {
    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();

        Contact mark = new Contact("Mark","12345");
        Contact alex = new Contact("Alex","54321");
        Contact olga = new Contact("Olga","11111");
        Contact stefan = new Contact("Stefan","22222");
        Contact cristian = new Contact("Cristian","55555");

        contactManager.addContact(mark);
        contactManager.addContact(alex);
        contactManager.addContact(olga);
        contactManager.addContact(stefan);
        contactManager.addContact(cristian);


        System.out.println(contactManager.getContacts());

        contactManager.addContact(cristian);

        contactManager.removeContact(stefan);

        System.out.println(contactManager.getContacts());


        System.out.println(contactManager.getContactByName("Olga"));

        System.out.println(contactManager.getContactByPhoneNumber("54321"));


    }
}
