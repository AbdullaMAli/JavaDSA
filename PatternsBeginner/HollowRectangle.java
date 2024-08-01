import java.util.Scanner;

public class HollowRectangle{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        int row = inp.nextInt();
        int col = inp.nextInt();
        
        
        
        
        
        //Solution One
        
        /*for (int i = 1;i<=row;i++)
        {
            for (int j = 1;j<=col;j++)
            {
                if(i == 1 || i == row)  //condition for printing first and last line
                {
                    System.out.print("*");
                }
                else
                {
                    if(j == 1 || j == col)  //condition for printing other n-2 lines
                    {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();*/
            
            
            
            
            
            
            //Solution Two
            
            for(int i = 1;i<=row;i++)
            {
                for(int j = 1;j<=col;j++)
                {
                    if(i == 1 || i == row || j == 1 || j == col) // condition for positions with star
                    {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                
                System.out.println();
        }
        
    }
}