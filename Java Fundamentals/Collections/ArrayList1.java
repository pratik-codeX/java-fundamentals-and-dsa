import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) 
    {    
        ArrayList<Integer> arr = new ArrayList<Integer>();

        //Adding the element
        arr.add(11);
        arr.add(21);
        arr.add(51);
        arr.add(3,101);

       // arr.remove(0);

        //System.out.println(arr);
        
        @SuppressWarnings("unchecked")
        ArrayList<Integer> clonedArr = (ArrayList<Integer>) arr.clone();

        arr.remove(3);

        System.out.println(arr);

        System.out.println(clonedArr);

    }
}
