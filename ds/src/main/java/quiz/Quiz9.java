package quiz;

import ques.algo.collection.linkedlist.Node;
import ques.algo.collection.list.ListUtils;

public class Quiz9 {
    public static void main(String[] args) {
        Integer a[] = {1,2,2,1};
        ListUtils listUtils = new ListUtils();
        Node node = listUtils.addAllNode(a);
      //  Node n = segregate(node);
        //listUtils.printList(n,"Test");
        Quiz9 q = new Quiz9();
        /*boolean f = q.isPalindrome(node);
        System.out.println(f);*/
        ;
        listUtils.printList(q.reverseList(node),"Reverse List");
    }

    Node reverseList(Node head)
    {
        // code here
        Node tail = null;

        Node temp = head;

        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }
        Node after = head.next;

        while(temp != null){

            tail = temp;
            temp =
            after = temp.next;
            //prev = temp;
            temp = temp.next;
        }

        return after;
    }

    static Node segregate(Node head)
    {
        // add your code here
        if(head == null)
            return null;

        Node start = null;
        Node temp = head;
        Node mid = null;
        Node end = null;
        while(temp != null){
            int data = temp.data;
            
            switch(data){
                case 0:
                    start = val(start,0);
                    break;
                case 1:
                    mid = val(mid,1);
                    break;
                case 2:
                    end = val(end,2);
                    break;
            }
            temp = temp.next;
        }

        if(start == null ){
            start = mid;
            if(start == null){
                start = end;
            }
        }
        
        
        Node ans = start;

        while(ans.next != null) {
        	
        	ans = ans.next;
        	
        }
        while(mid.next != null) {
        	ans = mid;
        	
        }
        while(end.next != null) {
        	end = end.next;
        	
        }
        mid.next = end;
        start.next = mid;      
        
        
        return start;
    }

    boolean isPalindrome(Node head)
    {
        //Your code here
        Node fp = head;
        Node sp = head;
        Node p = head;
        if(head == null){
            return false;
        }

        Node prev;
        Node c = null;
        boolean flag = true;
        while( sp != null ){
            sp = sp.next;
            if(fp.next == null){
                flag = false;
            }

            if(flag && fp.next.next != null) {
                fp = fp.next.next;
            }else{
                if(sp.next != null) {
                    prev = sp.next;
                    sp.next = c;
                    c = prev;
                }

            }
        }

        while(sp != null){
            if(p.data != sp.data    ){
                return false;
            }
            if (sp==null && p!=null){
                return true;
            }
                p = p.next;
            sp = sp.next;
        }
        return true;
    }

    private static Node val(Node pos, int val){
    	Node n1 = new Node(val);
    	
    	
        if(pos == null){
            pos = n1;
        }else{
            pos.next = n1;
        }
        //pos = pos.next;
        return pos;
    }
}

