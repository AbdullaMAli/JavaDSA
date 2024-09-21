import java.util.*;


//when maxsize of n is given

public class CountOccOfElmInAnArr{
    public static void main(String[] args){
        int[] arr = {1,2,1,2,3};
        int n = 10;
        // int max = 12;

        // int[] hash = new int[max];

        // for(int i = 0;i<arr.length;i++){
        //     hash[arr[i]] += 1;
        // }

        // System.out.println(hash[n]);


        //when the array size is too big or not give.


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num) + 1);//increment by 1.
            }else{
                map.put(num,1);
            }
        }
        System.out.println(map.get(3));
        }
}