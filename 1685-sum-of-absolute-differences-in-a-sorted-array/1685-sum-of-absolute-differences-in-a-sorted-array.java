class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int array[]=new int[nums.length];
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        leftsum[0]=0;
        rightsum[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            leftsum[i]=leftsum[i-1]+nums[i-1];

        }
        for(int i=nums.length-2;i>=0;i--)
        {
            rightsum[i]=nums[i]+rightsum[i+1];
        }

        for(int i=0;i<nums.length;i++)
        {
            int left=Math.abs(leftsum[i]-(i)*nums[i]);
            int right=Math.abs(rightsum[i]-(nums.length-i)*nums[i]);
            array[i]=right+left;

        }

        return array;
        
    }
}