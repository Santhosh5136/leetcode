class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String a:operations)
        {
            if(a.equals("--X") || a.equals("X--"))
            {
                X=X-1;
            }
            if(a.equals("X++")|| a.equals("++X"))
            {
                X=X+1;
            }
        }

        return X;
        
    }
}