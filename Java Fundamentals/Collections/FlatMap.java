/*
Visual difference
[[A, B], [C, D]]

map()
Stream<List>
Nested structure remains

flatMap()
[A, B, C, D]
Flattened into one stream
*/

import java.util.Arrays;
import java.util.List;

class FlatMap
{
    public static void main(String[] args)
    {
        List<List<String>> names = Arrays.asList(
                                                    Arrays.asList("Pratik", "Rahul"),
                                                    Arrays.asList("Amit", "Rohit")
                                                );  
                                                
        names.stream()
        .flatMap(list -> list.stream())
        .forEach(System.out::println);  
        
        
    }
}
