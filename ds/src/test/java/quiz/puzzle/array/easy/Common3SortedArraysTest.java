package quiz.puzzle.array.easy;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Common3SortedArraysTest {

    Common3SortedArrays solution = new Common3SortedArrays();

    @Test
    void testCommonElements_Example1() {
        List<Integer> arr1 = Arrays.asList(1, 5, 10, 20, 40, 80);
        List<Integer> arr2 = Arrays.asList(6, 7, 20, 80, 100);
        List<Integer> arr3 = Arrays.asList(3, 4, 15, 20, 30, 70, 80, 120);
        List<Integer> expected = Arrays.asList(20, 80);
        assertEquals(expected, solution.commonElements(arr1, arr2, arr3));
    }

    @Test
    void testCommonElements_Example2_NoCommon() {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arr2 = Arrays.asList(6, 7);
        List<Integer> arr3 = Arrays.asList(8, 9, 10);
        List<Integer> expected = Collections.singletonList(-1);
        assertEquals(expected, solution.commonElements(arr1, arr2, arr3));
    }

    @Test
    void testCommonElements_Example3_WithDuplicates() {
        List<Integer> arr1 = Arrays.asList(1, 1, 1, 2, 2, 2);
        List<Integer> arr2 = Arrays.asList(1, 1, 2, 2, 2);
        List<Integer> arr3 = Arrays.asList(1, 1, 1, 1, 2, 2, 2, 2);
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(expected, solution.commonElements(arr1, arr2, arr3));
    }

    @Test
    void testCommonElements_AllEmpty() {
        List<Integer> arr1 = Collections.emptyList();
        List<Integer> arr2 = Collections.emptyList();
        List<Integer> arr3 = Collections.emptyList();
        List<Integer> expected = Collections.singletonList(-1);
        assertEquals(expected, solution.commonElements(arr1, arr2, arr3));
    }

    @Test
    void testCommonElements_OneElementCommon() {
        List<Integer> arr1 = Arrays.asList(5);
        List<Integer> arr2 = Arrays.asList(5);
        List<Integer> arr3 = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        assertEquals(expected, solution.commonElements(arr1, arr2, arr3));
    }

    @Test
    void testCommonElements_OneArrayEmpty() {
        List<Integer> arr1 = Arrays.asList(1, 2, 3);
        List<Integer> arr2 = Arrays.asList(1, 2, 3);
        List<Integer> arr3 = Collections.emptyList();
        List<Integer> expected = Collections.singletonList(-1);
        assertEquals(expected, solution.commonElements(arr1, arr2, arr3));
    }
}
