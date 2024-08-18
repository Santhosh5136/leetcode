class Solution {
    public boolean isPerfectSquare(int num) {
        int val=num/2;
        while(val>0)
        {
            if(val*val==num)
            {
                return true;
            }

            val--;
        }

        return false;
        
    }
}