import java.util.Scanner;

public class HalfPyramid
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        
        
        
        
        //Solution one
        
        /*for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                if(j<=i)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }*/
        
        
        
        //Solution Two
        
        
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
    }
}