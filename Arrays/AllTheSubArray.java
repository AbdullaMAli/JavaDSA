public class AllTheSubArray {
    static void arrSlice(int[] arr, int n, int m){
        for(int i = n;i<m;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {2,1,4,3,2,4};

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<=arr.length;j++){
                arrSlice(arr,i,j);
            }
            
        }
    }
}
