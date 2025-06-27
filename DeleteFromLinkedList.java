class Node {
  public int value;
  public Node next;
  Node(int value){
      this.value=value;
      this.next=null;
  }
}
class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue) {
        Node node = new Node(nodeValue); 
        head = node;
        tail = node;
        size = 1;
        return head;
    }

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

    // ✅ REMOVE by index
    public Node remove(int index) {
        if (index < 0 || index >= size || head == null) {
            System.out.println("Non Deletable");
            return null;
        }

        Node removed;

        // Remove head
        if (index == 0) {
            removed = head;
            head = head.next;
            if (head == null) tail = null; // only one node
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removed = current.next;
            current.next = current.next.next;

            // if tail is removed
            if (removed == tail) {
                tail = current;
            }
        }

        size--;
        return removed;
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
        SinglyLinkedList list = new SinglyLinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);

        list.printList(); // 10 -> 20 -> 30 -> 40 -> null

        Node removed = list.remove(2); // remove element at index 2 (30)
        System.out.println("Removed: " + (removed != null ? removed.value : "none"));

        list.printList(); // 10 -> 20 -> 40 -> null
    }
}
