public class Node {
    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}
class SinglyLinkedList {
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void push(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
}
class Exercise {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.push(5);  // Success
        int size = singlyLinkedList.size;  // 1
        int head = singlyLinkedList.head.value; // 5
        int tail = singlyLinkedList.tail.value; // 5

        singlyLinkedList.push(10);    // Success
        size = singlyLinkedList.size;      // 2
        head = singlyLinkedList.head.value;    // 5
        int first = singlyLinkedList.head.next.value;  // 10
        tail = singlyLinkedList.tail.value;    // 10

        System.out.println("Size: " + size);
        System.out.println("Head: " + head);
        System.out.println("First Next: " + first);
        System.out.println("Tail: " + tail);
    }
}

