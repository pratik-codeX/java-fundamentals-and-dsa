//.Accept number from user and display below pattern.
/*
Input :8
Output :
1111
2222
3333
4444
*/

class Logic
{
    void Pattern(int iCol,int iRow)
    {
        for(int i = 1;i <= iRow;i++)
        {
            int num = i;
            for(int j = 1;j <= iCol;j++)
            {   
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Pattern(4,4);
    }
}