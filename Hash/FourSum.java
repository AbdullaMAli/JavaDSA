import java.util.*;

public class FourSum {
     static boolean BS(int t,int[] a){
        int l = 0;
        int r = a.length - 1;
        
        while(l<=r){
            int mid = (l+r)/2;
            if(a[mid] == t){
                return true;
            }else{
                if(a[mid] < t){
                    l = mid+1;
                }else{
                    r = mid-1;
                }
            }
        }

        return false;
     }

     static int[] arrSlice(int s,int e,int[] a){
        int[] ans = new int[e-s+1];
        int index = 0;
        for(int i = s;i<=e;i++){
            ans[index] = a[i];
            index++;
        }

        return ans;
     }
    public static void main(String[] args){
        int[] a = {1,1,12,12,3,13,3,2};
        Arrays.sort(a);
        int t = 8;



        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                HashSet<Integer> set1 = new HashSet<>();
                HashSet<Integer> set2 = new HashSet<>();
                int p = j+1;
                int q = a.length - 1;
                while(p<=q){
                    int c1 = t - (a[i] + a[j]);
                    //System.out.println(c1);
                    set1.add(a[p]);
                    set2.add(a[q]);
                    //System.out.println(set1);
                    //System.out.println(set2);
                    
                    if((a[p] + a[q]) > c1){
                        while(set2.contains(a[q])){
                            q--;
                        }
                    }else if((a[p] + a[q]) < c1){
                        while(set1.contains(a[p])){
                            p++;
                        }
                    }else{
                       System.out.println(a[i]+" "+a[j]+" "+a[p]+" "+a[q]);
                       System.exit(0);;
                    }

                    set1.add(p);
                    set2.add(q);
                }
            }
        }
        
        // //METHOD1 Brute Forece (three pointer + Binary Search)
        // for(int i = 0;i<a.length;i++){
        //     for(int j = i+1;j<a.length;j++){
        //         for(int k = j+1;k<a.length;k++){
        //             int check = t - (a[i] + a[j] + a[k]);
        //             int[] arr = arrSlice(k+1, a.length-1, a);
        //             if(BS(check,arr)){
        //                 System.out.println(a[i]+" "+a[j]+" "+a[k]+" "+check);
        //             }
        //         }
        //     }
        // }

        

        //METHOD2 (Two Pointer + Two Sum Logic),after sorting, so we can avoid repetations.


    }
}
