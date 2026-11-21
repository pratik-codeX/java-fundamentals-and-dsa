//Accept number from user and display below pattern.
/*

*/

class Logic
{
     void Pattern(int iCol,int iRow)
    {
        
        while(iRow != 0)
        {
            char c = 'a';
            int i = 1;
            int temp = iCol;
            while(temp != 0)
            {
                if(iRow % 2 == 0)
                {
                    System.out.print(i);
                    i++;
                }
                else
                {
                    System.out.print(c);
                    c++;
                }
                temp--;
            }
            c++;
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
