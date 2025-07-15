package quiz.puzzle.array.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MajorityElementTest {

    @Test
    public void testMajorityElementOddLength() {
        int[] input = {1, 1, 2, 1, 3, 5, 1};
        assertEquals(1, MajorityElement.majorityElement(input));
    }

    @Test
    public void testSingleElementArray() {
        int[] input = {7};
        assertEquals(7, MajorityElement.majorityElement(input));
    }

    @Test
    public void testTwoElementsNoMajority() {
        int[] input = {2, 13};
        assertEquals(-1, MajorityElement.majorityElement(input));
    }

    @Test
    public void testEvenLengthWithMajority() {
        int[] input = {3, 3, 3, 2};
        assertEquals(3, MajorityElement.majorityElement(input));
    }

    @Test
    public void testEvenLengthNoMajority() {
        int[] input = {1, 2, 3, 1, 2, 1};
        assertEquals(-1, MajorityElement.majorityElement(input));
    }

    @Test
    public void testAllIdenticalElements() {
        int[] input = {5, 5, 5};
        assertEquals(5, MajorityElement.majorityElement(input));
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        assertEquals(-1, MajorityElement.majorityElement(input));
    }

    @Test
    public void testMajorityAtArrayEnd() {
        int[] input = {2, 1, 2, 3, 2, 4, 2};
        assertEquals(2, MajorityElement.majorityElement(input));
    }

    @Test
    public void testMultipleCandidatesNoMajority() {
        int[] input = {1, 2, 3, 1, 2, 3};
        assertEquals(-1, MajorityElement.majorityElement(input));
    }
}
