import java.util.concurrent.atomic.AtomicLong;

public class InfiniteNumberGenerator {
    private AtomicLong counter;

    public InfiniteNumberGenerator() {
        this.counter = new AtomicLong(0);
    }

    public long getNextNumber() {
        return counter.getAndIncrement();
    }

    public void reset() {
        counter.set(0);
    }

    public static void main(String[] args) {
        InfiniteNumberGenerator generator = new InfiniteNumberGenerator();

        // Generate and print numbers indefinitely
        while (true) {
            long number = generator.getNextNumber();
            System.out.println("Number: " + number);

            // Simulate some delay between numbers
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
