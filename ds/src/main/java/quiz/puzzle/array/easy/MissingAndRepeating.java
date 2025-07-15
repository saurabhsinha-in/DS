/**
 Given an unsorted array arr of positive integers.
 One number a from the set [1, 2,....,n] is missing and one number b occurs twice in the array. Find numbers a and b.

 Note: The test cases are generated such that there always exists one missing and one repeating number within the range [1,n].

 Examples:

 Input: arr[] = [2, 2]
 Output: [2, 1]
 Explanation: Repeating number is 2 and smallest positive missing number is 1.
 Input: arr[] = [1, 3, 3]
 Output: [3, 2]
 Explanation: Repeating number is 3 and smallest positive missing number is 2.
 Input: arr[] = [4, 3, 6, 2, 1, 1]
 Output: [1, 5]
 Explanation: Repeating number is 1 and the missing number is 5.
 */
package quiz.puzzle.array.easy;

import java.util.*;

public class MissingAndRepeating {
    public ArrayList<Integer> findTwoElement2(int[] arr) {
        Arrays.sort(arr);
        int dup =-1;
        int mis = arr[0] -1;
        boolean isDup = false;
        boolean isMis = false;

        for(int i=0; i < arr.length-1;i++){
            if(!isDup && arr[i+1] - arr[i] ==0 ){
                dup = arr[i];
                isDup = true;
            }

            if(!isMis && (arr[i+1] - arr[i] > 1 || arr.length-2 ==i) ){
                mis = arr[i] + 1;
                isMis = true;
            }

            if(isDup && isMis) break;


        }


        ArrayList<Integer> list = new ArrayList<>();
        list.add(dup);
        list.add(mis);
        return list;
    }


    public ArrayList<Integer> findTwoElement(int[] arr){
        int repeat=-1;
        int mis= -1;
        int prev = 0;
        boolean isMisEmpty = true;
        boolean isRepeatEmpty = true;
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr);
        //map.keySet().stream().filter(k -> map.getOrDefault(k,0)+1==2);
        for(int k=0;k<arr.length;k++){


            if(isMisEmpty && arr[k] - prev >= 2 ){
                mis = arr[k]-1;
                isMisEmpty = false;
            }

            if(isRepeatEmpty && arr[k] - prev == 0 ){
                repeat = arr[k];
                isRepeatEmpty = false;
            }

            prev = arr[k];

            if( !isMisEmpty && !isRepeatEmpty ){
                break;
            }

            if(arr.length-1==k){
                mis = arr[k]+1;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(repeat);
        list.add(mis);
        return list;
    }
}
