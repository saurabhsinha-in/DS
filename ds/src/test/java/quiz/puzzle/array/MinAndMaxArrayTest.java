package quiz.puzzle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static quiz.puzzle.array.MinAndMaxArray.findMinMax;

class MinAndMaxArrayTest {

    @Test
    void testFindMinMax_AllCases() {
        // Test 1: Example case
        int[] arr1 = {3, 2, 1, 56, 10000, 167};
        Pair<Integer, Integer> result1 = findMinMax(arr1);
        assertEquals(1, result1.getFirst(), "Test 1 - Min");
        assertEquals(10000, result1.getSecond(), "Test 1 - Max");

        // Test 2: Another example case
        int[] arr2 = {1, 345, 234, 21, 56789};
        Pair<Integer, Integer> result2 = findMinMax(arr2);
        assertEquals(1, result2.getFirst(), "Test 2 - Min");
        assertEquals(56789, result2.getSecond(), "Test 2 - Max");

        // Test 3: Single element
        int[] arr3 = {56789};
        Pair<Integer, Integer> result3 = findMinMax(arr3);
        assertEquals(56789, result3.getFirst(), "Test 3 - Min");
        assertEquals(56789, result3.getSecond(), "Test 3 - Max");

        // Test 4: All elements are the same
        int[] arr4 = {5, 5, 5, 5};
        Pair<Integer, Integer> result4 = findMinMax(arr4);
        assertEquals(5, result4.getFirst(), "Test 4 - Min");
        assertEquals(5, result4.getSecond(), "Test 4 - Max");

        // Test 5: Negative numbers
        int[] arr5 = {-10, -20, -30, -5};
        Pair<Integer, Integer> result5 = findMinMax(arr5);
        assertEquals(-30, result5.getFirst(), "Test 5 - Min");
        assertEquals(-5, result5.getSecond(), "Test 5 - Max");

        // Test 6: Mixed positive and negative
        int[] arr6 = {-1, 0, 1};
        Pair<Integer, Integer> result6 = findMinMax(arr6);
        assertEquals(-1, result6.getFirst(), "Test 6 - Min");
        assertEquals(1, result6.getSecond(), "Test 6 - Max");

        // Test 7: Two elements
        int[] arr7 = {7, 3};
        Pair<Integer, Integer> result7 = findMinMax(arr7);
        assertEquals(3, result7.getFirst(), "Test 7 - Min");
        assertEquals(7, result7.getSecond(), "Test 7 - Max");
    }
}