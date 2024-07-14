class Solution {
    public int climbStairs(int n) {
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
       int ans=Stairs(n,dp);
       return ans;       
    }

    private int Stairs(int n,int dp[])
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        else{
            dp[n]=Stairs(n-1,dp)+Stairs(n-2,dp);
            return dp[n];
        }
        
    }
}