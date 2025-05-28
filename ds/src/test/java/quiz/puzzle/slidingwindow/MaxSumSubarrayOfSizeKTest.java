package quiz.puzzle.slidingwindow;





import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxSumSubarrayOfSizeKTest {

    @Test
    void testExample1() {
        int[] arr = {100, 200, 300, 400};
        int k = 2;
        assertEquals(700, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return 700 for the last two elements");
    }

    @Test
    void testExample2() {
        int[] arr = {100, 200, 300, 400};
        int k = 4;
        assertEquals(1000, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return 1000 for the full array sum");
    }

    @Test
    void testExample3() {
        int[] arr = {100, 200, 300, 400};
        int k = 1;
        assertEquals(400, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return 400 (largest single element)");
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {2, -3, 5, -1};
        int k = 2;
        assertEquals(4, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return 4 for subarray [5,-1]");
    }

    @Test
    void testAllNegatives() {
        int[] arr = {-5, -2, -3};
        int k = 2;
        assertEquals(-5, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return -5 for least-negative subarray");
    }

    @Test
    void testMiddleMax() {
        int[] arr = {1, 4, 2, 10, 2};
        int k = 3;
        assertEquals(16, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return 16 for subarray [4,2,10]");
    }

    @Test
    void testIncreasingNumbers() {
        int[] arr = {1, 2, 3, 4};
        int k = 3;
        assertEquals(9, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return 9 for subarray [2,3,4]");
    }

    @Test
    void testMaxAtBeginning() {
        int[] arr = {5, 2, -1, 4};
        int k = 2;
        assertEquals(7, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return 7 for the first two elements");
    }

    @Test
    void testSingleElement() {
        int[] arr = {400};
        int k = 1;
        assertEquals(400, MaxSumSubarrayOfSizeK.maxSum(arr, k),
                "Should return the single element itself");
    }
}
