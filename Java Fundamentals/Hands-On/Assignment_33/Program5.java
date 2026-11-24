/*
Accept division of student from user and depends on the division
display exam timing. There are 4 divisions in school as A,B,C,D. Exam
of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM.
(Application should be case insensitive)
*/

class Logic
{
    void DisplaySchedule(char ch)
    {
        if(ch == 'A')
        {
            System.out.println("Exam of division A at 7 AM");
        }   
        else if(ch == 'B')
        {
            System.out.println("Exam of division B at 8.30 PM");
        }   
        else if(ch == 'C')
        {
            System.out.println("Exam of division C at 9.20 AM");
        }   
        else if(ch == 'D')
        {
            System.out.println("Exam of division D at 10.30 AM");
        }
    }   
}

public class Program5
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();

        obj.DisplaySchedule('A');
    }
}