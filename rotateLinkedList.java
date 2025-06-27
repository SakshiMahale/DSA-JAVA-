class Node {
    public int value;
    public Node next;

    Node() {}
    
    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void push(int nodeValue) {
        if (head == null) {
            insertSinglyLinkedList(nodeValue);
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }
    }

    // Rotate the linked list after 'number' nodes
    public void rotate(int number) {
        if (head == null || number <= 0 || number >= size) {
            System.out.println("CANNOT ROTATE");
            return;
        }

        Node current = head;
        int count = 1;

        // Traverse to the node just before the rotation point
        while (count < number && current != null) {
            current = current.next;
            count++;
        }

        if (current == null || current.next == null) {
            return; // Nothing to rotate
        }

        Node newHead = current.next;
        current.next = null;
        tail.next = head;
        head = newHead;

        // Update tail
        tail = current;
        System.out.println("List rotated after " + number + " nodes.");
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

class Main {
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        System.out.println("Original list:");
        obj.printList(); // 1 -> 2 -> 3 -> 4 -> 5 -> null

        obj.rotate(2); // Rotate after 2 nodes

        System.out.println("Rotated list:");
        obj.printList(); // Expected: 3 -> 4 -> 5 -> 1 -> 2 -> null
    }
}
