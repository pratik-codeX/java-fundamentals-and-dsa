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
            int i = 1;
            int i1 = -1;
            int temp = iCol;
             while(temp != 0)
            {
                if(iRow % 2 == 0)
                {
                    System.out.print(i1+"  ");
                    i1--;
                }
                else
                {
                    System.out.print(i+"   ");
                    i++;
                }
                temp--;
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

        obj.Pattern(5,5);
    }
}
