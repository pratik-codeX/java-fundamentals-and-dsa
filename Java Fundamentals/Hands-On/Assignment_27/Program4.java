//Accept number from user and display below pattern.
/*
* # * #
* # * #
* # * #
*/


class Logic
{
     void Pattern(int iCol,int iRow)
    {
        while(iRow != 0)
        {
            int temp = 1;
            while(temp <= iCol)
            {
                if(temp % 2 == 0)
                {
                    System.out.print("#"+" ");
                }
                else
                {
                    System.out.print("*"+" ");
                }
                temp++;
            }
            System.out.println();
            iRow--;
        }
    }
}

public class Program4
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Pattern(4,3);
    }
}
