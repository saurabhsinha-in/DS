package quiz.puzzle.slidingwindow;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SubArrayWith0SumTest {

    @Test
    void testArrayWithZeroSumSubarray() {
        int[] arr = {4, 2, -3, 1, 6};
        assertTrue(SubArrayWith0Sum.findsum(arr),
                "Should return true for array with a zero-sum subarray");
    }

    @Test
    void testArrayWithoutZeroSumSubarray() {
        int[] arr = {1, 2, 3};
        assertFalse(SubArrayWith0Sum.findsum(arr),
                "Should return false for array without a zero-sum subarray");
    }

    @Test
    void testArrayWithZeroElement() {
        int[] arr = {1, 2, 0, 4};
        assertTrue(SubArrayWith0Sum.findsum(arr),
                "Should return true for array containing a zero element");
    }

    @Test
    void testArrayWithAllZeros() {
        int[] arr = {0, 0, 0, 0};
        assertTrue(SubArrayWith0Sum.findsum(arr),
                "Should return true for array with all zeros");
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertFalse(SubArrayWith0Sum.findsum(arr),
                "Should return false for empty array");
    }

    @Test
    void testSingleElementZero() {
        int[] arr = {0};
        assertTrue(SubArrayWith0Sum.findsum(arr),
                "Should return true for single zero element");
    }

    @Test
    void testSingleElementNonZero() {
        int[] arr = {5};
        assertFalse(SubArrayWith0Sum.findsum(arr),
                "Should return false for single non-zero element");
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-3, 2, 3, 1, 6};
        assertFalse(SubArrayWith0Sum.findsum(arr),
                "Should return true for array with negative numbers forming zero-sum");
    }
}
