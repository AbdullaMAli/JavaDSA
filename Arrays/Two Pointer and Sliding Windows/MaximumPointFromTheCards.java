

public class MaximumPointFromTheCards
{
	public static void main(String[] args) {
	    int[] arr = {6,2,3,4,7,2,1,7,1};
	    int k = 4;
	    
	   // Method 1
	   
	   
// 	    int l = 0;//left index to get the first sum
// 	    int r = k-1;//rigt index to get the first sum
	    
// 	    int sum = 0;//var to store individual sums
// 	    int maxSum = 0;//var to store last maxSum
	    
	    
	    //loop to get first sum
// 	    for(int i = l;i<=r;i++){
// 	        sum += arr[i];
// 	    }
	    
// 	    maxSum = sum;//making maxsum the first sum
// 	    l = arr.length;//updating the l index to the end of the arr to add value from the end
	    
// 	    while(r>=0){
// 	        sum = sum - arr[r];removing value from the right side
// 	        r--;//shrinking the window on left
	        
// 	        l--;//expanding the window on right
// 	        sum = sum + arr[l];adding the right window value
	        
// 	        if(sum > maxSum){//checking for maxsum
// 	            maxSum = sum;
// 	        }
// 	    }
// 		System.out.println(maxSum);

        
        //Method 2
        
        
        //here we keep to separate var for lsum and rsum and then add them to get the individual sum then Compare it with maxsum
        int lSum = 0;
        int rSum = 0;
        int sum = 0;
        int maxSum = 0;
        
        for(int i = 0;i<k;i++){
            lSum += arr[i];
        }
        
        sum = lSum + rSum;
        maxSum = sum;
        
        
        int rIndex = arr.length - 1;
        for(int i = k - 1;i>=0;i--){
            lSum = lSum - arr[i];
            
            rSum = rSum + arr[rIndex];
            rIndex--;
            
            sum = lSum + rSum;
            
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
	}
}