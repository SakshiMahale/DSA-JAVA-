class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
class CircularLinkedList {
    
    Node head;
    Node tail;
    int length;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
            newNode.next = newNode; // Pointing to itself to make the list circular
        } else {
            this.tail.next = newNode;
            newNode.next = this.head;
            this.tail = newNode;
        }
        this.length++;
    }

    @Override
    public String toString() {
        if (this.length == 0) {
            return "";
        }

        Node tempNode = this.head;
        StringBuilder result = new StringBuilder();

        do {
            result.append(tempNode.value);
            tempNode = tempNode.next;
            if (tempNode != this.head) {
                result.append(" -> ");
            }
        } while (tempNode != this.head);

        return result.toString();
    }

    public boolean deleteByValue(int value) {
    if (head == null) {
        return false;
    }

    Node current = head;
    Node prev = tail;
    boolean found = false;

    // Only one node in the list
    if (head == tail && head.value == value) {
        head = null;
        tail = null;
        length--;
        return true;
    }

    // Traverse until you loop back to head
    do {
        if (current.value == value) {
            found = true;
            // If deleting head
            if (current == head) {
                head = head.next;
                tail.next = head;
            } 
            // If deleting tail
            else if (current == tail) {
                tail = prev;
                tail.next = head;
            } 
            // Deleting a middle node
            else {
                prev.next = current.next;
            }

            length--;
            return true;
        }

        prev = current;
        current = current.next;
    } while (current != head);

    return false; // Value not found
}

}
class Main{
public static void main(String[] args){
    CircularLinkedList obj = new CircularLinkedList();
    obj.append(1);
    obj.append(2);
    obj.append(3);

    System.out.println("Before deletion: " + obj.toString());

    System.out.println("Delete 2: " + obj.deleteByValue(2));  // true
    System.out.println("Delete 5: " + obj.deleteByValue(5));  // false

    System.out.println("After deletion: " + obj.toString());
}
}
