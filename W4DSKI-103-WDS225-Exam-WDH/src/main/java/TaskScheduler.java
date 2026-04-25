package main.java;

public class TaskScheduler {

    private String[] tasks;
    private int[] priorities;

    public TaskScheduler(String[] taskList, int[] taskPriorities) {
        this.tasks = taskList;
        this.priorities = taskPriorities;
    }

    public void executeTasks() {
        // TODO: Hier Aufgabe 6 implementieren
    }

    // TODO: Hier Aufgabe 6 implementieren

    public static void main(String[] args) {
        String[] taskList = {"Feed the office plant", "Pretend to understand regex", "Debug code written at 3am", "Explain to manager why build broke"};
        int[] priorities = {3, 1, 4, 2};

        TaskScheduler scheduler = new TaskScheduler(taskList, priorities);
        scheduler.executeTasks();
    }
}