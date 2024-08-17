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
	   
	   
	   HashMap <Character,Integer> map = new HashMap<>();//Creating hash map for tracking the repition of characters by storing char-index pair
	   
	   int l = 0;//shringking left pointer
	   int r = 0;//expanding right pointer
	   int maxLength = 0;//var to store ans
	   
	   while(r< s.length()){//loop can only run till 'r' reaches the end
	       if(map.containsKey(s.charAt(r))  && map.get(s.charAt(r)) > l){//if the current char is already seen before(it should be in the map and index should be greater than l),
			//we should update the l value to the prev repited char index + 1
	           l = map.get(s.charAt(r)) + 1;
	           //map.put(s.charAt(r),r);
	           
	       }
	           map.put(s.charAt(r),r);//else or should then put the new char in the map with its index value
	           maxLength = Max(maxLength,r-l+1);//comparing the max length with current length(r-l+1)
	           r++;//incrementing r.
	       
	   }
	    
        System.out.println(maxLength);//displaying the result.
	}
}