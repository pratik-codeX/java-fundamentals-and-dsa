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
        int num = 1;
        while(iRow != 0)
        {
            int temp = iCol;
            while(temp != 0)
            {
                System.out.print(" "+num+" ");
                temp--;
            }
            System.out.println();
            iRow--;
            num++;
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