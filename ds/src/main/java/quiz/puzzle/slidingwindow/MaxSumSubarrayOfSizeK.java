package quiz.puzzle.slidingwindow;


/**
Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.

Examples:

Input: arr[] = [100, 200, 300, 400] , k = 2
Output: 700
Explanation: arr3  + arr4 = 700, which is maximum.
Input: arr[] = [100, 200, 300, 400] , k = 4
Output: 1000
Explanation: arr1 + arr2 + arr3 + arr4 = 1000, which is maximum.
Input: arr[] = [100, 200, 300, 400] , k = 1
Output: 400
Explanation: arr4 = 400, which is maximum.
Constraints:
 */


public class MaxSumSubarrayOfSizeK {
    public static int maxSum(int[] arr, int k) {
        int sum = 0;
        int max;
        for(int i=0; i<k;i++){
                sum = sum + arr[i];
        }
        max = sum;

        for(int j=k; j<arr.length;j++){
            sum = sum + arr[j] - arr[j-k];
            if(sum> max){
                max = sum;
            }
        }
        return max;
    }
}
