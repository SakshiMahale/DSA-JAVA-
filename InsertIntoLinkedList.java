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
        if (head == null) {
            insertSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node(nodeValue);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public boolean insert(int data, int index) {
        if (head == null) {
            System.out.println("LinkedList not created");
            return false;
        } else if (index < 0 || index > size) {
            return false;
        }

        Node newNode = new Node(data);

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (size == 0) {
                tail = newNode;
            }
        } else {
            Node current = head;
            int count = 0;

            while (count < index - 1) {
                current = current.next;
                count++;
            }

            newNode.next = current.next;
            current.next = newNode;

            if (newNode.next == null) {
                tail = newNode;
            }
        }

        size++;
        return true;
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
class Main{
    public static void main(String[] args){
        SinglyLinkedList obj=new SinglyLinkedList();
        obj.push(10);
        obj.push(11);
        obj.push(12);
        obj.push(13);
        
        obj.printList();
        
        obj.insert(4,2);
        obj.printList();
    }
}
