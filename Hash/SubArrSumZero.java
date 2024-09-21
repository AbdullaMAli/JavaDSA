import java.util.*;

public class SubArrSumZero{
    public static void main(String[] args){
        int[] arr = {4,2,-3,1,6};


        boolean flag = false;
        int sum = 0;//to claculate the cumilative sum
        HashMap<Integer,Integer> map = new HashMap<>();//to store the cumulative sum

        for(int n:arr){
            sum += n;
            if(sum == 0 || map.containsKey(sum)){//checking cumsum is zero or the cum_sum have already seen before, because if yes, we can avoid the subarr till the old repeated cumsum and consider only new one to get subarr sum zero.
                flag = true;
            }
            map.put(sum,1);//adding the cumilative sum to the map with value 1
        }

        System.out.println(flag);
    }
}


// //Little more optimized code
// import java.util.*;

// public class SubArrSumZero {
//     public static void main(String[] args) {
//         int[] arr = {4, 2, -3, 1, 6};

//         boolean flag = false;
//         int sum = 0; // To calculate the cumulative sum
//         HashSet<Integer> set = new HashSet<>(); // Using HashSet for faster lookups and memory optimization

//         for (int n : arr) {
//             sum += n;

//             // Check if the cumulative sum is 0 or it has been seen before
//             if (sum == 0 || set.contains(sum)) {
//                 flag = true;
//                 break; // Exit early as we've found the subarray with sum 0
//             }

//             set.add(sum); // Store the cumulative sum in the set
//         }

//         System.out.println(flag);
//     }
// }
