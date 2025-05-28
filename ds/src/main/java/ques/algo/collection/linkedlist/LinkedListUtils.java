package ques.algo.collection.linkedlist;

public class LinkedListUtils {

	/**
	 * This is to create static LinkedList
	 *
	 * @return
	 */
	public LinkedList getStaticLinkedList() {
		/* Start with the empty list. */
		LinkedList llist = new LinkedList();

		llist.head = new Node(1001);
		Node second = new Node(102);
		Node third = new Node(113);

		/*
		 * Three nodes have been allocated dynamically. We have refernces to these three
		 * blocks as first, second and third
		 *
		 * llist.head second third | | | | | | +----+------+ +----+------+ +----+------+
		 * | 1 | null | | 2 | null | | 3 | null | +----+------+ +----+------+
		 * +----+------+
		 */

		llist.head.next = second; // Link first node with the second node

		/*
		 * Now next of first Node refers to second. So they both are linked.
		 *
		 * llist.head second third | | | | | | +----+------+ +----+------+ +----+------+
		 * | 1 | o-------->| 2 | null | | 3 | null | +----+------+ +----+------+
		 * +----+------+
		 */

		second.next = third; // Link second node with the third node

		/*
		 * Now next of second Node refers to third. So all three nodes are linked.
		 *
		 * llist.head second third | | | | | | +----+------+ +----+------+ +----+------+
		 * | 1 | o-------->| 2 | o-------->| 3 | null | +----+------+ +----+------+
		 * +----+------+
		 */

		return llist;
	}

	public Node setStaticNode(int arr[]){
 		Node node = new Node();
		 Node head = node;
		for(int i: arr){
			Node temp = new Node(i);
			node.next = temp;
			node = node.next;
		}
		return head.next;
	}

	public void print(Node head, String msg){
		Node node = head;
		StringBuilder sb = new StringBuilder();
		while(node != null){
			sb.append(node.data);
			if(node.next != null)sb.append(",");
			node = node.next;
		}
		System.out.println(msg+" = "+sb);

	}


	/**
	 * This is to traverse the list and print the details
	 *
	 * @param list
	 */
	public void printList(LinkedList list) {
		printList(list, null);
	}

	public void printList(LinkedList list, String msg) {
		if (msg != null) {
			System.out.println("" + msg);
		}
		if (list != null) {
			Node head = list.head;
			while (head != null) {
				System.out.print(head.getData() + " ");
				head = head.next;
			}
			System.out.println();
			if (msg != null && msg.toLowerCase().contains("after")) {
				System.out.println();
			}
		}
	}

	public boolean isMatch(LinkedList expectedList, LinkedList actualList) {
		boolean flag = false;
		Node expList = expectedList.head;
		Node actList = actualList.head;
		while (expList != null && actList != null) {

			if (expList.data == actList.data) {
				flag = true;
			} else {
				flag = false;
				break;
			}
			expList = expList.next;
			actList = actList.next;
			if (expList == actList) {
				flag = true;
			}
		}
		return flag;
	}

	public boolean isMatch(Node expectedNode, Node actualNode) {
		boolean flag = false;
		Node expList = expectedNode;
		Node actList = actualNode;
		while (expList != null && actList != null) {

			if (expList.data == actList.data) {
				flag = true;
			} else {
				flag = false;
				break;
			}
			expList = expList.next;
			actList = actList.next;
			if (expList == actList) {
				flag = true;
			}
		}
		return flag;
	}

	/**
	 * This is to add the node in the beginning.
	 *
	 * @param llt
	 * @param node
	 * @return
	 */
	public LinkedList addStartNode(LinkedList llt, Node node) {
		node.next = llt.head;
		llt.head = node;
		return llt;
	}

	/**
	 * This is to apply the node after a specific location
	 *
	 * @param llt
	 * @param newNode
	 * @param locNode
	 * @return
	 */
	public LinkedList addNodeSpecificLoc(LinkedList llt, Node newNode, Node locNode) {
		int nodeVal = locNode.getData();
		Node head = llt.head;
		while (head != null) {
			if (head.getData() == nodeVal) {
				Node tempNode = head.next;
				head.next = newNode;
				newNode.next = tempNode;
				break;
			}
			head = head.next;
		}
		return llt;
	}

	public LinkedList addNodeEnd(LinkedList llt, Node newNode) {
		Node head = llt.head;

		while (head != null) {
			if (head.next == null) {
				head.next = newNode;
				break;
			}
			head = head.next;
		}

		return llt;
	}

	/**
	 * Find the middle of a given linked list in C and Java Given a singly linked
	 * list, find middle of the linked list. For example, if given linked list is
	 * 1->2->3->4->5 then output should be 3.
	 * <p>
	 * If there are even nodes, then there would be two middle nodes, we need to
	 * print second middle element. For example, if given linked list is
	 * 1->2->3->4->5->6 then output should be 4. Method 1: Traverse the whole linked
	 * list and count the no. of nodes. Now traverse the list again till count/2 and
	 * return the node at count/2. Method 2: Traverse linked list using two
	 * pointers. Move one pointer by one and other pointer by two. When the fast
	 * pointer reaches end slow pointer will reach middle of the linked list.
	 *
	 * @return
	 */
	public int middleElement(LinkedList llt) {
		Node currPtr = llt.head;
		Node midPtr = llt.head;

		while (midPtr != null && midPtr.next != null) {
			currPtr = currPtr.next;
			midPtr = midPtr.next.next;
		}
		return currPtr.getData();
	}

	/**
	 * perm_identity Write a function that counts the number of times a given int
	 * occurs in a Linked List Given a singly linked list and a key, count number of
	 * occurrences of given key in linked list. For example, if given linked list is
	 * 1->2->1->2->1->3->1 and given key is 1, then output should be 4.
	 */
	public int countOccurance(LinkedList llt, int key) {
		Node node = llt.head;
		int count = 0;

		while (node != null) {
			if (key == node.getData()) {
				count++;
			}
			node = node.next;
		}
		return count;
	}

	/**
	 * Write code to with result as skip Node
	 * A,B,C,D,E
	 * result = A,C,E
	 */
	public Node skipNode(Node head) {
		Node temp = head;
		if (head == null) return null;
		if (head.next == null) return head;
		Node dummy = new Node();
		Node result = dummy;
		while (temp != null && temp.next != null) {
			result.next = new Node(temp.data);
			result = result.next;
			temp = temp.next.next;
		}
		return dummy.next;
	}

	/**
	 * Reverse Linked List partially. A Linked LIst given with 2 args start position and position.
	 * LL should be reversed in that section only rest of the things remain as it is
	 */
	public Node reverseNodePartially(Node head, int start, int end){
		Node result = new Node();
		Node dummy = result;
		Node node = head;

		if(node == null) return null;
		if(node.next == null) return head;
		int count = 1;
		boolean flag = false;
		Node rev = new Node();
		while(node != null){
			Node temp = rev;
			while (count>= start && count<=end){
				temp.next = new Node(node.data);
				temp = temp.next;
				node = node.next;
				count++;
				flag = true;
			}

			if(flag){
				dummy.next = reverse(rev.next);

				while(dummy.next != null){
					dummy = dummy.next;
				}
				flag = false;
			}else{
				dummy.next = new Node(node.data);
				dummy = dummy.next;
				node = node.next;
				count++;
			}
		}

		return result.next;

	}
	public  Node halfReverse(Node node, int k) {
		Node current = node;
		Node firstHalf = new Node(0);
		Node result = firstHalf;
		Node dummy = firstHalf;
		Node secHalf = new Node(0);
		if(current == null) return null;
		if(current.next == null) return node;

		int count = 1;
		while(current!= null && count <=k){
			dummy.next = new Node(current.data);
			dummy = dummy.next;
			current = current.next;
			count++;
		}

		dummy = reverse(firstHalf.next);
		secHalf  = reverse(current);
		while(dummy != null){
			firstHalf.next = dummy;
			dummy = dummy.next;
			firstHalf = firstHalf.next;
		}
		firstHalf.next = secHalf;
		return result.next;
	}

	private  Node reverse(Node head){
		Node current = head, prev = null, nxt;
		if(current == null) return null;
		if(current.next == null) return head;
		while(current != null){
			nxt = current.next;
			current.next = prev;
			prev = current;
			current = nxt;
		}
		return prev;
	}


}
