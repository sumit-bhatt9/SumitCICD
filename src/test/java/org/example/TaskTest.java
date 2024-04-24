package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    void testTaskInitialization() {
        Task task = new Task("Title", "Description");
        Assertions.assertEquals("Title", task.getTitle());
        Assertions.assertEquals("Description", task.getDescription());
        Assertions.assertFalse(task.isCompleted());
    }

    @Test
    void testTaskCompletion() {
        Task task = new Task("Title", "Description");
        task.setCompleted(true);
        Assertions.assertTrue(task.isCompleted());
    }

    @Test
    void testTaskUpdate() {
        Task task = new Task("Title", "Description");
        task.setTitle("New Title");
        task.setDescription("New Description");
        Assertions.assertEquals("New Title", task.getTitle());
        Assertions.assertEquals("New Description", task.getDescription());
    }
}
