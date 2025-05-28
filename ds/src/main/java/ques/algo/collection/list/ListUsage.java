package ques.algo.collection.list;

import ques.algo.collection.linkedlist.Node;

/**
 * 
 * @author saurabh.b.sinha
 *
 */

public class ListUsage {

	/**
	 * * This is to merge 2 sorted list Suppose 1 list is {1,3,5}
	 *  2 List is {2,4,6} Result should come {1,2,3,4,5,6}
	 * 
	 * @param h1 -> 1,3,5
	 * @param h2 -> 2,4,6
	 * @return 1,2,3,4,5,6
	 */
	static Node merge2SortedList(Node h1, Node h2) {
		// This is to create the head node for the beginning pointer
		Node head = new Node(0);

		/**
		 * This is for moving the pointer and traversing the entire list. We
		 * can't use the head as if pointer moves in end it would show only the
		 * end pointer.
		 */
		Node temp = head;
		while (h1 != null || h2 != null) {
			if (h1 != null && h2 != null) {
				if (h1.data > h2.data) {
					temp.next = h2;
					h2 = h2.next;
				} else {
					temp.next = h1;
					h1 = h1.next;
				}
				temp = temp.next;

			} else if (h1 != null) {
				temp.next = h1;
				break;
			} else if (h2 == null) {
				temp.next = h2;
				break;
			}
		}

		/**
		 * IMPORTANT The value of head will having all the value in the temp
		 * variable.
		 */

		// This is to remove the starting pointer
		return head.next;
	}

	
	/**
	 * Given a linked list which is sorted, how will you insert in sorted way
Given a sorted linked list and a value to insert, write a function to insert the value in sorted way.

Initial Linked List
2,5,7,10,15
Insert 9 
2,5,7,9,10,15
1) If Linked list is empty then make the node as
   head and return it.
2) If value of the node to be inserted is smaller 
   than value of head node, then insert the node 
   at start and make it head.
3) In a loop, find the appropriate node after 
   which the input node (let 9) is to be inserted. 
   To find the appropriate node start from head, 
   keep moving until you reach a node GN (10 in
   the below diagram) who's value is greater than 
   the input node. The node just before GN is the
   appropriate  node (7).
4) Insert the node (9) after the appropriate node
   (7) found in step 3.

	 */
	static Node insertValSortList(Node head, int val){
		Node temp = head;
//		Node move = head;
		Node nodeVal = new Node(val);
		while(temp != null){
			if(temp.data> val && temp==head){
				temp.next = nodeVal;
			}else if(temp.data < val && temp.next == null){
				temp.next = nodeVal;
				break;
				
			}else if(temp.data < val && temp.next.data> val){
				Node node = temp.next;
				temp.next = nodeVal;
				temp.next.next = node;
				break;
			}
			temp = temp.next;
		}
		return head;
	}
	
	
	
}
