/**
 * Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
 *
 * Note: The second largest element should not be equal to the largest element.
 *
 * Examples:
 *
 * Input: arr[] = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 * Input: arr[] = [10, 5, 10]
 * Output: 5
 * Explanation: The largest element of the array is 10 and the second largest element is 5.
 * Input: arr[] = [10, 10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 and the second largest element does not exist.
 */

package quiz.puzzle.array;

public class SecondHighest {

    public static int findSecondLargest(int[] arr) {

        if(arr == null || arr.length==0 || arr.length==1){
            return -1;
        }

        int max = arr[0];
        int min = -1;
        int temp = -1;

        for(int i=1; i<arr.length;i++){
            int val = arr[i];
            if(max<val){
                temp = max;
                max = val;
            }


                if (temp > min) {
                    min =  temp;
                } else if (min < val && max != val) {
                    min = val;
                }

        }
        return min;

    }
}
