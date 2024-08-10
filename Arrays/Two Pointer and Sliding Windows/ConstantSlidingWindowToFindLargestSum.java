//Note that here the length of window or K or the length of subarray is constant



public class ConstantSlidingWindowToFindLargestSum
{
	public static void main(String[] args) {
		int[] arr = {-2,-1,4,5,2,6,2};
		int k = 4;//int val of maxval subarray length to be find
		
		int maxSum = -10000;
		int sum = 0;
		
		int l = 0;//left pointer
		int r = k-1;//right pointer
		

        //finding the first sub array sum of length k
		for(int i = 0;i<=r;i++){
		    sum += arr[i];
		}
		
		maxSum = sum;//making maxSub the current sum;
		while(r<arr.length - 1){
		    sum = sum - arr[l];//subtracting the left value before sliding the window to left from sum
		    l++;//sliding the window left
		    r++;//sliding the window right
		    sum = sum + arr[r];//adding the value after sliding the window to right to sum
		    
		    if(sum>maxSum){//checking if the mxm sum is greater than the maxSum
		        maxSum = sum;//updating maxSum
		    }
		}
		System.out.println(maxSum);//displaying the maxSum
	}
}