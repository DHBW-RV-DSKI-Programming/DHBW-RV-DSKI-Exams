package main.java;

public class TaskScheduler {

    private String[] tasks;
    private int[] priorities;

    public TaskScheduler(String[] taskList, int[] taskPriorities) {
        this.tasks = taskList;
        this.priorities = taskPriorities;
    }

    public void executeTasks() {
        while (hasRemainingTasks()) { // 1 Punkt
            int highestPriorityIndex = findHighestPriorityIndex(); // 1 Punkt
            System.out.println("- " + tasks[highestPriorityIndex]); // 0,5 Punkte
            priorities[highestPriorityIndex] = -1;  // 1 Punkt
        }
    }

    private boolean hasRemainingTasks() { // 0,5 Punkte
        for (int priority : priorities) { // 0,5 Punkte
            if (priority != -1) { // 0,5 Punkte
                return true; // 0,5 Punkte
            }
        }
        return false; // 0,5 Punkte
    }

    private int findHighestPriorityIndex() { // 1 Punkt
        int maxPriority = -1; // 0,5 Punkte
        int maxIndex = 0; // 0,5 Punkte

        for (int i = 0; i < priorities.length; i++) { // 1 Punkt
            if (priorities[i] > maxPriority) { // 1 Punkt
                maxPriority = priorities[i]; // 1 Punkt
                maxIndex = i; // 1 Punkt
            }
        }
        return maxIndex; // 1 Punkt
    }

    public static void main(String[] args) {
        String[] taskList = {"Feed the office plant", "Pretend to understand regex", "Debug code written at 3am", "Explain to manager why build broke"};
        int[] priorities = {3, 1, 4, 2};

        TaskScheduler scheduler = new TaskScheduler(taskList, priorities);
        scheduler.executeTasks();
    }
}

// Gesamtpunktzahl: 13 Punkte