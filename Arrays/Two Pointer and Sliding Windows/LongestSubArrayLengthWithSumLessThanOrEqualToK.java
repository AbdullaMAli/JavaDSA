
//Longest Subarray length with sum <= k
public class LongestSubArrayLengthWithSumLessThanOrEqualToK
{
    static int Max(int n, int m){
        if(n>=m){
            return n;
        }else{
            return m;
        }
    }
	public static void main(String[] args) {
		int[] arr = {2,0,0,0,0,4,2};
		int k = 6;//conditional valuw
		
		int sum = 0;//var to store current sum 
		int maxLength = 0;//var to store the answer
		int l = 0;//left pointer, which is used for shrinking
		int r = 0;//right pointer, which is used for expanding
		
		while(r<arr.length){//r can only go up till the end of the arr
		    sum = sum + arr[r];//the first sum is always the first valuw

            //while can also be used down.

    	    if(sum>k){//if the sum is not satisfying the condition 
		        sum = sum - arr[l];//we will subtract the left value from sum
		        l++;//then shrink the window
		    }
		    
		    if(sum<=k){//if its satisfying
		        maxLength = Max(maxLength,r-l+1);//we will update the lenght of the maxLength
		        
		    }
		    
		    r++;//at end we expand the window and add the expanded value, from the top line inside the while loop
		}
		System.out.println(maxLength);
	}
}