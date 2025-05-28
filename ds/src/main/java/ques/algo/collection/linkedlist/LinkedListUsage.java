package ques.algo.collection.linkedlist;

public class LinkedListUsage {


    /**
     * Given a linkedList reverse each of the string after every k position
     * A,B,C,D,E,F,G,H if k=3
     * B,A,C,E,D,F,H,G
     */
    public void reverseInGroup(Node head, int k) {


    }

    /**
     * You are given a linked list where each element in the list is a node and have an integer data.
     * You need to add 1 to the number formed by concatinating all the list node numbers together and return the head of the modified linked list.
     * Note: The head represents the first element of the given array.
     * 4->5->6
     * o/p 4->5->7
     */
    public Node add1LastNode(Node head) {
        Node node = head;
        if (node == null) {
            node = new Node(0);
        }
        long num = 0;
        while (node != null) {
            int temp = node.data;
            num = num * 10 + temp;
            node = node.next;
        }
        num = num + 1;
        return revAdd1LastNode(setNodeNum(num));
    }

    private Node setNodeNum(long num) {
        long digit;
        Node res = new Node(0);
        Node node = res;
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            node.next = new Node((int) digit);
            node = node.next;
        }
        return res.next;
    }

    private Node revAdd1LastNode(Node head) {
        Node current = head, prev = null, nxt;
        if (current == null) return null;
        if (current.next == null) return current;
        while (current != null) {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }


    /**
     * You are given a linked list where each element in the list is a node and have an integer data.
     * You need to add 1 to the number formed by concatinating all the list node numbers together and return the head of the modified linked list.
     * Note: The head represents the first element of the given array.
     * 4->5->6
     * o/p 4->5->7
     */
    /**
     * 1. Reverse all the node.
     * 2. Add in the first node if greater than 9 carry to next element as well as reverse string as well.
     *
     * @param head
     * @return
     */
    public Node add1LastNodeM2(Node head) {
        Node node = head;
        if (node == null) return node;
        Node rev = revAdd1LastNodeM2(node, false);
        Node result = revAdd1LastNodeM2(rev, true);
        return result;

    }

    private boolean isCarryM2(int val, int numAdd) {
        int diff = 10 - numAdd;
        if (val > diff) {
            return true;
        }
        return false;
    }

    private Node revAdd1LastNodeM2(Node head, boolean isAddRev) {
        Node current = head, prev = null, nxt;
        int carry = 1;
        boolean isCarry = false;
        if (current == null) return null;
        //if(current.next== null) return head;
        while (current != null) {
            if (isAddRev && (current == head || isCarry)) {
                int val = current.data;
                int digit;
                if (isCarryM2(val, 1)) {
                    digit = val % 10;
                    isCarry = true;
                } else {
                    digit = val;
                    isCarry = false;
                }
                current.data = digit + 1;
            }
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }


    Node removeDuplicates(Node head) {
        Node node = head;
        if (node == null) return null;
        if (node.next == null) return node;
        Node result = new Node(0);
        Node temp = result;
        while (node != null) {
            Node nxt = node.next;
            if (nxt != null && nxt.data == node.data) {
                temp.next = node;
                temp = temp.next;
            }
            node = node.next;
        }
        return result.next;
    }

    public Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method
        int val1 = -1;
        int val2 = -1;
        Node res = new Node(0);
        Node merge = res;
        Node node1 = head1;
        Node node2 = head2;
        if (node1 == null && node2 == null) return null;

        while (node1 != null || node2 != null) {
            if (node1 != null) {
                val1 = node1.data;
            }
            if (node2 != null) {
                val2 = node2.data;
            }

            if ((node1 != null && val1 <= val2) || node2 == null) {

                merge.next = node1;

                node1 = node1.next;
            } else if ((node2 != null && val2 <= val1) || node1 == null) {
                merge.next = node2;
                node2 = node2.next;
            }
            merge = merge.next;
        }
        return res.next;
    }

    public Node removeDuplicates2(Node head) {
        // Your code here
        Node node = head;
        if (node == null) return null;
        if (node.next == null) return node;

        Node res = new Node(0);
        Node dummy = res;
        while (node != null) {
            Node temp = res;
            int data = node.data;
            SOS:
            {
                while (temp != null) {
                    if (temp.data == data) {
                        break SOS;
                    }


                    temp = temp.next;
                }
                dummy.next = new Node(data);
                dummy = dummy.next;

            }
        }
        return res.next;
    }

    public Node divide(Node head) {
        // code here
        Node node = head;
        Node fPt = node;
        Node prev = node;
        if (fPt == null) return null;
        if (fPt.next == null) return null;
        Node res = new Node(0);
        Node even = res;
        Node resOdd = new Node(0);
        Node odd = resOdd;
        while (fPt != null) {
            int val = fPt.data;
            if (val % 2 == 0) {
                even.next = new Node(val);
                even = even.next;
            } else {
                odd.next = new Node(val);
                odd = odd.next;
            }
            fPt = fPt.next;
        }
        even.next = resOdd.next;
        return res.next;
    }

    /**
     * Given a singly linked list, remove all the nodes with any node on their right whose value is greater and return the head of the modified linked list.  (Not just the immediate Right, but the entire List on the Right)
     * <p>
     * Examples:
     * <p>
     * Input:
     * LinkedList = 12->15->10->11->5->6->2->3
     * Output: 15->11->6->3
     *
     * @param head
     * @return
     */
    public Node descOrderOld(Node head) {
        Node res = new Node(0);
        Node dummy = res;
        Node node = head;
        if (node == null) return null;
        if (node.next == null) return node;
        Node prev = node, current = node.next;
        while (current != null) {

            if (prev != null) {
                if (prev.data < current.data) {
                    Node temp = prev.next;
                }
            } else {
                prev = current;

            }
            current = current.next;
        }

        return res.next;
    }

    public Node descOrder(Node head) {
        Node  node = head;
        Node res = new Node(0);
        if(node == null)return null;


        while (node != null){

        }

        return res;
    }

    public Node deleteAlt(Node head) {
        // Code Here
        Node node = head;
        //if(node == null) return null;
        //if(node.next == null) return head;
        Node cur = new Node(0);
        Node temp = cur;
        int count = 1;
        while(node != null){
            if(count%2!=0 && node.next != null){
                if(count != 1){
                    temp.next = node.next.next;
                }else{
                    temp.next = node;
                }

            }
            count++;
            if(temp != null) {
                temp = temp.next;
            }
                node = node.next;
        }
        node = cur.next;
        return head;

    }

    public Node pairwiseSwap(Node head) {
        // code here
        Node node = head;
        if(node == null || node.next == null) return node;

        Node res = new Node(0);
        res.next = head;
        Node temp = res;

        while(temp.next != null && temp.next.next != null){
            Node first = temp.next;
            Node second = first.next;
            first.next = second.next;
            second.next = first;
            temp.next = second;
            temp = first;


        }
        return res.next;
    }


}