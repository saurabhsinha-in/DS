/**
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.
Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
 */
package quiz.puzzle.array.medium;

public class Sort0s1s2s {

    public static void sort012(int[] arr) {
        int[] c = new int[3];

        for (int val : arr) {
            c[val] = c[val] + 1;
        }

        int k =0;
        for(int i=0; i < 3 ;i++){
            for(int j = 0 ; j < c[i]; j++){
                arr[k++] = i;
            }
        }

    }

}
