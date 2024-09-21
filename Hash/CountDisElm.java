// Given an array of integers, you need to count the number of distinct elements in the array.


import java.util.*;

public class CountDisElm {
    public static void main(String[] args){
        int[] arr = {1,2,1,3,5,2,1};


        HashSet<Integer> set = new HashSet<>();

        for(int n : arr){
            set.add(n);
        }

        System.out.println(set.size());

    }
}
