class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        
        for(int j=0;j<details.length;j++)
        {
            String ans="";
        for(int i=11;i<details[j].length()-2;i++)
        {
            ans=ans+details[j].charAt(i);
        }
         
         int num=Integer.parseInt(ans);
         if(num>60)
         {
            count++;
         }

        }
        return count;
        
    }
}