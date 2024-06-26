class Solution {
    public int largestCombination(int[] arr) {
        int [] bin=new int[32];
        for(int num:arr)
        {
            for(int i=0;i<bin.length;i++)
            {
                int temp=num&(1<<i);
                if(temp!=0)
                {
                    bin[i]++;
                }
            }
        }
        int max=0;

        for(int ans:bin)
        {
            if(max<ans)
            {
                max=ans;
            }
        }

        return max;

    }
}