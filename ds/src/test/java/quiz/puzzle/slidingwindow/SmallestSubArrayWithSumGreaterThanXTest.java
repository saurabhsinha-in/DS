package quiz.puzzle.slidingwindow;


import org.junit.Test;
import static org.junit.Assert.*;

public class SmallestSubArrayWithSumGreaterThanXTest {

    @Test
    public void testExampleCase1() {
        int[] arr = {1, 4, 45, 6, 0, 19};
        int x = 51;
        assertEquals(3, SmallestSubArrayWithSumGreaterThanX.smallestSubWithSum(x, arr));
    }

    @Test
    public void testExampleCase2() {
        int[] arr = {1, 10, 5, 2, 7};
        int x = 100;
        assertEquals(0, SmallestSubArrayWithSumGreaterThanX.smallestSubWithSum(x, arr));
    }

    @Test
    public void testExactSum() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 15;
        assertEquals(0, SmallestSubArrayWithSumGreaterThanX.smallestSubWithSum(x, arr));
    }

    @Test
    public void testWholeArrayNeeded() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int x = 20;
        assertEquals(6, SmallestSubArrayWithSumGreaterThanX.smallestSubWithSum(x, arr));
    }

    @Test
    public void testSingleElementSufficient() {
        int[] arr = {1, 2, 100, 3};
        int x = 50;
        assertEquals(1, SmallestSubArrayWithSumGreaterThanX.smallestSubWithSum(x, arr));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int x = 10;
        assertEquals(0, SmallestSubArrayWithSumGreaterThanX.smallestSubWithSum(x, arr));
    }
}
