//Given an array A of N elements. Find the majority element in the array.
//A majority element in an array A of size N is an element that appears more than N/2 times in the array

// Moore’s Voting Algorithm => Time Complexity: O(n), Space Complexity: O(1)


//Moore's Voting Alorithm
//The logic is that, if there is a value as majority element, the count of that value in this code will never become zero.
//Because the number of values other than the answer will always be less, so it can never outnumber the count of the answer value, if there is an answer.



public class MooresVotingAlgorithm
{
	public static void main(String[] args) {
		int[] arr = {3,3,3,1,2,3,1,1,3};//initialising 
		
		int count = 1;//no of values at the position of variable named index.
		int index = 0;//staring from zeroth element
		
		
		
		//we start iterating the array from the first index. if the val is equal to the index value we increment the count,
		//if it is some other value, the count will be decremented. if the count become zero, we will change the index the ith value at that index.
		
		for(int i = 1;i<arr.length;i++){
		    if(arr[i] == arr[index]){
		        count++;
		    }
		    if(arr[i] != arr[index] ){
		        count--;
		    }if(count == 0 ){
		        index = i;
		        count = 1;
		    }
		}
		
		int countCheck = 0;
		for(int num : arr){
		    if(num == arr[index]){
		        countCheck++;
		    }
		}
		
		if(countCheck > arr.length/2){
		    System.out.println(arr[index]);
		}else{
		    System.out.println("No such value as majority element");
		}
		
		
	}
}