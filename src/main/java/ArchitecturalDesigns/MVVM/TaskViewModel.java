package ArchitecturalDesigns.MVVM;

import java.util.List;

public class TaskViewModel implements Observer {
    private final TaskModel taskModel;
    private Runnable onTasksUpdated; // Callback for notifying the View

    public TaskViewModel() {
        taskModel = new TaskModel();
        taskModel.addObserver(this); // Subscribe to Model changes
    }

    public List<String> getTasks() {
        return taskModel.getTasks();
    }

    public void addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            System.out.println("Task cannot be empty!");
            return;
        }
        taskModel.addTask(task);
    }

    public void removeTask(String task) {
        taskModel.removeTask(task);
    }

    // Allow the View to register a callback for updates
    public void setOnTasksUpdated(Runnable callback) {
        this.onTasksUpdated = callback;
    }

    @Override
    public void update() {
        if (onTasksUpdated != null) {
            onTasksUpdated.run(); // Notify the View
        }
    }
}
