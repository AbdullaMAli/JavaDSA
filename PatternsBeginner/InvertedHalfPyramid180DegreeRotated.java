import java.util.Scanner;

public class InvertedHalfPyramid180DegreeRotated
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        
        
        
        //First solution
        
        /*for(int i = 1;i<=n;i++)
        {
            
            for(int j = n;j>=1;j--)
            {
                
                if(j > i)
                {
                   
                    System.out.print(" ");
                }else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
        
        
        
        //Second solution
        
        for(int i = 1;i<=n;i++){
            //for spaces
            for(int j = 1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            
            //for StackTraceElement
            for(int k = 1 ;k<=i;k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}