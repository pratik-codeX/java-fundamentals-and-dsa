class Logic {
    void DisplayASCII() 
    {
        // Print table header
        System.out.printf("%-12s %-10s %-14s %-10s%n", "Symbol", "Decimal", "Hexadecimal", "Octal");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i <= 255; i++) 
        {
            String symbol;

            // Handle non-printable control characters so the table stays aligned
            if (i < 32 || i == 127) 
            {
                symbol = "[CTRL]";
            } 
            else 
            {
                symbol = Character.toString((char) i);
            }

            String hex = String.format("0x%02X", i);
            String octal = Integer.toOctalString(i);

            System.out.printf("%-12s %-10d %-14s %-10s%n", symbol, i, hex, octal);
        }
    }
}

public class Program1 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.DisplayASCII();
    }
}
