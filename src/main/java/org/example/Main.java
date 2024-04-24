package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n----- To-Do List Menu -----");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Completed");
            System.out.println("3. Update Task Details");
            System.out.println("4. Delete Task");
            System.out.println("5. View Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    scanner.nextLine(); // Consume newline
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(title, description);
                    toDoList.addTask(newTask);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.print("Enter index of task to mark as completed: ");
                    int indexComplete = scanner.nextInt();
                    toDoList.markTaskAsCompleted(indexComplete);
                    System.out.println("Task marked as completed!");
                    break;
                case 3:
                    System.out.print("Enter index of task to update: ");
                    int indexUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    Task updatedTask = new Task(newTitle, newDescription);
                    toDoList.updateTask(indexUpdate, updatedTask);
                    System.out.println("Task details updated successfully!");
                    break;
                case 4:
                    System.out.print("Enter index of task to delete: ");
                    int indexDelete = scanner.nextInt();
                    toDoList.deleteTask(indexDelete);
                    System.out.println("Task deleted successfully!");
                    break;
                case 5:
                    System.out.println("\n----- Tasks -----");
                    int taskCount = 1;
                    for (Task task : toDoList.getTasks()) {
                        System.out.println("Task " + taskCount++);
                        System.out.println("Title: " + task.getTitle());
                        System.out.println("Description: " + task.getDescription());
                        System.out.println("Completed: " + (task.isCompleted() ? "Yes" : "No"));
                        System.out.println("-----------------");
                    }
                    break;
                case 6:
                    System.out.println("Exiting the To-Do List application.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

