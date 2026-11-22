//Accept number from user and display below pattern.
/*

*/


class Logic
{
     void Pattern(int iCol,int iRow)
    {
        int i = 1;
        while(i <= iRow)
        {

            int j = iCol;
            while(j != 0)
            {
                if(i == 1 || i == iRow || j == 1 || j == iCol)
                {
                    System.out.print("* ");
                }
                else if(i == j)                    
                {
                    System.out.print("* ");
                }
                else if(i > j)
                {
                    System.out.print("$ ");
                }
                else if(i < j)
                {
                    System.out.print("# ");
                }
                else
                {
                    System.out.print("  ");
                }
                j--;
            }
            System.out.println();
            i++;
        }   
    }
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Pattern(6,6);
    }
}
