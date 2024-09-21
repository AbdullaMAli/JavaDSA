import java.util.*;


public class LongestContValsInAnArr {

    static int Max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
        
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,45,100,200,201,202,203,204,205,206};
        Arrays.sort(arr);

        int max = 1;
        int count = 1;

        int start = 0;
        int end = 0;
        for(int i = 0;i<arr.length - 1;i++){
            if(arr[i+1] == arr[i] + 1){
                count++;
                max = Max(max,count);
                end++;
            }else{
                System.out.println(start+" "+end);
                start = end;
                count = 1;
            }
        }

        System.out.println(max);
        // for(int n : arr){
        //     System.out.println(n);
        // }
    }
}
