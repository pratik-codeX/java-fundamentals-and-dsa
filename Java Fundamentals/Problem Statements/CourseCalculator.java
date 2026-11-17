/*
Problem: Course Fee Calculator

Imagine EduTrack has three courses:

Course	Fees
Java	₹15,000
Python	₹12,000
React	₹10,000

A student selects a course. We need to calculate the final fee after applying a discount.

Input
- Course fee = ₹15,000
- Discount = 10%

Output
₹13,500
Final course fee

*/

class CourseCalculator
{
    public static boolean isValidFee(double fee)
    {
        if(fee < 0)
        {
            System.out.println("Enter Valid Amount");
            return false;
        }
        else
        {
            return true;
        }
    }

    public static boolean isValidDiscount(double discount)
    {
        return discount >= 0 && discount <= 100;
    }

    public static double calculateFinalFee(
                                        double courseFee,
                                        double discountPercentage
                                    )   
        {
            double discountAmt = 0.0;
           if(isValidFee(courseFee) && isValidDiscount(discountPercentage))
            {
                discountAmt = courseFee * discountPercentage / 100;
            }
            else
            {
                System.out.println("Enter Valid Amount or Discount");
                return -1;
            }

            return courseFee - discountAmt;
        }
    public static void main(String A[])
    {
        double iRet = calculateFinalFee(-12000, 105);

        System.out.println(iRet);
    }
}