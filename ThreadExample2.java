/**
 * There are 2 ways to create a thread.
 * 1. overriding run() of Thread class
 * 2. overriding run() of Runnable interface
 */

// 2. Runnable interface
// For runnable interface, the thread can be run by passing an instance of the class to Thread object's constructor and
// then calling the thread's start() method:
// advantage in case Runnable is you can implement or extend other interfaces or  classes
public class ThreadExample2 implements Runnable {
    public static void main(String[] args) {
        ThreadExample2 obj = new ThreadExample2();
        Thread thread = new Thread(obj); // in the end, Thread class is used in Runnable example
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}