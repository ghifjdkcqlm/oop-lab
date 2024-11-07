class Counter {

    private int count = 0;

    // a. Using a synchronized method to increment the counter
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }

    // b. Using a synchronized block to decrement the counter
    public void decrement() {
        synchronized (this) {
            count--;
            System.out.println(Thread.currentThread().getName() + " decremented count to: " + count);
        }
    }
}

public class labq5 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Thread to increment using synchronized method
        Thread incrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }, "IncrementThread");

        // Thread to decrement using synchronized block
        Thread decrementThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.decrement();
            }
        }, "DecrementThread");

        incrementThread.start();
        decrementThread.start();
    }
}
