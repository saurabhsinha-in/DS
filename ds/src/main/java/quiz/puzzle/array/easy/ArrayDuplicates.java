/**
 Array Duplicates
 Difficulty: EasyAccuracy: 18.95%Submissions: 827K+Points: 2Average Time: 20m
 Given an array arr of integers, find all the elements that occur more than once in the array. If no element repeats, return an empty array.

 Examples:

 Input: arr[] = [2, 3, 1, 2, 3]
 Output: [2, 3]
 Explanation: 2 and 3 occur more than once in the given array.
 Input: arr[] = [0, 3, 1, 2]
 Output: []
 Explanation: There is no repeating element in the array, so the output is empty.
 Input: arr[] = [2]
 Output: []
 Explanation: There is single element in the array. Therefore output is empty.
 */


package quiz.puzzle.array.easy;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDuplicates {

    public static List<Integer> findDuplicates(Integer[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            Integer val = map.getOrDefault(j, 0);
            map.put(j, val + 1);
        }

        return map.keySet().stream().filter(v -> map.get(v) > 1).collect(Collectors.toList());


    }

    public static List<Integer> findDuplicates(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int j : arr){
            Integer val = map.getOrDefault(j,0);
            map.put(j, val+1);
        }

        List<Integer> list = new ArrayList<>();
        for(Integer key: map.keySet()){
            if(map.get(key) > 1){
                list.add(key);
            }
        }
        //Collections.sort(list);

        return list;

    }
}
