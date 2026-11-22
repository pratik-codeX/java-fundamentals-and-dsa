//Accept number from user and display below pattern.
/*

 */

class Logic
{
    void Pattern(int iCol,int iRow)
    {   
        int i = 1;
        while(iRow != 0)
        {
            int j = 1;
            int temp = iCol;
            while(temp != 0)
            { 
                if(i >= j)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }
                j++;
                temp--;
            }
            System.out.println();
            iRow--;
            i++;
        }
    }
}

public class Program1
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        
        obj.Pattern(4,4);
    }
}
