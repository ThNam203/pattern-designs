package ArchitecturalDesigns.MVVM;

import java.util.ArrayList;
import java.util.List;

public class TaskModel implements Observable {
    private final List<String> tasks;
    private final List<Observer> observers;

    public TaskModel() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers(); // Notify observers when data changes
    }

    public void removeTask(String task) {
        if (tasks.remove(task)) {
            notifyObservers(); // Notify observers when data changes
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
