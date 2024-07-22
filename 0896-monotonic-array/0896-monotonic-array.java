class Solution {
    public boolean isMonotonic(int[] nums) {
        int x=nums[0];
        int y=nums[nums.length-1];
       if(x>y)
       {
          boolean ans=Decresing(nums);
          return ans;
       }
       else{
          boolean ans=Incresing(nums);
          return ans;
       }
        
    }

    public static boolean Decresing(int nums[])
    {
        boolean ans=true;
        for(int i=1;i<nums.length;i++)
        {
            int pre=i-1;
            if(nums[i]>nums[pre])
            {
                ans=false;
                break;
            }
        }
        return ans;
    } 
    
    public static boolean Incresing(int nums[])
    {
        boolean ans=true;
        for(int i=1;i<nums.length;i++)
        {
            int pre=i-1;
            if(nums[i]<nums[i-1])
            {
                ans=false;
                break;
            }
        }
        return ans;
    }

}