package ques.algo.collection.list;


import ques.algo.collection.linkedlist.Node;

public class ListUtils {
	
	
	
	
	public Node printList(Node head, String msg)
	 {
		System.out.print(msg+"=");
	     Node tnode = head;
	     while (tnode != null)
	     {
	         System.out.print(tnode.data+"->");
	         tnode = tnode.next;
	     }
	     System.out.println("NULL");
	     return head;
	 }
	
	
	
	
	/* Function to print middle of linked list */
	 void printMiddle(Node head)
	 {
	     Node slow_ptr = head;
	     Node fast_ptr = head;
	     if (head != null)
	     {
	         while (fast_ptr != null && fast_ptr.next != null)
	         {
	             fast_ptr = fast_ptr.next.next;
	             slow_ptr = slow_ptr.next;
	         }
	         System.out.println("The middle element is [" +
	                             slow_ptr.data + "] \n");
	     }
	 }
	
	public Node addAllNode(Integer arr[]){
		Node head = new Node(0);
		Node temp = head;
		for(Integer a:arr){
			if(temp != null){
				Node node = new Node(a);
				temp.next = node;
				temp = temp.next;
			}
			
		}
		
		
		
		return head.next;
	}
	
	private Node append(Node mainNode,Integer val, Node head){
		Node newNode = new Node(val);
		
		if(mainNode == null){
			mainNode = newNode;
		}
		
		
		
		newNode.next = null;
//		Node lastNode = mainNode;
//		while(lastNode.next != null){
//			lastNode = lastNode.next;
//		}
		while(mainNode.next != null){
			mainNode = mainNode.next;
		}

//		lastNode.next = 
		
		mainNode.next = newNode; 
		return mainNode;
	}
	 
	

}
