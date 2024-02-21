package lesson39.appV2.service;

import lesson39.appV2.dto.ClientRequestFind;
import lesson39.appV2.dto.ClientResponse;
import lesson39.appV2.entity.Task;
import lesson39.appV2.repository.InMemoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskServiceFind {
    private final InMemoryRepository repository;

    public TaskServiceFind(InMemoryRepository repository) {
        this.repository = repository;
    }

    public ClientResponse<List<Task>> findAll(){
        List<Task> tasks = repository.findAll();
        if (!tasks.isEmpty()) {
            return new ClientResponse<>(200,tasks,"Список задач");
        } else {
            return new ClientResponse<>(250,tasks, "База данных пуста!");
        }
    }

    public ClientResponse<List<Task>> findBy(ClientRequestFind requestFind){

        List<Task> foundedTasks = new ArrayList<>();

        if (requestFind.getId() > 0) {
            foundedTasks.add(findById(requestFind).getResponseInfo());
        }

        if (!requestFind.getName().isEmpty()) {
            foundedTasks.add(findByName(requestFind).getResponseInfo());
        }

        if (!foundedTasks.isEmpty()) {
            return new ClientResponse<>(200, foundedTasks, "Найденные элементы");
        }
        return new ClientResponse<>(400, new ArrayList<>(), "Поля для поиска незаполненны");

    }

    private ClientResponse<Task> findById(ClientRequestFind requestFind){

            Optional<Task> foundTaskOpt = repository.findById(requestFind.getId());

            if (foundTaskOpt.isPresent()) {
                return new ClientResponse<>(200, foundTaskOpt.get(), "Найден элемент с id = " + requestFind.getId());
            } else {
                return new ClientResponse<>(400, new Task(), "Элемент не найден  ");
            }
    }

    private ClientResponse<Task> findByName(ClientRequestFind requestFind){

        Optional<Task> foundTaskOpt = repository.findByTaskName(requestFind.getName());

        if (foundTaskOpt.isPresent()) {
            return new ClientResponse<>(200, foundTaskOpt.get(), "Найден элемент с Name = " + requestFind.getName());
        } else {
            return new ClientResponse<>(400, new Task(), "Элемент не найден  ");
        }
    }
}
