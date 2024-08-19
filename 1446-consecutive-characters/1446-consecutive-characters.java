class Solution {
    public int maxPower(String s) {
        int max=0;
        String str="";
        for(int i=0;i<s.length();i++)
        {
            if(str.length()==0 || str.charAt(str.length()-1)==s.charAt(i))
            {
                str=str+s.charAt(i);
            }
            else{
                max=Math.max(max,str.length());
                str="";
                str=str+s.charAt(i);
            }
        }
        return Math.max(str.length(),max);
    }
}