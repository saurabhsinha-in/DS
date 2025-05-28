package ques.algo.collection.list;

import java.util.LinkedList;

import ques.algo.collection.list.LinkedListCommon.Node;

//Java program to find middle of linked list
class LinkedListCommon
{
 Node head; // head of linked list

 /* Linked list node */
 class Node
 {
     int data;
     Node next;
     Node(int d)
     {
         data = d;
         next = null;
     }
 }

 /* Function to print middle of linked list */
 void printMiddle()
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
 
 
	Node MergeLists(Node headA, Node headB) {
	     // This is a "method-only" submission. 
	    	 // You only need to complete this method
	     Node list1 = headA;
	     Node list2 = headB;
	     Node main = headA;
	     int val1 = -1;
	     int val2 = -1;
	     while(list1 != null && list2 != null){
	         val1 = list1.data;
	         val2 = list2.data;
	         if(val1 >val2){
	             main = list2;
	             list2 = list2.next;
	         }else if(val1 < val2){
	             main = list1;
	             list1 = list1.next;
	         }
	     }
	     return main;
	   }
	

 

 /* Inserts a new Node at front of the list. */
 public void push(int new_data)
 {
     /* 1 & 2: Allocate the Node &
               Put in the data*/
     Node new_node = new Node(new_data);

     /* 3. Make next of new Node as head */
     new_node.next = head;

     /* 4. Move the head to point to new Node */
     head = new_node;
 }
 public Node push(int new_data, Node head)
 {
     /* 1 & 2: Allocate the Node &
               Put in the data*/
     Node new_node = new Node(new_data);

     /* 3. Make next of new Node as head */
     new_node.next = head;

     /* 4. Move the head to point to new Node */
     head = new_node;
     return head;
 }

 /* This function prints contents of linked list
    starting from  the given node */
 public void printList()
 {
     Node tnode = head;
     while (tnode != null)
     {
         System.out.print(tnode.data+"->");
         tnode = tnode.next;
     }
     System.out.println("NULL");
 }
 
 public Node printList(Node head)
 {
     Node tnode = head;
     while (tnode != null)
     {
         System.out.print(tnode.data+"->");
         tnode = tnode.next;
     }
     System.out.println("NULL");
     return head;
 }
 
 
 
 public Node execute(int[] args, Node head){
	 LinkedListCommon llist = new LinkedListCommon();
     for (int i=5; i>0; --i)
     {
         llist.push(args[i]);
         llist.printList();
         llist.printMiddle();
     }
     return head;
 }
 

 public static void main(String [] args)
 {
     LinkedListCommon llist = new LinkedListCommon();
     for (int i=5; i>0; --i)
     {
         llist.push(i);
         llist.printList();
         llist.printMiddle();
     }
 }
}