import java.util.Scanner;

public class ZeroOneTriangle
{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        int n = inp.nextInt();
        
        int num = 0;
        
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                //If i = even and j = even print 0. If i = even and j = odd print 1
                if(i%2 == 0)
                {
                    if(j%2 == 0)
                    {
                        System.out.print(0+" ");
                    }else{
                        System.out.print(1+" ");
                    }
                    
                    //if i = odd and j = even print 1. If i = odd and j = odd print 0
                }else{
                    if(j%2 == 0)
                    {
                        System.out.print(1+" ");
                    }else{
                        System.out.print(0+" ");
                    }
                }
            }
            System.out.println();//Giving new line after each line.
        }
    }
}