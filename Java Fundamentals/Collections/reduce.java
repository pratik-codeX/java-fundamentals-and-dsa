import java.util.Arrays;
import java.util.List;

class reduce
{
    public static void main(String[] args) 
    {
            List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        int sum = numbers.stream()
            .reduce(0, //identity Value
                (a, b) -> a + b //accumulator
        );

        System.out.println(sum);
    }    
}
