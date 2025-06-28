class Node {
    
    int value;
    Node next;

    // Constructor to create a new node
    public Node(int value) {
        this.value = value;
        this.next = null;
        
    }
}
 class CSLinkedList {
    Node head;
    Node tail;
    int size = 0;

    public CSLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head; // make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // maintain circular link
        }

        size++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // maintain circular link
        }

        size++;
    }

    @Override
public String toString() {
    if (head == null) return "";

    Node current = head;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < size; i++) {
        sb.append(current.value).append(" -> ");
        current = current.next;
    }

    // Remove trailing arrow
    if (sb.length() >= 4) {
        sb.setLength(sb.length() - 4);
    }

    return sb.toString();
}

}

// Test class with main method
class Main {
    public static void main(String[] args) {
        CSLinkedList list = new CSLinkedList();
        list.append(10);
        list.prepend(5);
        list.append(20);

        System.out.println(list.toString());
    }
}
