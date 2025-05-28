package ques.algo.collection.linkedlist;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

public class LinkedListUsageTest extends TestCase {
    LinkedListUtils lld = new LinkedListUtils();
    LinkedListUsage llu = new LinkedListUsage();

    @Test
    @Ignore
    public void testAdd1LastNode(){
        Node node = lld.setStaticNode(new int[]{2,4,5});
        lld.print(node,"Before");
        Node res = llu.add1LastNode(node);
        lld.print(res,"After");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{2,4,6})));
    }
    @Test
    @Ignore
    public void testAdd1LastNode2(){
        Node node = lld.setStaticNode(new int[]{8,4,2,1,4,1,1,7,6,7,7,6});
        lld.print(node,"Before");
        Node res = llu.add1LastNode(node);
        lld.print(res,"After");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{8,4,2,1,4,1,1,7,6,7,7,7})));
    }

    @Test
    @Ignore
    public void testAdd1LastNode1(){
        Node node = lld.setStaticNode(new int[]{0});
        lld.print(node,"Before");
        Node res = llu.add1LastNode(node);
        lld.print(res,"After");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{1})));
    }

    @Test
    @Ignore
    public void testAdd1LastNodeM2(){
        Node node = lld.setStaticNode(new int[]{8,4,2,1,4,1,1,7,6,7,7,6});
        lld.print(node,"Before");
        Node res = llu.add1LastNodeM2(node);
        lld.print(res,"After");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{8,4,2,1,4,1,1,7,6,7,7,7})));
    }

    @Test
    @Ignore
    public void testAdd1LastNodeM2Min(){
        Node node = lld.setStaticNode(new int[]{0});
        lld.print(node,"Before");
        Node res = llu.add1LastNodeM2(node);
        lld.print(res,"After");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{1})));
    }

//    @Test
//    public void testRemoveDuplicates(){
//        Node node = lld.setStaticNode(new int[]{2,2, 4, 5, 5 ,5, 9, 9, 9});
//        lld.print(node,"Before");
//        Node res = llu.removeDuplicates(node);
//        lld.print(res,"After");
//        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{2, 4, 5, 9})));
//    }

    @Test
    public void testMergeList(){
        Node node1 = lld.setStaticNode(new int[]{1,3,5,6,8});
        Node node2 = lld.setStaticNode(new int[]{2,4,9});
        lld.print(node1,"Before Node1");
        lld.print(node2,"Before Node2");
        Node res = llu.sortedMerge(node1,node2);
        lld.print(res,"After Node");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{1,2,3, 4, 5,6,8, 9})));
    }

//    @Test
//    @Ignore
//    public void testRemoveDuplicate(){
//        Node node1 = lld.setStaticNode(new int[]{1,3,3,5});
//        lld.print(node1,"Before Node1");
//        Node res = llu.removeDuplicates2(node1);
//        lld.print(res,"After Node");
//        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{1,3,5})));
//    }

    @Test
    public void testDivide(){
        Node node1 = lld.setStaticNode(new int[]{4,6,1,3,2,5});
        lld.print(node1,"Before Node1");
        Node res = llu.divide(node1);
        lld.print(res,"After Node");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{4,6,2,1,3,5})));
    }

    @Test
    public void testDescOrder(){
        Node node1 = lld.setStaticNode(new int[]{12,15,10,11,5,6,2,3});
        lld.print(node1,"Before Node1");
        Node res = llu.descOrder(node1);
        lld.print(res,"After Node");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{15,11,6,3})));

        node1 = lld.setStaticNode(new int[]{2, 8, 4, 4, 9, 6, 6});
        lld.print(node1,"Before Node1");
        res = llu.descOrder(node1);
        lld.print(res,"After Node");
        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{9,6,6})));
    }

    @Test
    public void testSortInsert(){
//        Node node1 = lld.setStaticNode(new int[]{23,56,89,96});
//        lld.print(node1,"Before Node1");
//        Node res = llu.sortedInsert(node1,72);
//        lld.print(res,"After Node");
//        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{23,56,72,89,96})));
//
//        node1 = lld.setStaticNode(new int[]{4, 6, 6, 8, 8, 8, 9, 9});
//        lld.print(node1,"Before Node1");
//        res = llu.sortedInsert(node1,3);
//        lld.print(res,"After Node");
//        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{3,4, 6, 6, 8, 8, 8, 9, 9})));
//
//        node1 = lld.setStaticNode(new int[]{1, 1, 2, 3, 3, 4, 8});
//        lld.print(node1,"Before Node1");
//        res = llu.sortedInsert(node1,9);
//        lld.print(res,"After Node");
//        Assert.assertTrue(lld.isMatch(res,lld.setStaticNode(new int[]{1, 1, 2, 3, 3, 4, 8,9})));

    }


}