package ques.algo.collection.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class LinkedListUtilsTest {

	LinkedListUtils lld = new LinkedListUtils();
	
	@Test
	public void test() {
	lld.printList(lld.getStaticLinkedList(), "Hard Coded List\n");
	}
	
	@Test
	public void addStartTest() {
		LinkedList list = lld.getStaticLinkedList();
		Node node = new Node(56);
		lld.printList(list, "AddStartTest Before Traversal of list");
		list = lld.addStartNode(list, node);
		lld.printList(list, "AddStartTest after Traversal of list");
		assertEquals(56, list.head.getData());
	}
	
	@Test
	public void addNodeSpecificLocTest() {
		LinkedList list = lld.getStaticLinkedList();
		Node node = new Node(56);
		Node locNode = new Node(102);
		lld.printList(list, "addNodeSpecificLocTest Before Traversal of list");
		list = lld.addNodeSpecificLoc(list, node,locNode);
		lld.printList(list, "addNodeSpecificLocTest after Traversal of list");
		assertEquals(56, list.head.next.next.getData());
	}
	
	@Test
	public void addNodeEndTest(){
		LinkedList list = lld.getStaticLinkedList();
		Node newNode = new Node(56);
		lld.printList(list, "addNodeEndTest Before Traversal of list");
		list = lld.addNodeEnd(list, newNode);
		lld.printList(list, "addNodeEndTest after Traversal of list");
		assertEquals(56, list.head.next.next.next.getData());
	}
	
	@Test
	public void pushNodeStartTest(){
		LinkedList list = lld.getStaticLinkedList();
		lld.printList(list, "pushNodeStartTest Before Traversal of list");
		list.push(33);
		lld.printList(list, "pushNodeStartTest after Traversal of list");
		assertEquals(33, list.head.getData());
	}
	
	@Test
	public void insertAfterTest(){
		LinkedList list = lld.getStaticLinkedList();
		lld.printList(list, "insertAfterTest Before Traversal of list");
		list.insertAfter(new Node(1001), 2345);
		lld.printList(list, "insertAfterTest after Traversal of list");
		assertEquals(2345, list.head.next.getData());
	}
	
	@Test
	public void appendTest(){
		LinkedList list = lld.getStaticLinkedList();
		lld.printList(list, "appendTest Before Traversal of list");
		list.append(7112);
		lld.printList(list, "appendTest after Traversal of list");
		assertEquals(7112, list.head.next.next.next.getData());
	}
	
	@Test
	public void deleteTest(){
		LinkedList list = lld.getStaticLinkedList();
		list.append(7112);
		lld.printList(list, "\ndeleteTest before Traversal of list");
		list.delete(7112);
		lld.printList(list, "deleteTest after Traversal of list");
		assertNull( list.head.next.next.next);
	}
	
	@Test
	public void deletePosTest(){
		
		LinkedList list = lld.getStaticLinkedList();
		list.append(7112);
		lld.printList(list, "\n\n\ndeletePosTest before Traversal of list");
		list.deletePos(2);
		lld.printList(list, "deletePosTest  Traversal of list");
		assertEquals( 7112,list.head.next.next.getData());
		
		
		lld.printList(list, "deletePosTest last element before Traversal of list");
		list.deletePos(2);
		lld.printList(list, "deletePosTest last element  Traversal of list");
		assertNull( list.head.next.next);
		
		
		lld.printList(list, "deletePosTest first element before Traversal of list");
		list.deletePos(0);
		lld.printList(list, "deletePosTest first element after Traversal of list");
		assertEquals( 102,list.head.getData());
	}
	
	@Test
	public void sizeTest() {
		LinkedList list = lld.getStaticLinkedList();
		
		
		int size =list.size();
		lld.printList(list, "sizeTest Traversal of list size="+size);
		assertEquals(3, size);
		list.append(343);
		lld.printList(list, "sizeTest after Traversal of list size="+size);
		assertEquals(4, list.size());
	}
	
	@Test
	public void isKeyPresentTest() {
		LinkedList list = lld.getStaticLinkedList();
		lld.printList(list, "isKeyPresentTest Traversal of list 113 is present="+list.isKeyPresent(113));
		assertTrue(list.isKeyPresent(113));
		assertFalse(list.isKeyPresent(1130));
	}
	
	@Test
	public void testIndexValueFrmLast() {
		LinkedList list = lld.getStaticLinkedList();
		list.append(56).append(34).append(383).append(22).append(73);
		lld.printList(list, "testIndexValueFrmLast initial list size="+list.size());
		int val = list.indexValueFrmLast(3);
		lld.printList(list, "testIndexValueFrmLast  Value ="+val);
		assertEquals("383", ""+val);
		val = list.indexValueFrmLast(7);
		lld.printList(list, "testIndexValueFrmLast after Value ="+val);
		assertEquals("102", ""+val);
		
	}
	
	@Test
	public void testMiddleElement() {
		LinkedList list = lld.getStaticLinkedList();
		list.append(323).append(9949);
		
		LinkedListUtils lu = new LinkedListUtils();
		int midElement = lu.middleElement(list);
		lld.printList(list, "testMiddleElement initial of 5 elements middle element="+midElement);
		assertEquals(113, midElement);
		list.append(121);
		midElement = lu.middleElement(list);
		lld.printList(list, "testMiddleElement after  6 elements middle element="+midElement);
		assertEquals(323,midElement);
		
	}
	
	@Test
	public void testCountOccurance() {
		LinkedList list = lld.getStaticLinkedList();
		int occurance = lld.countOccurance(list, 2);		
		lld.printList(list, "testCountOccurance initial Occur of 2 ="+occurance);
		assertEquals(0, occurance);
		list.append(102).append(113).append(102);
		occurance = lld.countOccurance(list, 102);		
		lld.printList(list, "testCountOccurance after initial Occur of 102 ="+occurance);
		assertEquals(3, occurance);
	}

	@Test
	public void isMatchTest(){
		LinkedList list = lld.getStaticLinkedList();
		LinkedList list1 = lld.getStaticLinkedList();
		LinkedListUtils ll = new LinkedListUtils();
		Assert.assertTrue(ll.isMatch(list,list1));
		list = lld.getStaticLinkedList();
		list = ll.addNodeEnd(list,new Node(35));
		Assert.assertTrue(ll.isMatch(list,list1));
	}

	@Test
	public void reverseList(){
		LinkedList list = lld.getStaticLinkedList();
		lld.printList(list,"Before");
		list.reverseList();
		lld.printList(list,"After");
	}

	@Test
	public void reverseLinkedListPartiallyTest(){
		LinkedList list = lld.getStaticLinkedList();
		list.append(8);
		list.append(78);
		list.append(52);

		lld.printList(list,"Before");
		Node n =lld.reverseNodePartially(list.head,2,4);
		LinkedList lp = new LinkedList();
		lp.head = n;
		lld.printList(lp,"After");
	}

	@Test
	public void testSkipNode(){
		Node node = lld.setStaticNode(new int[]{23,45,55,65,75,85});
		lld.print(node,"Before");
		Node res = lld.skipNode(node);
		lld.print(res,"After");
	}

	@Test
	public void testHalfReverseNode(){
		Node node = lld.setStaticNode(new int[]{23,45,55,65,75,85});
		lld.print(node,"Before");
		Node res = lld.halfReverse(node,4);
		lld.print(res,"After");
	}
	
}
