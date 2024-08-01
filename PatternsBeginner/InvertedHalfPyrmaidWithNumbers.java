import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers
{
	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    
	    int n = inp.nextInt();
	    
	    
	    
	    //Solution One
	    
	    
	    
	   // for(int i = n;i>=1;i--)
	   // {
	   //     for(int j = 1;j<=i;j++)
	   //     {
	   //         System.out.print(j);
	   //     }
	   //     System.out.println();
	   // }
	   
	   
	   //Solution Two
	   
	   
	   for(int i = 1;i<=n;i++)
	   {
	       for(int j = 1;j<=n-i+1;j++)
	       {
	           System.out.print(j);
	       }
	       System.out.println();
	   }
		
	}
}