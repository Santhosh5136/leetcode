class Solution {
    public int rob(int[] nums) {
        int dptable[]=new int[nums.length+1];
        Arrays.fill(dptable,-1);
        int ans=helper(nums.length-1,nums,dptable);
        return ans;
        
    }

    static int helper(int n,int nums[],int dptable[])
    {
        if(n<0)
        {
            return 0;
        }
        if(dptable[n]!=-1)
        {
            return dptable[n];
        }
        else{
        int pick=nums[n]+helper(n-2,nums,dptable);
        int notpick=0+helper(n-1,nums,dptable);
        dptable[n]=Math.max(pick,notpick);
        return dptable[n];
        }
    }
}