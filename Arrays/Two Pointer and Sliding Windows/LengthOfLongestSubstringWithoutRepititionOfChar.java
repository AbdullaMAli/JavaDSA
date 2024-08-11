import java.util.*;

public class LengthOfLongestSubstringWithoutRepititionOfChar
{
    static int Max(int n,int m){
        if(n>=m){
            return n;
        }else{
            return m;
        }
    }
	public static void main(String[] args) {
	    String s = "cadbzabcd";
	    
	   //Method 1 would be to find all the substrings and check weather it has a repeating character using a arr of size[0-255].
	   
	   
	   //Method 2: Two Pointer and Sliding Window
	   
	   
	   HashMap <Character,Integer> map = new HashMap<>();
	   
	   int l = 0;
	   int r = 0;
	   int maxLength = 0;
	   
	   while(r< s.length()){
	       if(map.containsKey(s.charAt(r))  && map.get(s.charAt(r)) > l){
	           l = map.get(s.charAt(r)) + 1;
	           //map.put(s.charAt(r),r);
	           
	       }
	           map.put(s.charAt(r),r);
	           maxLength = Max(maxLength,r-l+1);
	           r++;
	       
	   }
	    
        System.out.println(maxLength);
	}
}