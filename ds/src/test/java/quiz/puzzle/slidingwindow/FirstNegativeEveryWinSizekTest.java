package quiz.puzzle.slidingwindow;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FirstNegativeEveryWinSizekTest {
    @Test
    public void testFirstExample() {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        List<Integer> expected = Arrays.asList(-8, 0, -6, -6);
        assertEquals(expected, FirstNegativeEveryWinSizek.firstNegInt(arr, k));
    }

    @Test
    public void testSecondExample() {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        List<Integer> expected = Arrays.asList(-1, -1, -7, -15, -15, 0);
        assertEquals(expected, FirstNegativeEveryWinSizek.firstNegInt(arr, k));
    }

    @Test
    public void testThirdExample() {
        int[] arr = {12, 1, 3, 5};
        int k = 3;
        List<Integer> expected = Arrays.asList(0, 0);
        assertEquals(expected, FirstNegativeEveryWinSizek.firstNegInt(arr, k));
    }

    @Test
    public void testAllNegativesWindow() {
        int[] arr = {-5, -3, -2};
        int k = 2;
        List<Integer> expected = Arrays.asList(-5, -3);
        assertEquals(expected, FirstNegativeEveryWinSizek.firstNegInt(arr, k));
    }

    @Test
    public void testSingleElementWindow() {
        int[] arr = {-10};
        int k = 1;
        List<Integer> expected = Arrays.asList(-10);
        assertEquals(expected, FirstNegativeEveryWinSizek.firstNegInt(arr, k));
    }

    @Test
    public void testNoNegativesInAnyWindow() {
        int[] arr = {5, 4, 3, 2};
        int k = 2;
        List<Integer> expected = Arrays.asList(0, 0, 0);
        assertEquals(expected, FirstNegativeEveryWinSizek.firstNegInt(arr, k));
    }

    @Test
    public void testMixedWindowWithImmediateNegative() {
        int[] arr = {-1, 2, -3};
        int k = 3;
        List<Integer> expected = Arrays.asList(-1);
        assertEquals(expected, FirstNegativeEveryWinSizek.firstNegInt(arr, k));
    }

    @Test
    public void testFullArrayWindow() {
        int[] arr = {12, -1, -7};
        int k = 3;
        List<Integer> expected = Arrays.asList(-1);
        assertEquals(expected, FirstNegativeEveryWinSizek.firstNegInt(arr, k));
    }
}
