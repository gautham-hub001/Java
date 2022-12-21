// concurrency problem - when both main program and threads read/write same variable, the value of the variable is unpredictable.

public class ThreadExample3 extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ThreadExample3 thread = new ThreadExample3();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);


        amount =0;
        // solution to concurrency problem - isAlive()
        ThreadExample3 thread2 = new ThreadExample3();
        thread2.start();
        while(thread2.isAlive()) {
            System.out.println("Waiting...");
        }
        // Update amount and print its value
        System.out.println("amount: " + amount);
        amount++;
        System.out.println("amount: " + amount);
    }
    public void run() {
        amount++;
    }
}
