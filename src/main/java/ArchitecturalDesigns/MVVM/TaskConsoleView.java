package ArchitecturalDesigns.MVVM;

import java.util.Scanner;

public class TaskConsoleView {
    private final TaskViewModel taskViewModel;

    public TaskConsoleView(TaskViewModel taskViewModel) {
        this.taskViewModel = taskViewModel;

        // Register a callback to update the View when data changes
        taskViewModel.setOnTasksUpdated(this::displayTasks);
    }

    public void displayTasks() {
        System.out.println("\nCurrent Tasks:");
        taskViewModel.getTasks().forEach(task -> System.out.println("- " + task));
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter a task to add: ");
                    String task = scanner.nextLine();
                    taskViewModel.addTask(task);
                }
                case 2 -> {
                    System.out.print("Enter a task to remove: ");
                    String task = scanner.nextLine();
                    taskViewModel.removeTask(task);
                }
                case 3 -> displayTasks(); // Manually show tasks
                case 4 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
