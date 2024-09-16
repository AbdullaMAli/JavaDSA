public class BullseyeProblem {
    public static void main(String[] args){
        int[] arr = {2,1,3,0,1};
        int point1 = 0;
        int point2 = 0;
        for(int num:arr){
            if(num == 1){
                point1++;
            }else if(num == 2){
                point2++;
            }else if(num == 3){
                point1++;
                point2++;
            }else{
                continue;
            }
        }

        int[] player1 = new int[point1];
        int[] player2 = new int[point2];

        int index1 = 0;
        int index2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                player1[index1] = i;
                index1++;
                
            }else if(arr[i] == 2){
                player2[index2] = i;
                index2++;
            }else if(arr[i] == 3){
                player1[index1] = i;
                index1++;
                player2[index2] = i;
                index2++;
            }else{
                continue;
            }
        }

        int l = arr.length - 1;

        int maxVal = (l*(l+1))/2;
        //System.out.println(maxVal);

        int[] getSum = new int[arr.length];
        int subtractor = 1;
        int index3 = 0;
        int i = 0;
        int j = arr.length - 1;

        while(i<=j){
            if(i == 0 && j == arr.length - 1){
                getSum[index3] = maxVal;
                getSum[arr.length-index3-1] = maxVal;
                index3++;
                i++;
                j--;
            }else{
                int n = arr.length-index3-1;
                
                getSum[index3] = (n*(n+1))/2 + subtractor;
                
                getSum[n] = ((n*(n+1))/2) + subtractor;
                subtractor += 2;
                i++;
                j--;
                index3++;
            }
        }


        int sum1 = 0;
        int sum2 = 0;

        for(int num : player1){
            sum1 += getSum[num];
        }

        
        for(int num : player2){
            sum2 += getSum[num];
        }
        
        System.out.println(sum1 - sum2);
        
        // for(int num:player1){
        //     System.out.println(num);
        // }
        // for(int num:player2){
        //     System.out.println(num);
        // }
        // System.out.println(point1+" "+point2);
    }
}

