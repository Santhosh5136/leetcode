class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
       int ans[]=new int[nums.length];
       for(int i=0;i<nums.length;i=i+2)
       {
        int j=i+1;
        ans[i]=nums[j];
        ans[j]=nums[i];
       }
      return ans;
        
    }
}