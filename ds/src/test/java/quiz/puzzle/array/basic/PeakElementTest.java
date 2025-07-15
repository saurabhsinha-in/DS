package quiz.puzzle.array.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PeakElementTest {

    @Test
    void testPeakElement_AllCases() {
        PeakElement obj = new PeakElement();

        // Test 1: Example 1
        assertPeakValid(obj, new int[]{1, 2, 4, 5, 7, 8, 3});

        // Test 2: Example 2
        assertPeakValid(obj, new int[]{10, 20, 15, 2, 23, 90, 80});

        // Test 3: Example 3
        assertPeakValid(obj, new int[]{1, 2, 3});

        // Test 4: Single element
        assertPeakValid(obj, new int[]{5});

        // Test 5: Two elements, ascending
        assertPeakValid(obj, new int[]{1, 2});

        // Test 6: Two elements, descending
        assertPeakValid(obj, new int[]{3, 2});

        // Test 7: Peak at first index
        assertPeakValid(obj, new int[]{5, 3, 1});

        // Test 8: Peak at last index
        assertPeakValid(obj, new int[]{1, 3, 5});

        // Test 9: Multiple peaks
        assertPeakValid(obj, new int[]{1, 3, 2, 4, 1});

        // Test 10: All decreasing
        assertPeakValid(obj, new int[]{5, 4, 3, 2, 1});

        // Test 11: Large peak in middle
        assertPeakValid(obj, new int[]{1, 3, 20, 4, 1});
    }

    private void assertPeakValid(PeakElement obj, int[] arr) {
        int index = obj.peakElement(arr);
        assertTrue(isValidPeak(arr, index),
                "Returned index " + index + " is not a valid peak in array " + java.util.Arrays.toString(arr));
    }

    private boolean isValidPeak(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return false;
        int left = (index > 0) ? arr[index - 1] : Integer.MIN_VALUE;
        int right = (index < arr.length - 1) ? arr[index + 1] : Integer.MIN_VALUE;
        return arr[index] > left && arr[index] > right;
    }
}