package quiz.puzzle.slidingwindow;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SubArrayWithZeroSumTest {

    private SubArrayWithZeroSum instance;  // Replace with your actual class name

    @Before
    public void setUp() {
        instance = new SubArrayWithZeroSum();
    }

    @Test
    public void testExampleCase1() {
        int[] arr = {4, 2, -3, 1, 6};
        assertTrue("Subarray [2, -3, 1] sums to 0", instance.findsum(arr));
    }

    @Test
    public void testExampleCase2() {
        int[] arr = {4, 2, 0, 1, 6};
        assertTrue("Element 0 itself forms zero sum subarray", instance.findsum(arr));
    }

    @Test
    public void testExampleCase3() {
        int[] arr = {1, 2, -1};
        assertFalse("No subarray sums to zero", instance.findsum(arr));
    }

    @Test
    public void testSingleZeroElement() {
        int[] arr = {0};
        assertTrue("Single zero element forms zero sum subarray", instance.findsum(arr));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertFalse("Empty array has no subarray", instance.findsum(arr));
    }

    @Test
    public void testAllPositiveNoZeroSum() {
        int[] arr = {1, 2, 3, 4, 5};
        assertFalse("All positive elements with no zero sum subarray", instance.findsum(arr));
    }

    @Test
    public void testMultipleZeroSumSubarrays() {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4};
        assertTrue("Multiple zero sum subarrays exist", instance.findsum(arr));
    }

    @Test
    public void testZeroSumAtStart() {
        int[] arr = {-3, 1, 2};
        assertTrue("No zero sum subarray", instance.findsum(arr));
    }

    @Test
    public void testZeroSumAtEnd() {
        int[] arr = {1, 2, -3};
        assertTrue("Subarray [1, 2, -3] sums to zero", instance.findsum(arr));
    }
}
