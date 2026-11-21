class Solution121 
{
    public static  int maxProfit(int[] prices) 
    {
        int nextStock = 0;
        int currStock = prices[0];
        int stockProfit = 0;
        int profit = 0;
        for(int i = 0;i < prices.length;i++)
        {
            if(currStock >= prices[i])
            {
                currStock = prices[i];
            }

            if(i+1 < prices.length)
            {
                nextStock = prices[i+1];
            }

            if(currStock < nextStock)
            {
                if(stockProfit < nextStock - currStock)
                {
                    stockProfit = nextStock - currStock;
                }
            }
        }
        System.out.println(stockProfit);
        return 0;
    }

    public static void main(String[] args)
    {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int iRet = maxProfit(prices);
    }
}
