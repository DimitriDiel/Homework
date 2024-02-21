package lesson39.appV2;

import lesson39.appV2.repository.InMemoryRepository;
import lesson39.appV2.repository.TaskInMemoryRepository;
import lesson39.appV2.service.TaskServiceAddOrUpdate;
import lesson39.appV2.service.TaskServiceFind;
import lesson39.appV2.service.validation.ValidationRequest;
import lesson39.appV2.ui.UserInterface;

public class App {
    public static void main(String[] args) {

        InMemoryRepository repository = new TaskInMemoryRepository();
        ValidationRequest validationRequest = new ValidationRequest();

        TaskServiceAddOrUpdate taskServiceAddOrUpdate = new TaskServiceAddOrUpdate(repository, validationRequest);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);

        UserInterface ui = new UserInterface(taskServiceAddOrUpdate, taskServiceFind);
        ui.menu();
    }
}
