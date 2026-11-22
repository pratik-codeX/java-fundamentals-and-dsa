//Accept number from user and display below pattern.
/*

*/

class Logic
{
    void Pattern(int iCol,int iRow)
    {   
        while(iRow != 0)
        {
            int temp = iCol;
            while(temp != 0)
            {
               
                if(iRow == temp)
                {
                    System.out.print("$ ");
                }
                else if(iRow > temp)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("# ");
                }
                temp--;
            }
            System.out.println();
            iRow--;
        }
    }
}

public class Program3
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Pattern(5,5);
    }
}
