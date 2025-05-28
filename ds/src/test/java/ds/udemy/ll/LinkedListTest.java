package ds.udemy.ll;

import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(JUnit4ClassRunner.class)
public class LinkedListTest {
    @Test
    public void append() {
        LinkedList ll = new LinkedList(1);
        ll.append(34);
        ll.append(2);
        Assert.assertEquals(3, ll.getLength());
        ll.printList();
        ll.removeLast();
        Assert.assertEquals(2, ll.getLength());
        ll.printList();
        ll.removeFirst();
    }

    @Test
    public void prependTest(){
        LinkedList ll = new LinkedList(222);
        ll.append(4);
        ll.printList();
        ll.prepend(356);
        ll.printList();
        Assert.assertEquals(3,ll.getLength());
    }

}