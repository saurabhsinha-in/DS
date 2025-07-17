package quiz.puzzle.slidingwindow;


import org.junit.Assert;
import org.junit.Test;

public class SubarrayWithGivenSumTest {

    @Test
    public void sample1(){
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        Assert.assertArrayEquals(new int[]{2,5},SubarrayWithGivenSum.subarraySum(arr,23).stream().mapToInt(x->x).toArray());
    }
}