package ques.algo;
/**
 * Kadane algo
 * the maximum subarray problem is the task of finding the contiguous subarray 
 * within a one-dimensional array of numbers which has the largest sum. For example, 
 * for the sequence of values −2, 1, −3, 4, −1, 2, 1, −5, 4; the contiguous subarray with the 
 * largest sum is 4, −1, 2, 1, with sum 6.
 * @author saurabh.b.sinha
 * 
 * 
 * In this we take out the maximum sum for any set of sub arrays.
 * global_max - This is the max value which can get in sequence.
 * current_max - It is to check the recent max value. This also make the disconnect 
 *  
 *
 */
public class Kadane {

	
	public int countMax(int arr[]){
		int global_max = 0, current_max = 0;
		
		for(int val: arr){
			current_max = val+ current_max;			
			if(global_max < current_max){
				global_max = current_max;
			}
			/**This makes a disconnect if a value less 0 comes in. If it is the positive number it should be added.*/
			if(current_max<0){
				current_max=0;
			}
		}
		
		return global_max;
	}
	
	public static void main(String args[]){
		int val[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		Kadane kn = new Kadane();
		
		System.out.println(kn.countMax(val));
	}
	
}
