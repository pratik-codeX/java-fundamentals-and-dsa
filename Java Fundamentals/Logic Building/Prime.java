/*class Prime
{
    public static boolean chkPrime(int no)
    {
        boolean isPrime = true;

        for(int i = 2; i <= no/2; i++)
        {
            if(no % i == 0)
            {
                System.out.println(no);
               return isPrime = false;
            }
        }

        return isPrime;

    }
    public static void main(String A[])
    {
        if(chkPrime(6))
        {
            System.out.println("Its Prime Number ");
        }
        else
        {
            System.out.println("Its not Prime Number");
        }
    }
}*/

class Prime {

    public static boolean chkPrime(int no) {

        if (no <= 1) {
            return false;
        }

        for (int i = 2; i <= no / i; i++) {

            if (no % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int no = 0;

        if (chkPrime(no)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}