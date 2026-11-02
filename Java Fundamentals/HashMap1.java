import java.util.HashMap;

class HashMap1
{
    public static void main(String[] args) 
    {
        HashMap<String,Integer> hboj = new HashMap<>();    
        hboj.put("Pratik",1);
        System.out.println(hboj);
        System.out.println(hboj.get("Pratik"));

    }
}