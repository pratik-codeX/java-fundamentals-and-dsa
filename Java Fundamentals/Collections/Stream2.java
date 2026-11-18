import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        //Suppose you want only numbers greater than 25.
        //Traditional approach:
        List<Integer> result = numbers.stream()
                .filter(n -> n > 25)
                .collect(Collectors.toList());
        
        System.out.println(result);
        
    }   
}
