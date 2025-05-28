package quiz.puzzle.slidingwindow;

public class IndexesOfSubArraySum {

/**
 Given an array arr[] containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target.
 You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. You need to find the first subarray whose sum is equal to the target.

 Note: If no such array is possible then, return [-1].

 Examples:

 Input: arr[] = [1, 2, 3, 7, 5], target = 12
 Output: [2, 4]
 Explanation: The sum of elements from 2nd to 4th position is 12.
 Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
 Output: [1, 5]
 Explanation: The sum of elements from 1st to 5th position is 15.
 Input: arr[] = [5, 3, 4], target = 2
 Output: [-1]
 Explanation: There is no subarray with sum 2.
 */
    public int[] findSubArrayWithSum1(int[] arr, int target) {

        int minI = 0;
        int maxI = 0;
        int sum = 0;
        int[] r;
        if(arr.length <1 || (arr.length==1 && arr[0] != target) ){
            r = new int[]{-1};
            return r;
        }

        //sum = arr[0];
        for (int j =0;j<arr.length;j++) {

            sum = sum + arr[j];


            if (sum == target) {
                 return new int[]{minI + 1, maxI + 1};
            } else if (sum > target) {

                while (sum > target) {
                    sum = sum - arr[minI];
                    minI = minI + 1;
                }
                if(sum == target && target != 0){
                    return new int[]{minI + 1, maxI + 1};
                }
            }
            maxI = maxI +1;
        }
        r = new int[]{-1};
        return r;
    }

    public int[] findSubArrayWithSum(int[] arr, int target) {

        if (target == 0) {
            if(arr[0]==0)
                return new int[]{1};
            else
                return new int[]{-1};
        }

        if(arr.length==0 || (arr.length==1 && arr[0]!= target) ){
            return new int[]{-1};
        }
        int left = 0;
        int sum = 0;

        for(int right =0;right <arr.length;right++){
            sum = sum + arr[right];
            while(sum > target && left<= right){
                sum = sum - arr[left];
                left++;
            }
            if(sum == target){
                return new int[]{left+1,right+1};
            }
        }

        if( arr.length==1 && arr[0]== target){
            return new int[]{1};
        }

        return new int[]{-1};
    }

}

