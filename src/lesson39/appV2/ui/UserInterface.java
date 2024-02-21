package lesson39.appV2.ui;

import lesson39.appV2.dto.ClientRequest;
import lesson39.appV2.dto.ClientRequestFind;
import lesson39.appV2.service.TaskServiceAddOrUpdate;
import lesson39.appV2.service.TaskServiceFind;

public class UserInterface {

    private final TaskServiceAddOrUpdate addOrUpdate;
    private final TaskServiceFind serviceFind;

    public UserInterface(TaskServiceAddOrUpdate addOrUpdate, TaskServiceFind serviceFind) {
        this.addOrUpdate = addOrUpdate;
        this.serviceFind = serviceFind;
    }


    public void menu() {

        ClientRequest request1 = new ClientRequest(0,"task1","description1 ");
        ClientRequest request2 = new ClientRequest(0,"task2","description2 ");
        ClientRequest request3 = new ClientRequest(0,"task3","description3 ");

        addOrUpdate.add(request1);
        addOrUpdate.add(request2);
        addOrUpdate.add(request3);

        System.out.println(serviceFind.findAll());

        ClientRequestFind requestFind1 = new ClientRequestFind(1,"");
        ClientRequestFind requestFind2 = new ClientRequestFind(0,"task2");
        ClientRequestFind requestFind3 = new ClientRequestFind(2,"task3");


        System.out.println("------- Поиск по id --------");

        System.out.println(serviceFind.findBy(requestFind1));
        System.out.println("------- Поиск по name --------");

        System.out.println(serviceFind.findBy(requestFind2));

        System.out.println("------- Поиск по id и по name --------");

        System.out.println(serviceFind.findBy(requestFind3));

    }
}
