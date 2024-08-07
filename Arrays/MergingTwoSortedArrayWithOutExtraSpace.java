/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class MergingTwoSortedArrayWithOutExtraSpace
{
    
    static void sortInternally(int[] arr1, int[] arr2, int n1, int n2){
        int i = n1 - 1;
        int j = 0;
        
        while(i>=0 && j<n2){
            if(arr1[i] > arr2[j]){
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            
            i--;
            j++;
        }
    }
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int n1 = inp.nextInt();
		int n2 = inp.nextInt();
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		
		for(int i = 0;i<n1;i++){
		    arr1[i] = inp.nextInt();
		}
		
		for(int i = 0;i<n2;i++){
		    arr2[i] = inp.nextInt();
		}
		
		sortInternally(arr1,arr2,n1,n2);
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		StringBuffer str = new StringBuffer();
        for (int i = 0; i < n1; i++) {
            str.append(arr1[i]).append(" ");
        }
        for (int i = 0; i < n2; i++) {
            str.append(arr2[i]).append(" ");
        }
        System.out.println(str);
		for(int n : arr1){
		    System.out.println(n);
		}
	}
}