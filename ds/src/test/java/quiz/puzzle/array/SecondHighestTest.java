package quiz.puzzle.array;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SecondHighestTest {

    @Test
    public void testExample1() {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(34, result);
    }

    @Test
    public void testExample2() {
        int[] arr = {10, 5, 10};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(5, result);
    }

    @Test
    public void testExample3() {
        int[] arr = {10, 10, 10};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(-1, result);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {5};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(-1, result);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(-1, result);
    }

    @Test
    public void testNullArray() {
        int[] arr = null;
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(-1, result);
    }

    @Test
    public void testAllDistinct() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(4, result);
    }

    @Test
    public void testSecondLargestAtStart() {
        int[] arr = {9, 10, 10, 8};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(9, result);
    }

    @Test
    public void testLargeNumbers() {
        int[] arr = {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(Integer.MAX_VALUE - 1, result);
    }

    @Test
    public void testCustomCase() {
        int[] arr = {28078, 19451, 935, 28892, 2242, 3570, 5480, 231};
        int result = SecondHighest.findSecondLargest(arr);
        assertEquals(28078, result);
    }

}
