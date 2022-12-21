/**
 * There are 2 ways to create a thread.
 * 1. overriding run() of Thread class
 * 2. overriding run() of Runnable interface
 */

// 1. Thread class
public class ThreadExample1 extends Thread {
    public static void main(String[] args) {
        ThreadExample1 thread = new ThreadExample1();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}