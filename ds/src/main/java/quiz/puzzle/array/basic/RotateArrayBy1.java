/**
Given an array arr, rotate the array by one position in clockwise direction.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
Output: [3, 9, 8, 7, 6, 4, 2, 1]
Explanation: After rotating clock-wise 3 comes in first position.
 */
package quiz.puzzle.array.basic;

public class RotateArrayBy1 {
    public void rotate(int[] arr) {
        int n = arr.length -1;
        if(n>-1) {
            int last = arr[n];
            for (int i = n - 1; i >= 0; i--) {
                arr[i+1] = arr[i];
            }
            arr[0] = last;
        }
    }
}
