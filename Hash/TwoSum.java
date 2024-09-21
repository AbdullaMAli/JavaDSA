import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {1,5,3,4};
        int t = 7;

        HashMap<Integer,Integer> map = new HashMap<>();//map to store arr val and index


        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(t - arr[i])){//if map has t-i value it means the sum is possible and print the t-i index and i index
                System.out.println("("+i+","+map.get(t-arr[i])+")");
                break;
            }

            map.put(arr[i],i);// if not present, add the current value with index to map
        }
    }
}
