package ques.algo.collection.list;

import ques.algo.collection.linkedlist.Node;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListMain lm = new ListMain();
//		lm.execute();
		lm.insertValSortList();

	}
	
	ListUtils lstUtils = new ListUtils();
	public void execute(){
		
		Integer in[] = {2,4,5,6};
		Node l1 = lstUtils.addAllNode(in);
		lstUtils.printList(l1," Sorted List 1");

		Integer in1[] = {2,4,15,16};
		Node l2 = lstUtils.addAllNode(in1);
		lstUtils.printList(l2," Sorted List 2");
		
		Node mergedNode = ListUsage.merge2SortedList(l1, l2);
		lstUtils.printList(mergedNode, "Merged List");
	}
	
	
	public void insertValSortList(){
		Integer in[] = {2,4,6,10,23};
		Node l1 = lstUtils.addAllNode(in);
		lstUtils.printList(l1, "Initialized Value = ");
		Node node = ListUsage.insertValSortList(l1, 1);
		lstUtils.printList(node, "Inserted Value = ");
		
		
		
	}
	
	
}
