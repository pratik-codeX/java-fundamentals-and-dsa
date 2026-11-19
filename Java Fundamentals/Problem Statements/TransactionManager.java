/*
Create a HashSet<String> that stores transaction IDs.

Requirements:
1. Add "UPI101".
2. Add "CARD102".
3. Add "UPI103".
4. Try adding "UPI101" again.
5. Print the set size.
6. Check whether "CARD102" exists.
7. Remove "UPI103".

Expected result:
Size: 3
Adding duplicate UPI101: false
Contains CARD102: true
Final size: 2

*/

import java.util.HashSet;

public class TransactionManager {
    public static void main(String[] args) {

        HashSet<String> transactionIds = new HashSet<>();

        // Complete the assignment here
        transactionIds.add("UPI101");
        transactionIds.add("CARD102");
        transactionIds.add("UPI103");
        System.out.println(transactionIds.add("UPI101"));

        if(transactionIds.contains("CARD102"))
        {
            System.out.println("Exists");
        }
        else{
            System.out.println("Not Exists");
        }

        transactionIds.remove("UPI103");

        System.out.println(transactionIds.size());
        System.out.println(transactionIds);
    }
}