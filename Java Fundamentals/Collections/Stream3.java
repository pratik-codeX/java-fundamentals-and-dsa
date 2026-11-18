/*
Your first Streams assignment
Given:

List<Integer> numbers =
    Arrays.asList(5, 10, 15, 20, 25, 30, 35);


Write a Stream pipeline that:
1. Filters numbers greater than 15.
2. Multiplies each remaining number by 2.
3. Collects the result into a new List.
Expected output:
[40, 50, 60, 70]
*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Stream3 
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5,10,15,20,25,30,35);

        List<Integer> result = numbers.stream()
                        .filter(n -> n > 15)
                        .map(n -> n * 2)
                        .collect(Collectors.toList());         

        System.out.println(result);
    }    

}
