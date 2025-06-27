class Node {
    public int value;
    public Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Corrected push method
    public void push(int nodeValue) {
        Node node = new Node(nodeValue);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return null;
        }

        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                System.out.println("Element found is: " + current.value);
                return current;
            }
            current = current.next;
            count++;
        }

        return null;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.push(10);
        obj.push(12);
        obj.push(14);
        obj.push(16);

        obj.printList();   // Expected: 10 -> 12 -> 14 -> 16 -> null
        obj.get(1);        // Expected: Element found is: 12
    }
}
