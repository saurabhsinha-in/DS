package ds.udemy.ll;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(5);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */

    }
}
