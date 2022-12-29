package DataStructures;

// Contrary to stack, queue array implementation is not there in collections but queue using linkedlist is there in collections.
// So, this is queue implementation using arrays.

class Queue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    Queue(int capacity) {
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
    }
    void enQueue(int x) {
        if(size == capacity) {
            System.out.println("Queue overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }
    int deQueue() {
        if(size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }
    int peek() {
        if(size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front];
    }
    int size() {
        return size;
    }
    boolean empty() {
        return size == 0;
    }
}
public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(1);
        q.enQueue(2);
        System.out.println(q.deQueue());
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println("queue is empty: "+q.empty());
    }
}
