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
            int temp = iCol;
            while(temp != 0)
            {
                System.out.print(i);
                temp--;
                if(i == 9)
                {
                    i = 0;
                }
                i++;
            }
            System.out.println();
            iRow--;
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
