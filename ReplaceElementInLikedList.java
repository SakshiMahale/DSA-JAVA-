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

    public boolean set(int index, int value) {
        if (index < 0 || index >= size) return false;

        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                current.value = value;
                return true;
            }
            current = current.next;
            count++;
        }
        return false;
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
        list.printList(); // 10 -> 20 -> 30 -> null

        boolean updated = list.set(1, 99); // should update index 1 to 99
        System.out.println("Set successful: " + updated); // true

        list.printList(); // 10 -> 99 -> 30 -> null
    }
}
