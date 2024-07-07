class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long pick=0;
        Arrays.sort(happiness);
       int i=happiness.length-1;
       int count=0;
        while(k>0)
        {
            int key=happiness[i]-count;
           if(key>=0)
           {
           pick+=key;
           }
           count++;
           k--;
           i--;
        }

        return pick;
        
    }
}