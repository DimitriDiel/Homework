package lesson26.contacts;

import java.util.HashSet;
import java.util.Iterator;

public class ContactManager {

    public HashSet<Contact> contacts = new HashSet<>();

    public void addContact(Contact contact){
        if (contacts.isEmpty()){
            contacts.add(contact);
        }
        else if(!contacts.contains(contact)){
            contacts.add(contact);
        } else {
            System.out.println("Контакт с таким именем и номером телефона уже существует");
        }
    }
    public void removeContact(Contact contact){
        if (contacts.contains(contact)){
            contacts.remove(contact);
        } else {
            System.out.println("Такого контакта нет в списке");
        }
    }

    public HashSet<Contact> getContacts() {
        return contacts;
    }

    public HashSet<Contact> getContactByName(String name){

        HashSet<Contact> result = new HashSet<>();

        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()){
            Contact nextContact = iterator.next();
            if (nextContact.getName().equals(name)){
                result.add(nextContact);
                return result;
            }
        }
        return result;

    }
    public HashSet<Contact> getContactByPhoneNumber(String phoneNumber){

        HashSet<Contact> result = new HashSet<>();

        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext()){
            Contact nextContact = iterator.next();
            if (nextContact.getPhoneNumber().equals(phoneNumber)){
                result.add(nextContact);
                return result;
            }
        }
        return result;

    }


}
