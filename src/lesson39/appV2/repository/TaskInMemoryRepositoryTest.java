package lesson39.appV2.repository;

import lesson39.appV2.entity.Task;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskInMemoryRepositoryTest {

    TaskInMemoryRepository taskInMemoryRepository = new TaskInMemoryRepository();

    @Test
    public void add() {
        Task testTask = new Task("Test","testDesc");
        assertEquals("Объекты должны быть добавлены и совпадать", testTask, taskInMemoryRepository.add(testTask));
    }

    @Test
    public void findById() {
    }

    @Test
    public void findByTaskName() {
    }
}