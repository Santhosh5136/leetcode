class Solution {
    public int search(int[] nums, int target) {

      return find(nums,target,0,nums.length-1);
        
    }
    public int find(int nums[],int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }

        int mid=start+(end-start)/2;

        if(nums[mid]==target)
        {
            return mid;
        }

        if(nums[start]<=nums[mid])
        {
            if(target>=nums[start] && target<=nums[mid])
            {
               return find(nums,target,start,end-1);
            }
            else{
               return find(nums,target,start+1,end);
            }
        }

        if(target>=nums[mid] && target<=nums[end])
        {
           return  find(nums,target,start+1,end);
        }

       return find(nums,target,start,end-1);
       
 }
}