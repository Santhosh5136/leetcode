class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer>lis=new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++)
        {
            int pre=i-1;
            int next=i+1;
            if(mountain[i]>mountain[pre] && mountain[i]>mountain[next])
            {
                lis.add(i);
            }
        }

        return lis;
        
    }
}