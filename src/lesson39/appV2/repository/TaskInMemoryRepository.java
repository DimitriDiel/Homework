package lesson39.appV2.repository;

import lesson39.appV2.entity.Task;

import java.util.*;

public class TaskInMemoryRepository implements InMemoryRepository{

    private int taskId;

    private List<Task> tasks = new ArrayList<>();

    @Override
    public Task add(Task newTask){
        newTask.setId(++taskId);
        tasks.add(newTask);
        return newTask;
    }

    @Override
    public Optional<Task> findById(Integer id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Task> findByTaskName(String taskName) {
        for ( Task task : tasks) {
            if (task.getName().equals(taskName)) {
                return Optional.of(task);
            }
        }
        return Optional.empty();

    }

    @Override
    public List<Task> findAll(){return tasks;}
}
