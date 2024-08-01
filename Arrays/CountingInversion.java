// count the number of inversions in an array. An inversion is defined as a pair of indices (i, j)
// such that i < j and arr[i] > arr[j]. 
// The code utilizes a modified merge sort algorithm to efficiently count the number of inversions.




public class CountingInversion
{
	public static void main(String[] args) {
	    int[] arr = {2,1,5,3,2,7};//initialised array
	    
	    for(int i = 0;i<arr.length-1;i++){
	        for(int j = i+1;j<arr.length;j++){
	            if(arr[j] < arr[i]){
	                System.out.print(arr[i]+" "+arr[j]);
	                System.out.println();
	            }
	        }
	    }
		System.out.println("Hello World");
	}
}

//The above one is the straight forward solution.

//There is an another efficient solution using merge sort. Do that when you learn merge sort.