package quiz.puzzle.array.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static quiz.puzzle.array.basic.ArraySubset.isSubset;



class ArraySubsetTest {

    @Test
    void testIsSubset_AllCases() {
        // Test 1: Example case - true
        int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b1 = {11, 3, 7, 1, 7};
        assertTrue(isSubset(a1, b1), "Test 1: b[] is a subset of a[]");

        // Test 2: Example case - true
        int[] a2 = {1, 2, 3, 4, 4, 5, 6};
        int[] b2 = {1, 2, 4};
        assertTrue(isSubset(a2, b2), "Test 2: b[] is a subset of a[]");

        // Test 3: Example case - false
        int[] a3 = {10, 5, 2, 23, 19};
        int[] b3 = {19, 5, 3};
        assertFalse(isSubset(a3, b3), "Test 3: b[] is not a subset of a[]");

        // Test 4: b[] is empty (should be true)
        int[] a4 = {1, 2, 3};
        int[] b4 = {};
        assertTrue(isSubset(a4, b4), "Test 4: empty b[] is always a subset");

        // Test 5: a[] is empty, b[] is not (should be false)
        int[] a5 = {};
        int[] b5 = {1};
        assertFalse(isSubset(a5, b5), "Test 5: non-empty b[] can't be subset of empty a[]");

        // Test 6: Both arrays empty (should be true)
        int[] a6 = {};
        int[] b6 = {};
        assertTrue(isSubset(a6, b6), "Test 6: empty b[] is subset of empty a[]");

        // Test 7: Duplicates in b[] more than in a[] (should be false)
        int[] a7 = {1, 2, 2, 3};
        int[] b7 = {2, 2, 2};
        assertFalse(isSubset(a7, b7), "Test 7: not enough 2's in a[] for b[]");

        // Test 8: Duplicates in b[] match a[] (should be true)
        int[] a8 = {1, 2, 2, 3};
        int[] b8 = {2, 2};
        assertTrue(isSubset(a8, b8), "Test 8: enough 2's in a[] for b[]");
    }
}