/**
 Common in 3 Sorted Arrays
 Difficulty: EasyAccuracy: 22.16%Submissions: 422K+Points: 2
 Given three sorted arrays in non-decreasing order, print all common elements in non-decreasing order across these arrays. If there are no such elements return an empty array. In this case, the output will be -1.

 Note: can you handle the duplicates without using any additional Data Structure?

 Examples :

 Input: arr1 = [1, 5, 10, 20, 40, 80] , arr2 = [6, 7, 20, 80, 100] , arr3 = [3, 4, 15, 20, 30, 70, 80, 120]
 Output: [20, 80]
 Explanation: 20 and 80 are the only common elements in arr, brr and crr.
 Input: arr1 = [1, 2, 3, 4, 5] , arr2 = [6, 7] , arr3 = [8,9,10]
 Output: [-1]
 Explanation: There are no common elements in arr, brr and crr.
 Input: arr1 = [1, 1, 1, 2, 2, 2], B = [1, 1, 2, 2, 2], arr3 = [1, 1, 1, 1, 2, 2, 2, 2]
 Output: [1, 2]
 Explanation: We do not need to consider duplicates
 */

package quiz.puzzle.array.easy;

import java.util.*;

public class Common3SortedArrays {
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        Set<Integer> val = new HashSet<>(arr1);
        Set<Integer> list = new HashSet<>();
        Set<Integer> r = new HashSet<>();

        for(Integer i:arr2){
            if(val.contains(i)){
                list.add(i);
            }
        }
        for(Integer i:arr3){
            if(list.contains(i)){
                r.add(i);
            }
        }
        List<Integer> result = new ArrayList<>(r);
        if(result.isEmpty()){
            result.add(-1);
        }
        Collections.sort(result);
        return result;


    }
}
