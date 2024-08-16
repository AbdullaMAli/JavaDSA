

public class public class MaximumNumberOfConsicutiveOnesIfWeCanChangeKZeroesToOne

{
    static int Max(int a, int b){
        if(a>= b){
            return a;
        }else{
            return b;
        }
    }
	public static void main(String[] args) {
	    int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
	    int k = 3;
	    

        //Method-1 My Solution.
// 	    int ans = 0;
// 	    int l = 0;
// 	    int r = 0;
// 	    int count = 0;
	    
// 	    while(r<arr.length){
// 	        if(arr[r] == 0){
// 	            count++;
// 	        }
// 			while(count>k){
// 				if(arr[l] == 0){
// 					count--;
// 				}
// 				l++;
// 			}
// 	        if(count<=k){
// 	            ans = Max(ans,r-l+1);
// 	        }
	            
// 	        r++;
// 	    }
	    
// 		System.out.println(ans);

    
        //Method 2
        
        
        int ans = 0;
	    int l = 0;
	    int r = 0;
	    int count = 0;
	    
	    while(r<arr.length){
	        if(arr[r] == 0){
	            count++;
	        }
			if(count>k){
			    if(arr[l] == 0){
			        zero--;     //here we are not allowing to reduce the size of the current highest window,			                   //until we found a higher window
			        l++;
			    }
			}
	        if(count<=k){
	            ans = Max(ans,r-l+1);
	        }
	            
	        r++;
	    }
	    
		System.out.println(ans);
	}
}