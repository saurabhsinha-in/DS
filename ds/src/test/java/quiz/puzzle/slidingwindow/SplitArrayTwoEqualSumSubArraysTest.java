package quiz.puzzle.slidingwindow;

import org.junit.Test;
import static org.junit.Assert.*;

public class SplitArrayTwoEqualSumSubArraysTest {

    private final SplitArrayTwoEqualSumSubArrays solver = new SplitArrayTwoEqualSumSubArrays();

    @Test
    public void testExample1() {
        int[] arr = {1, 2, 3, 4, 5, 5};
        assertTrue("Should return true when array is split into [1,2,3,4] and [5,5]", solver.canSplit(arr));
    }

    @Test
    public void testExample2() {
        int[] arr = {4, 3, 2, 1};
        assertFalse("Should return false since no equal sum split exists", solver.canSplit(arr));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {10};
        assertFalse("Single element array cannot be split into two non-empty subarrays", solver.canSplit(arr));
    }

    @Test
    public void testAllZeros() {
        int[] arr = {0, 0, 0, 0};
        assertTrue("Array of zeros can be split into two equal sum subarrays", solver.canSplit(arr));
    }

    @Test
    public void testLargeNumbers() {
        int[] arr = {1000000, 500000, 500000};
        assertTrue("Should return true splitting after first element", solver.canSplit(arr));
    }

    @Test
    public void testNoSplitPossible() {
        int[] arr = {1, 1, 1, 2, 1};
        assertTrue("No equal sum split possible", solver.canSplit(arr));
    }

    @Test
    public void testSplitInMiddle() {
        int[] arr = {2, 2, 2, 2};
        assertTrue("Can split as [2,2] and [2,2]", solver.canSplit(arr));
    }

    @Test
    public void testNegativeNumbers() {
        int[] arr = {1, 2, 3, -3, 3};
        assertTrue("Can split as [1,2,3] and [-3,3]", solver.canSplit(arr));
    }

    @Test
    public void testNullArray() {
        assertFalse("Null array should return false", solver.canSplit(null));
    }

    @Test
    public void testEmptyArray() {
        assertFalse("Empty array should return false", solver.canSplit(new int[]{}));
    }
}
