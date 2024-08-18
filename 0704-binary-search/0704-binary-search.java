class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int ans=BinarySearch(start,end,target,nums);
        return ans;     
    }

    static int BinarySearch(int start,int end,int target,int[] nums)
    {
        if(start > end)
        {
            return -1;
        }
        
        int mid=start+(end-start)/2;

        if(nums[mid]==target)
        {
            return mid;
        }
        
        if(target<nums[mid])
        {
            return BinarySearch(start,mid-1,target,nums);
        }

        return BinarySearch(mid+1,end,target,nums);
    }
}