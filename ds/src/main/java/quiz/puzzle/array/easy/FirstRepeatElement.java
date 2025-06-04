/**
Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing.

Examples:

Input: arr[] = [1, 5, 3, 4, 3, 5, 6]
Output: 2
Explanation: 5 appears twice and its first appearance is at index 2 which is less than 3 whose first the occurring index is 3.
Input: arr[] = [1, 2, 3, 4]
Output: -1
Explanation: All elements appear only once so answer is -1.
 */
package quiz.puzzle.array.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatElement {
    public static int firstRepeated(int[] arr) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int index = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(indexMap.containsKey(arr[i])){
                index = Math.min(index,indexMap.get(arr[i]));
            }else{
                indexMap.put(arr[i],i);
            }
        }




        return index == Integer.MAX_VALUE ? -1 : index + 1;
    }
}


