class TaskThread extends Thread {
    private String taskName;

    public TaskThread(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        System.out.println(taskName + " started.");
        try {
            Thread.sleep(2000); // Simulate work (2 seconds)
        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted.");
        }
        System.out.println(taskName + " completed.");
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {
        TaskThread task1 = new TaskThread("Task-1");
        TaskThread task2 = new TaskThread("Task-2");

        task1.start(); // Start Task-1

        try {
            System.out.println("Waiting for Task-1 to finish...");
            task1.join(); // Main thread waits for Task-1 to complete
            System.out.println("Task-1 finished. Now starting Task-2.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        task2.start(); // Start Task-2 after Task-1 finishes
    }
}