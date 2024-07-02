class Solution {
    private boolean isprime(int num)
        {
            if(num<=1) return false;
            if(num==2)return true;
            if(num%2==0) return false;
            for(int i=3;i<num/2;i=i+2)
            {
                if(num%i==0)
                {
                    return false;

                }
            }return true;
        }
    public int maximumPrimeDifference(int[] nums) {
        int minidx=-1;
        int maxidx=-1;
       
       for(int i=0;i<nums.length;i++)
       {
        if(isprime(nums[i]))
        {
            minidx=i;
            break;
        }
       }

       for(int i=nums.length-1;i>=0;i--)
       {
        if(isprime(nums[i]))
        {
            maxidx=i;
            break;
        }

       }

       if(minidx==-1 || maxidx==-1)
       {
        return 0;
       }


       return maxidx-minidx;

    }
}




 