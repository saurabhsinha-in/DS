package quiz.puzzle.slidingwindow;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class KSizedSubArrayMaxTest {

    private void assertListEquals(int[] expected, ArrayList<Integer> actual) {
        assertEquals(expected.length, actual.size(), "Size mismatch");
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], actual.get(i), "Mismatch at index " + i);
        }
    }

    @Test
    public void testExample1() {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        int[] expected = {3, 3, 4, 5, 5, 5, 6};
        assertListEquals(expected, KSizedSubArrayMax.maxSlidingWindow(arr, k));
    }

    @Test
    public void testExample2() {
        int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k = 4;
        int[] expected = {10, 10, 10, 15, 15, 90, 90};
        assertListEquals(expected, KSizedSubArrayMax.maxSlidingWindow(arr, k));
    }

    @Test
    public void testExample3_kEqualsOne() {
        int[] arr = {5, 1, 3, 4, 2, 6};
        int k = 1;
        int[] expected = {5, 1, 3, 4, 2, 6};
        assertListEquals(expected, KSizedSubArrayMax.maxSlidingWindow(arr, k));
    }

    @Test
    public void testSingleElement() {
        int[] arr = {42};
        int k = 1;
        int[] expected = {42};
        assertListEquals(expected, KSizedSubArrayMax.maxSlidingWindow(arr, k));
    }

    @Test
    public void testAllElementsSame() {
        int[] arr = {7, 7, 7, 7, 7};
        int k = 3;
        int[] expected = {7, 7, 7};
        assertListEquals(expected, KSizedSubArrayMax.maxSlidingWindow(arr, k));
    }

//    @Test
//    public void testInvalidKZero() {
//        int[] arr = {1, 2, 3};
//        int k = 0;
//        assertThrows(IllegalArgumentException.class, () -> KSizedSubArrayMax.maxSlidingWindow(arr, k));
//    }
//
//    @Test
//    public void testInvalidKGreaterThanLength() {
//        int[] arr = {1, 2, 3};
//        int k = 4;
//        assertThrows(IllegalArgumentException.class, () -> KSizedSubArrayMax.maxSlidingWindow(arr, k));
//    }
//
//    @Test
//    public void testNullArray() {
//        int[] arr = null;
//        int k = 3;
//        assertThrows(IllegalArgumentException.class, () -> KSizedSubArrayMax.maxSlidingWindow(arr, k));
//    }
}
