class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int x=Math.min(a,b);
        for(int i=x;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                count++;
            }
        }

        return count;
        
    }
}