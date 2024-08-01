public class FirstNonRepeatingValueInAArray
{
    public static void main(String[] args){
        int[] arr = {2,2,3,1,3,5,1};//initializing the test case array





        //Solution ONE
        
        for(int i = 0;i<arr.length;i++)//loop to traverse through the array from the beginning to end
        {
            Boolean flag = true;
            for(int j = arr.length-1;j>=0;j--)//loop to check weather the value at i th position is present or not in the lopp
            {
                if(j != i)//We should check the i th value with the i th value itself
                {
                    if(arr[j] == arr[i])//comparing values,if a duplicate is found, we will make the flag false.
                {
                    //System.out.println("Element at the index "+i+" has a duplicate");
                    flag = false;
                    break;
                }
                }
                
            }
            if(flag == true)//if there is no duplicate, thats our answer. Print it and break the outer loop.
            {
                System.out.println(arr[i]);
                break;
            }
            //System.out.println(arr[i]);
        }





        //Solution TWO

        
    }
}