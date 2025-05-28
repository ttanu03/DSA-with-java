class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Letter: " + c);
            try {
                Thread.sleep(500); // Pause for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        NumberThread thread1 = new NumberThread();
        LetterThread thread2 = new LetterThread();

        thread1.start(); // Starts NumberThread
        thread2.start(); // Starts LetterThread
    }
}