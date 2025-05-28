package quiz.puzzle.array;

import ques.algo.collection.linkedlist.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Temp {
    public static void main(String[] args) {

    }

    public List<Integer> reverse(List<Integer> list){
        List<Integer> r = new ArrayList<>();
        for(int i = list.size()-1;i>=0;i--){
            r.add(list.get(i));
        }
        return r;
    }


    public Node reverse(Node node){
        Node cur = node;

        Node prev = null;

        if(cur == null || cur.next == null){
            return cur;
        }
        Node temp;
        while(cur.next != null){
            prev = cur.next;
            temp = cur;
            cur.next = temp;
        }

        return prev;

    }

}
