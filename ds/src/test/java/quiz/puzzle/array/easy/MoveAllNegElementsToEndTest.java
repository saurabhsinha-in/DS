package quiz.puzzle.array.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class MoveAllNegElementsToEndTest {

    private void assertSegregation(int[] input, int[] expected) {
        new MoveAllNegElementsToEnd().segregateElements(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testExample1() {
        assertSegregation(
                new int[]{1, -1, 3, 2, -7, -5, 11, 6},
                new int[]{1, 3, 2, 11, 6, -1, -7, -5}
        );
    }

    @Test
    public void testExample2() {
        assertSegregation(
                new int[]{-5, 7, -3, -4, 9, 10, -1, 11},
                new int[]{7, 9, 10, 11, -5, -3, -4, -1}
        );
    }

    @Test
    public void testAllPositives() {
        assertSegregation(
                new int[]{5, 3, 2},
                new int[]{5, 3, 2}
        );
    }

    @Test
    public void testAllNegatives() {
        assertSegregation(
                new int[]{-1, -2, -3},
                new int[]{-1, -2, -3}
        );
    }

    @Test
    public void testZerosAndNegatives() {
        assertSegregation(
                new int[]{0, -2, 3, -4},
                new int[]{0, 3, -2, -4}
        );
    }

    @Test
    public void testEmptyInput() {
        assertSegregation(
                new int[]{},
                new int[]{}
        );
    }

    @Test
    public void testSinglePositive() {
        assertSegregation(
                new int[]{5},
                new int[]{5}
        );
    }

    @Test
    public void testSingleNegative() {
        assertSegregation(
                new int[]{-5},
                new int[]{-5}
        );
    }

    @Test
    public void testMixedWithZeroFirst() {
        assertSegregation(
                new int[]{0, -1, 2, -3},
                new int[]{0, 2, -1, -3}
        );
    }

    @Test
    public void testPreserveRelativeOrder() {
        assertSegregation(
                new int[]{3, -1, -2, 4, -5, 6},
                new int[]{3, 4, 6, -1, -2, -5}
        );
    }

    @Test
    public void testAlternatingNumbers() {
        assertSegregation(
                new int[]{1, -2, 3, -4, 5, -6},
                new int[]{1, 3, 5, -2, -4, -6}
        );
    }

    @Test
    public void testDups(){
        List<Integer> list = Arrays.asList(2,3,4,4,7,8,8);
        List<Integer> listA = Arrays.asList(4,8);
        MoveAllNegElementsToEnd m = new MoveAllNegElementsToEnd();
        ;
        Assert.assertArrayEquals(listA.toArray(),m.listDups(list).toArray() );
    }
}
