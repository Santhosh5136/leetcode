class Solution {
    public int lengthOfLastWord(String s) {
        String[] word=s.split(" ");
        String k=word[word.length-1];
        return k.length();
        
    }
}