package quiz.puzzle.slidingwindow;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class IndexesOfSubArraySumTest {

    IndexesOfSubArraySum subarraySum = new IndexesOfSubArraySum();

    @Test
    public void testExampleCase1() {
        int[] arr = {1, 2, 3, 7, 5};
        int[] expected = {2, 4};
        assertArrayEquals(expected, subarraySum.findSubArrayWithSum(arr, 12));
    }

    @Test
    public void testNoSubarrayExists() {
        int[] arr = {5, 3, 4};
        int[] expected = {-1};
        assertArrayEquals(expected, subarraySum.findSubArrayWithSum(arr, 2));
    }

    @Test
    public void testExampleCase2() {
        int[] arr = {7, 31, 14, 19, 1, 42, 13, 6, 11, 10, 25, 38, 49, 34, 46, 42, 3, 1};
        int[] expected = {6,6};
        assertArrayEquals(expected, subarraySum.findSubArrayWithSum(arr, 42));
    }

    @Test
    public void testSingleElementSubarray() {
        int[] arr = {5, 3, 4};
        int[] expected1 = {2, 2};
        int[] expected2 = {1, 1};
        assertArrayEquals(expected1, subarraySum.findSubArrayWithSum(arr, 3));
        assertArrayEquals(expected2, subarraySum.findSubArrayWithSum(arr, 5));
    }

    @Test
    public void testEntireArrayAsSolution() {
        int[] arr = {1, 2, 3, 4};
        int[] expected = {1, 4};
        assertArrayEquals(expected, subarraySum.findSubArrayWithSum(arr, 10));
    }

    @Test
    public void testMultiplePossibleSubarrays() {
        int[] arr = {1, 2, 3, 2, 5};
        int[] expected = {2, 3};
        assertArrayEquals(expected, subarraySum.findSubArrayWithSum(arr, 5));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int[] expected = {-1};
        assertArrayEquals(expected, subarraySum.findSubArrayWithSum(arr, 5));
    }

    @Test
    public void testTargetZero() {
        int[] arr = {1, 2, 3};
        int[] expected = {-1};
        assertArrayEquals(expected, subarraySum.findSubArrayWithSum(arr, 0));
    }

    @Test
    public void testTargetZero1() {
        int[] arr = {0, 2, 3};
        int[] expected = {1};
        assertArrayEquals(expected, subarraySum.findSubArrayWithSum(arr, 0));
    }
}
