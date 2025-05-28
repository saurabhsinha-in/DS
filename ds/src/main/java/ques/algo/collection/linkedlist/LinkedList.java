package ques.algo.collection.linkedlist;

public class LinkedList {
	Node head; // head of list

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = this.head;
		this.head = newNode;
	}

	/*
	 * This function is in LinkedList class. Inserts a new node after the given
	 * prev_node. This method is defined inside LinkedList class shown above
	 */
	public void insertAfter(Node prev_node, int new_data) {
		Node newNode = new Node(new_data);

		while (head != null) {
			if (head.getData() == prev_node.getData()) {
				newNode.next = head.next;
				head.next = newNode;
				break;
			}
			head = head.next;
		}
	}

	/**
	 * This is to append the data in the end
	 * 
	 * @param new_data
	 */
	public LinkedList append(int new_data) {
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new Node(new_data);

		return this;
	}
	
	public LinkedList append(Node new_data) {
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new_data;

		return this;
	}

	/**
	 * This is to delete an element on the basis of the key
	 * 
	 * @param key
	 */
	public void delete(int key) {
		Node prevNode = null;
		Node currentNode = head;
		while (currentNode != null) {
			if (key == currentNode.getData()) {
				prevNode.next = currentNode.next;
				currentNode = null;
				break;
			} else {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
		}
	}

	/**
	 * This is to delete an element on the basis of the position Input: position =
	 * 1, Linked List = 8->2->3->1->7 Output: Linked List = 8->3->1->7
	 * 
	 * Input: position = 0, Linked List = 8->2->3->1->7 Output: Linked List =
	 * 2->3->1->7
	 */
	public void deletePos(int position) {
		Node currNode = head;
		Node prevNode = null;
		int counter = 0;
		while (counter != position) {
			prevNode = currNode;
			currNode = currNode.next;
			counter++;
		}
		if (prevNode != null && counter == position) {
			prevNode.next = currNode.next;

		} else {
			head = currNode.next;
		}
	}

	/**
	 * This is to find out the size of the LinkedList
	 */
	public int size() {
		Node node = head;
		int counter = 0;
		while (node != null) {
			node = node.next;
			counter++;
		}
		return counter;
	}

	/**
	 * This is to check whether the key is present or not.
	 * 
	 * @param key
	 * @return
	 */
	public boolean isKeyPresent(int key) {
		boolean flag = false;
		Node node = head;
		while (node != null) {
			if (key == node.getData()) {
				flag = true;
				break;
			}
			node = node.next;
		}
		return flag;
	}

	/**
	 * This is to get the value of particular index Write a GetNth() function that
	 * takes a linked list and an integer index and returns the data value stored in
	 * the node at that index position. Example:
	 * 
	 * Input: 1->10->30->14, index = 2 Output: 30 The node at index 2 is 30
	 * https://www.geeksforgeeks.org/write-a-function-to-get-nth-node-in-a-linked-list/
	 * 
	 * 
	 * @param index
	 * @return
	 */
	// TODO
	public int indexValue(int index) {

		return 0;
	}

	/**
	 * Given a Linked List and a number n, write a function that returns the value
	 * at the n�th node from end of the Linked List. For example, if input is below
	 * list and n = 3, then output is �B�
	 * 
	 * A->B->C->D->null
	 * 
	 * Maintain two pointers � reference pointer and main pointer.
	 * Initialize both reference and main pointers to head. 
	 * First move reference pointer to n nodes from head. 
	 * Now move both pointers one by one until reference pointer reaches end. 
	 * Now main pointer will point to nth node from the end.
	 * Return main pointer.
	 * 
	 * @param index
	 * @return
	 */

	public int indexValueFrmLast(int index) {
		Node mainPtr = head;
		Node refPtr = head;
		int counter = 0;
		while(refPtr != null && counter != index) {
			refPtr = refPtr.next;
			counter++;
		}
		
		while(refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr.getData();
	}

	public void reverseList(){
		Node curr = head, prev = null, next;
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}

}
