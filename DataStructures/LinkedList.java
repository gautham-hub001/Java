package DataStructures;

class Node {
    int data;
    Node next;
    Node(int data) { // constructor for initialization
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    static void printList(Node head) {
        Node curr = head;
        while (curr!=null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        printList(head);
    }
}
