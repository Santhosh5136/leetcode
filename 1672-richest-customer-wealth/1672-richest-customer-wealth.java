class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=Integer.MIN_VALUE;
        for(int num[]:accounts)
        {
            int amount=0;
            for(int i=0;i<num.length;i++)
            {
                amount=amount+num[i];
            }

            if(amount>wealth)
            {
                wealth =amount;
            }
        }

        return wealth;
        
    }
}