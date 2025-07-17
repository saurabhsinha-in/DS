/**
 Subarray with Given Sum
 Difficulty: EasyAccuracy: 24.01%Submissions: 2K+Points: 2Average Time: 20m
 You are given an array arr[] and an integer sum. You need to return the start and end (1-Based) indexes of a subarray whose sum is equal to the given sum.
 If many such sub-array are present, return the indexes which comes first moving from left to right. If no such sub-array is present return empty array

 Examples:

 Input: arr[] = [15, 2, 4, 8, 9, 5, 10, 23], sum = 23
 Output: 2 5
 Explanation : Sum of elements between indices 2 and 5 is 2+4+8+9 = 23
 Input: arr[] = [1, 4, 0, 0, 3, 10, 5], sum = 7
 Output: 2 5
 Explanation: Sum of elements between indices 2 and 5 is 4+0+0+3 = 7
 Input: arr[] = [1, 4], sum = 0
 Output: []
 Explanation: There is no subarray with 0 sum
 */

package quiz.puzzle.slidingwindow;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

    public static ArrayList<Integer> subarraySum(int[] arr, int sum) {
        int n = arr.length;
        int start = 0;
        //int end = 0;
        int currentSum = 0;


        for(int end=0;end<n;end++){
            currentSum = currentSum + arr[end];

            while(currentSum>sum){
                currentSum = currentSum-arr[start];
                start++;
            }
            if(currentSum==sum){
                ArrayList<Integer> a = new ArrayList<>();
                a.add(start+1);
                a.add(end+1);
                return a;
            }
        }






        return new ArrayList<>();

    }
}
