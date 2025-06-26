class Node {
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

    // ✅ REQUIRED METHOD: pop() — Removes and returns the last node
    public Node pop() {
        if (head == null) {
            return null;
        }

        Node removed;

        if (size == 1) {
            removed = head;
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            removed = tail;
            current.next = null;
            tail = current;
        }

        size--;
        return removed;
    }

}

class Exercise {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.push(5);
        list.push(10);
        list.push(15);

        // Print all elements in the linked list before popping
        System.out.println("Original List:");
        Node current = list.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        // Pop elements one by one and print them
        System.out.println("\nPopping:");
        Node popped = list.pop();
        System.out.println("Popped: " + (popped != null ? popped.value : "null")); // 15

        popped = list.pop();
        System.out.println("Popped: " + (popped != null ? popped.value : "null")); // 10

        popped = list.pop();
        System.out.println("Popped: " + (popped != null ? popped.value : "null")); // 5

        popped = list.pop();
        System.out.println("Popped: " + (popped != null ? popped.value : "null")); // null (empty list)
    }
}
