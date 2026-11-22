import java.util.HashSet;
import  java.util.Set;

class Solution 
{
    public boolean containsDuplicate(int[] nums)
    {
        boolean flag = false;
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i < nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
            else
            {
                flag = true;
                return flag;
            }
        }

        //System.out.println(set);

        /* 
        boolean flag = false;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],0);
            }
            else
            {
                map.put(nums[i],1);
            }

            if(map.containsValue(1))
            {
                flag = true;
            }
        }   

        System.out.println(map);
        System.err.println(flag);*/

        return flag;
    }
}

class ContainsDuplicate217
{
    public static void main(String[] args) 
    {
        Solution s = new Solution();

        int arr[] = {1,2,3,1,1};

        boolean b = s.containsDuplicate(arr);
    }
}