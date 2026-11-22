//Accept number from user and display below pattern.
/*

*/


class Logic
{
     void Pattern(int iCol,int iRow)
    {
        for(int i = 1;i <= iRow;i++)
        {
            for(int j = 1;j <= iCol;j++)
            {
                if(i == 1 || i == iRow || j == 1 || j == iCol )
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print(" @ ");
                }
            }
            System.out.println();
        }
    }
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Pattern(5,6);
    }
}
