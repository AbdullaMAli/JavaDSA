

public class ReverseAArray
{
    static int[] Rev(int i,int j,int[] arr){
        if(i>j){
            return arr;
        }else{
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            return Rev(i+1,j-1,arr);
        }
        
        
            
    }
	public static void main(String[] args) {
	    int[] arr = {2,1,3,5,0};
	    int[] ans = Rev(0,arr.length-1,arr);
	    for(int i : ans){
	        System.out.println(i);
	    }
	}
}