import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        //Suppose you want only numbers greater than 25.
        //Traditional approach:
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) 
        {
            if (n > 25) 
            {
                result.add(n);
            }
        }
        System.out.println(numbers);
        System.out.println(result);
    }   
}
