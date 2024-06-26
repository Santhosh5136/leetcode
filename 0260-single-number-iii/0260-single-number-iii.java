class Solution {
    public int[] singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            ans=ans^nums[i];
        }
        int a=1;
        int count=0;
        while((ans&1)!=1)
        {
            count++;
            ans=ans>>1;
        }
        int second_num=0;
        int first_num=0;
        for(int num:nums)
        {
            if(((num >> count)&1)==1)
            {
                first_num^=num;
            } else
            {
                second_num^=num;
            }
        }

        return new int[]{first_num,second_num};
    }
}