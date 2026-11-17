//Remove the duplicate elemtents of ArrayList

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Problem1 {
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr = new ArrayList<>();    

        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(10);

        System.out.println("Arr is : "+arr);

        Iterator i = arr.iterator();

        ArrayList<Integer> arr3 = new ArrayList<>();

        while(i.hasNext())
        {
            Integer element = (Integer)i.next();
            if(!arr3.contains(element))
            {
                arr3.add(element);
            }
        }

        System.out.println("New ArrayList : "+arr3);

        LinkedHashSet<Integer> l = new LinkedHashSet<>(arr);

        System.out.println("LinkedHashSet : "+l);

        ArrayList<Integer> arr1 = new ArrayList<>(l);

        System.out.println("After LinkedHashSet to Array : "+arr1);
    }   
}
