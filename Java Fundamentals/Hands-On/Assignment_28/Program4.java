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
        int cnt = 1;
        while(iRow != 0)
        {
            int temp = 1;
            while(temp <= iCol)
            {
               
                System.out.print(cnt);
                temp++;
                cnt++;
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
