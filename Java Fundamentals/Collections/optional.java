/*
What is Optional in Java?

Interview-ready answer:
Optional is a container introduced in Java 8 that may or may not
contain a non-null value. It helps represent potentially missing 
values and encourages explicit handling instead of directly returning null.

Example:
*/

import java.util.Optional;

class optional
{
    public static void main(String[] args)
    {   
        Optional<String> name = Optional.ofNullable(null);

        System.out.println(name.orElse("Unknown"));
    }    
}

//Output:
//Unknown
