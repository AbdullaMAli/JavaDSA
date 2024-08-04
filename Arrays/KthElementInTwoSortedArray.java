import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int i=0, j=0, curr_k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                curr_k++;
                if(k==curr_k) return arr1[i];
                i++;
            } else {
                curr_k++;
                if(k==curr_k) return arr2[j];
                j++;
            }
        }
        while (i < n) {
            curr_k++;
            if (k == curr_k)
                return arr1[i];
            i++;
        }
        while (j < m) {
            curr_k++;
            if (k == curr_k)
                return arr2[j];
            j++;
        }
        return -1;
    }
}

class KthElementInTwoSortedArray {
	  public static void main(String[] args) throws IOException	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0) {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k)); 
        }
	  }
}