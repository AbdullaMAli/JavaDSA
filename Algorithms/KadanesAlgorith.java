// Problem Statement: Maximum Subarray Sum
// Given an array of integers, find the contiguous subarray (containing at least one number)
//  that has the largest sum and return that sum.




public class KadanesAlgorithm{
    public static void main(String[] args){
        //int[] arr1 = {-2,7,-3,4};
        int[] arr1 = {-2,-3,-1};
        
        
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;
        
        for(int num : arr1){
            curSum += num;
            if(curSum > maxSum){
                maxSum = curSum;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        
        System.out.println(maxSum);
    }
}