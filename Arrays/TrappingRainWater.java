// Given an array arr[] of N non-negative integers representing the height of blocks. 
// If width of each block is 1, compute how much water can be trapped between the blocks during the rainy season. 





public class TrappingRainWater
{
    
    static int MIN(int n1, int n2){
        if(n1>n2){
            return n2;
        }else{
            return n1;
        }
    }
	public static void main(String[] args) {
	    int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
	    
	    
	    
	    //Method1
	    
	    /*int[] pre = new int[arr.length];//give the mxm value at that index in the array from the left
	    int[] suf = new int[arr.length];//give the mxm value at that index in the array from the right
	    
	    pre[0] = arr[0];//first mxm value at index zero from left is always arr[0]
	    suf[arr.length - 1] = arr[arr.length - 1]; //first mxm value at index zero from right is always arr[n-1]
	    
	    for(int i = 1;i<arr.length; i++){//getting all the left max val at all indexes
	        if(arr[i] > pre[i-1]){
	            pre[i] = arr[i];
	        }else{
	            pre[i] = pre[i-1];
	        }
	    }
	    
	    for(int i = arr.length - 2;i>=0; i--){//getting all the right max val at all indexes
	        if(arr[i] > suf[i+1]){
	            suf[i] = arr[i];
	        }else{
	            suf[i] = suf[i+1];
	        }
	    }
	    
	    
// 	    for(int num:pre){
// 	        System.out.print(num + " ");
// 	    }
// 		System.out.println();
		
		
// 		for(int num:suf){
// 	        System.out.print(num + " ");
// 	    }
// 		System.out.println();
        
        int total = 0;//variable to store the amount of watar
        
        
        //To store water at a index, there should be a building taller than that building or index to the both
        //left and right.And the water stored will be min(leftmax,rightmax) - the val at the building
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<pre[i] && arr[i]<suf[i]){
                total += MIN(pre[i],suf[i]) - arr[i];
            }
        }
        
        System.out.println(total);*/
        
        
        
        //Method 2
        
        
        int total = 0;//var to store amount of water
        int leftMax = 0;//var to store leftmax for each index
        int rightMax = 0;//var to store rightmax for each index
        int l = 0;//index from left
        int r = arr.length - 1;//index from right
        
        for(int i = 0;i<arr.length;i++){//loop to run n(length of arr) times
        //total = min(leftmxm,rightmxm) - arr[i]. So we always need the smaller one from both left and right
        //thats what the first if condition does.
            if(arr[l]<arr[r]){
                if(arr[l]<leftMax){//if the left minm arr value is less than than leftmax, then only it can store water
                    total += leftMax - arr[l];
                }else{
                    leftMax = arr[l];//else it itself is the left max
                }
            l++;
            }else{
                if(arr[r]<rightMax){//if the right minm arr value is less than than rifhtmax, then only it can store water
                    total += rightMax - arr[r];
                }else{
                    rightMax = arr[r];//else it itself is the right max
                }
            r--;
            }
        }
        
        System.out.println(total);
        
	}
	
	
	
	//Solution Tutorial Link : "https://youtu.be/1_5VuquLbXg?feature=shared"
}