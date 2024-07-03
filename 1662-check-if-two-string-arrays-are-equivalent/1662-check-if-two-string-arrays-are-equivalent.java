class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a=" ";
        for(String s:word1)
        {
            a=a+s;
        }
        String b=" ";
        for(String k:word2)
        {
            b=b+k;
        }

        return a.equals(b);
        
    }
}