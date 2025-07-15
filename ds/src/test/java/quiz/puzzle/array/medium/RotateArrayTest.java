package quiz.puzzle.array.medium;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {

    @Test
    public void test1(){
        int[] arr = {10, 20, 30};
        RotateArray.rotateArr(arr,2);
        assertArrayEquals(new int[]{ 30,10, 20}, arr);
    }

    @Test
    public void test2(){
        int[] arr = {10};
        RotateArray.rotateArr(arr,1);
        assertArrayEquals(new int[]{ 10}, arr);
    }

    @Test
    public void test3(){
        int[] arr = {};
        RotateArray.rotateArr(arr,1);
        assertArrayEquals(new int[]{ }, arr);
    }

}