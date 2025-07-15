package quiz.puzzle.array.easy;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AlterPosNegTest {

    private void assertRearrangement(int[] inputArr, int[] expectedArr) {
        AlterPosNeg rearranger = new AlterPosNeg();
        ArrayList<Integer> input = new ArrayList<>();
        for (int num : inputArr) input.add(num);

        rearranger.rearrange(input);

        ArrayList<Integer> expected = new ArrayList<>();
        for (int num : expectedArr) expected.add(num);

        assertEquals(expected, input);
    }

    @Test
    public void testExample1() {
        assertRearrangement(
                new int[]{9, 4, -2, -1, 5, 0, -5, -3, 2},
                new int[]{9, -2, 4, -1, 5, -5, 0, -3, 2}
        );
    }

    @Test
    public void testExample2() {
        assertRearrangement(
                new int[]{-5, -2, 5, 2, 4, 7, 1, 8, 0, -8},
                new int[]{5, -5, 2, -2, 4, -8, 7, 1, 8, 0}
        );
    }

    @Test
    public void testMoreNegatives() {
        assertRearrangement(
                new int[]{1, -2, -3, -4},
                new int[]{1, -2, -3, -4}
        );
    }

    @Test
    public void testNegativeStartWithPositives() {
        assertRearrangement(
                new int[]{-3, 1, -2, 4},
                new int[]{1, -3, 4, -2}
        );
    }

    @Test
    public void testEmptyInput() {
        assertRearrangement(
                new int[]{},
                new int[]{}
        );
    }

    @Test
    public void testAllZeros() {
        assertRearrangement(
                new int[]{0, 0, 0},
                new int[]{0, 0, 0}
        );
    }

    @Test
    public void testSingleElement() {
        assertRearrangement(
                new int[]{-5},
                new int[]{-5}
        );
    }
}
