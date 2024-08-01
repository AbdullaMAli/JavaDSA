import java.util.Scanner;

public class SolidRectangle{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        int row = inp.nextInt();
        int col = inp.nextInt();
        
        
        for(int i = 0;i<row; i++)
        {
            

            for(int j = 0;j<col;j++)
            {
                System.out.println("* ");
            }
            System.out.println();
        }
        
        //System.out.println("HAI");
    }
}