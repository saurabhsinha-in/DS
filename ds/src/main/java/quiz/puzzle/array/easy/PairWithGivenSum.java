/**
 Two Sum - Pair with Given Sum
 Difficulty: EasyAccuracy: 30.61%Submissions: 394K+Points: 2Average Time: 20m
 Given an array arr[] of integers and another integer target. Determine if there exist two distinct indices such that the sum of their elements is equal to the target.

 Examples:

 Input: arr[] = [0, -1, 2, -3, 1], target = -2
 Output: true
 Explanation: arr[3] + arr[4] = -3 + 1 = -2
 Input: arr[] = [1, -2, 1, 0, 5], target = 0
 Output: false
 Explanation: None of the pair makes a sum of 0
 Input: arr[] = [11], target = 11
 Output: false
 Explanation: No pair is possible as only one element is present in arr[]
 */


package quiz.puzzle.array.easy;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {
    boolean twoSum(int arr[], int target) {

        if(arr==null || arr.length<2){
            return false;
        }

        Set<Integer> seen = new HashSet<>();
        for (int j=0;j<arr.length;j++) {
            int num = target - arr[j];
            if (seen.contains(num)) {
                return true;
            }
            seen.add(arr[j]);
        }
        return false;

    }
}
