package ArchitecturalDesigns.MVVM;

public class MVVMDemo {
    public static void main(String[] args) {
        TaskViewModel taskViewModel = new TaskViewModel();
        TaskConsoleView taskConsoleView = new TaskConsoleView(taskViewModel);

        System.out.println("Welcome to the Task Manager!");
        taskConsoleView.showMenu();
    }
}
