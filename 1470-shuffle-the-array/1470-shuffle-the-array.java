class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int i=0;
        for(int j=0;j<nums.length;j=j+2)
        {
           ans[j]=nums[i];
           ans[j+1]=nums[n+i];
           i++;
        }

        return ans;
        
    }
}