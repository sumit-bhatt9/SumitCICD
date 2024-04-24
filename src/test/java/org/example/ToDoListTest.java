package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoListTest {

    @Test
    void testAddTask() {
        ToDoList toDoList = new ToDoList();
        Task task = new Task("Title", "Description");
        toDoList.addTask(task);
        Assertions.assertEquals(1, toDoList.getTasks().size());
    }

    @Test
    void testMarkTaskAsCompleted() {
        ToDoList toDoList = new ToDoList();
        Task task = new Task("Title", "Description");
        toDoList.addTask(task);

        toDoList.markTaskAsCompleted(0);

        Assertions.assertTrue(toDoList.getTasks().get(0).isCompleted());
    }

    @Test
    void testUpdateTask() {
        ToDoList toDoList = new ToDoList();
        Task task = new Task("Title", "Description");
        toDoList.addTask(task);

        Task updatedTask = new Task("Updated Title", "Updated Description");
        toDoList.updateTask(0, updatedTask);

        Assertions.assertEquals("Updated Title", toDoList.getTasks().get(0).getTitle());
        Assertions.assertEquals("Updated Description", toDoList.getTasks().get(0).getDescription());
    }

    @Test
    void testDeleteTask() {
        ToDoList toDoList = new ToDoList();
        Task task = new Task("Title", "Description");
        toDoList.addTask(task);

        toDoList.deleteTask(0);

        Assertions.assertEquals(0, toDoList.getTasks().size());
    }
}

