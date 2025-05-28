package quiz.puzzle.slidingwindow;

public class SubArrayWithZeroSum {
    public boolean findsum(int arr[]) {
        if(arr.length==0 || (arr.length==1 && arr[0] != 0) ){
            return false;
        }
        int left = 0;
        int sum = 0;

        for(int right=0;right<arr.length;right++){
            sum = sum + arr[right];
            while(sum>0 && left < right){
                sum = sum - arr[left];
                left++;
            }
            if(sum == 0 ){
                return true;
            }
        }


        return false;
    }
}
