package ds.udemy.ll;


public class LinkedList {

    private Node head;
    private Node tail;
    private int length;


    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public int getLength() {
        int count = 0;
        Node h = head;
        if (h != null) {
            while (h != null) {
                count = count + 1;
                h = h.next;

            }
        }
        System.out.println("Length: " + count);
        return count;
    }

    public void append(int value) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(value);

    }

    public void removeLast() {
        Node h = head;
        while (h != null) {
            if (h.next.next == null) {
                h.next = null;
            }
            h = h.next;
        }
    }

    public void removeFirst() {
        Node h = head;
        if (h != null && h.next != null) {
            head = h.next;
        }
    }

    public void prepend(int value) {
        Node h = head;
        Node newHead = new Node(value);
        if (h != null) {

            newHead.next = head;
        }
        head = newHead;
    }
}
       