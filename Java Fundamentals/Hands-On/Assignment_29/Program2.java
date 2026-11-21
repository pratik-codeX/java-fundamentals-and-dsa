//Accept number from user and display below pattern.
/*

*/

class Logic
{
     void Pattern(int iCol,int iRow)
    {
        
        while(iRow != 0)
        {
            int r = 1;
            int r1 = 2;
            int temp = 1;
            while(temp <= iCol)
            {
                if(iRow % 2 == 0)
                {
                    System.out.print(r1);
                    r1= r1 + 2;
                }
                else
                {
                    System.out.print(r);
                    r=r+2;
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
