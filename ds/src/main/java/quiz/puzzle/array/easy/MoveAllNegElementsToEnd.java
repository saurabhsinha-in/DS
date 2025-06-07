/**
 Move all negative elements to end
 Difficulty: EasyAccuracy: 56.24%Submissions: 154K+Points: 2
 Given an unsorted array arr[ ] having both negative and positive integers. The task is to place all negative elements at the end of the array without changing the order of positive elements and negative elements.

 Note: Don't return any array, just in-place on the array.

 Examples:

 Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
 Output : [1, 3, 2, 11, 6, -1, -7, -5]
 Explanation: By doing operations we separated the integers without changing the order.
 Input : arr[] = [-5, 7, -3, -4, 9, 10, -1, 11]
 Output : [7, 9, 10, 11, -5, -3, -4, -1]
 * */

package quiz.puzzle.array.easy;

import java.util.ArrayList;
import java.util.List;

public class MoveAllNegElementsToEnd {
    public void segregateElements(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i : arr){
            if(i < 0){
                neg.add(i);
            }else{
                pos.add(i);
            }
        }
        int k =0;
        while(k < pos.size()){
            arr[k] = pos.get(k);
            k++;
        }

        int j=0;
        while(j < neg.size()){
            arr[k] = neg.get(j);
            j++;
            k++;
        }

    }
}
