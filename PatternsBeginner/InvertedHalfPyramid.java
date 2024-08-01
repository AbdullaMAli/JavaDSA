import java.util.Scanner;

public class InvertedHalfPyramid
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        
        for(int i = n;i>0;i--)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}