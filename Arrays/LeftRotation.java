
//METHOD ONE

//TIME COMPLEXITY O(M);
//M = NO OF THE ELEMENTS REPLACES, HERE WE ARE DOING IT TWIXE



//SPACE COMPLEXITY
//O(N)
//WE ARE CREATING AN NEW ARRAY OF SIZE N

public class LeftRotate
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int k = 3;
		
		int[] ans = new int[arr.length];
		
		System.arraycopy(arr,k,ans,0,arr.length - k);
		System.arraycopy(arr,0,ans,arr.length - k,k);
		for(int num:ans){
		    System.out.print(num+" ");
	}
	}
}



//METHOD 2


//TIME COMPLEXITY O(M*N)
//M = NO OF THE ELEMENTS IN THE ARRAY
//N = NO OF ROTATIONS

//SPACE COMPLEXITY O(1), JUST A VARIABLE TO STORE THE FIRST VALUE, EXCEPT THE INPUT VALUES


public class LeftRotation{
    
    static void rotateToLeft(int[] arr){
        if(arr.length == 0 || arr == null){
            System.out.println("Rotation not possible");
            return;
        }
        
        int firstVal = arr[0];
        
        for(int i = 0;i<arr.length;i++){
            if(i == arr.length - 1){
                arr[i] = firstVal;
            }else{
                arr[i] = arr[i+1];
            }
            
        }
    }
    
    static void print(int[] arr){
        System.out.print("[");
        for(int val : arr){
            System.out.print(val+" " );
        }
        System.out.print("]");
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        int k = 4;
        
        System.out.println("Before rotation");
        print(arr);
        System.out.println();
        
        
        System.out.println("After rotation");
        
        for(int i = 0;i<k;i++){
            rotateToLeft(arr);
        }
        
        print(arr);
    }
}
