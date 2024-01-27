package lesson30.task4;

import java.util.HashMap;
import java.util.Map;

public class Contacts {

    public static void main(String[] args) {

    Map<String,String> contacts = new HashMap<>();

        contacts.put("12345","Ivanov");
        contacts.put("54321","Petrov");
        contacts.put("123123","Sidorov");
        contacts.put("55555","Greb");

        System.out.println(contacts.get("55555"));

    }
}
