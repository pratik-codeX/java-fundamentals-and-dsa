//Accept number from user and display below pattern.
/*

*/

class Logic
{
     void Pattern(int iCol,int iRow)
    {
        while(iRow != 0)
        {
            char c = 'A';
            char ch = 'a';
            int temp = 1;
            while(temp <= iCol)
            {
                if(iRow % 2 == 0)
                {
                    System.out.print(c++);
                }
                else
                {
                    System.out.print(ch++);
                }
                //System.out.print(" "+temp+" ");
                temp++;
            }
            System.out.println();
            iRow--;
        }
    }
}

public class Program2
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.Pattern(4,4);
    }
}
