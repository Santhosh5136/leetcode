class Solution {
    public int minOperations(String[] logs) {
        int count=0;
        for(String word:logs)
        {
            if(word.equals("../") && count!=0)
            {
                count--;
            }
            else if(word.equals("./") || (word.equals("../") && count==0))
            {
                continue;
            }
            else
            {
                count++;
            }
        }

        return count;

        
    }
}