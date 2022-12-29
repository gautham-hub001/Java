package DataStructures;
// Stack implementation using arrays is already there in collections

// The advantage of using a linked list over arrays is that it is possible to implement a stack that can grow or shrink
// as much as needed. Using an array will restrict the maximum capacity of the array, which can lead to stack overflow.
// Here each new node will be dynamically allocated, so overflow is not possible unless memory is exhausted.

// https://www.techiedelight.com/stack-implementation-using-linked-list/
class Stack {
    private Node top;
    private int size;
    Stack() {
        this.top = null;
        this.size = 0;
    }
    void push(int x) {
        Node temp = new Node(x);
        if(temp == null) {
            System.out.println("Stack Overflow"); // heap memory is full
            return;
        }
        temp.next = top;
        top = temp;
        size++;
    }
    int pop() {
        if(top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }
    int peek() {
        if(top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return top.data;
    }
    int size() {
        return size;
    }
    boolean empty() {
        return top == null;
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println("stack is empty: " + s.empty());
        s.pop();
        System.out.println("stack is empty: " + s.empty());
    }
}
