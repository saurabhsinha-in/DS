/**
 Given a number x and an array of integers arr, find the smallest subarray with sum greater than the given value. If such a subarray do not exist return 0 in that case.

 Examples:

 Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
 Output: 3
 Explanation: Minimum length subarray is [4, 45, 6]
 Input: x = 100, arr[] = [1, 10, 5, 2, 7]
 Output: 0
 Explanation: No subarray exist
 Constraints:
 1 ≤ arr.size, x ≤ 105
 0 ≤ arr[] ≤ 104


 */

package quiz.puzzle.slidingwindow;

public class SmallestSubArrayWithSumGreaterThanX {

    public static int smallestSubWithSum(int x, int[] arr) {

        int n = arr.length;
        int val = Integer.MAX_VALUE;

        int start=0,end=0, currentSum =0;

        while(end < n){

            while(currentSum <= x && end <n){
                currentSum = currentSum + arr[end++];
            }

            while(currentSum> x && start<n){
                val = Integer.min(val,end - start);
                currentSum = currentSum - arr[start++];
            }
        }
        return val != Integer.MAX_VALUE?val:0;

    }
}
