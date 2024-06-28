class Solution {
 
     public void solve(int open,int  close,List<String>ans,String s)
      {
    if(open ==0 && close==0)
    {
        ans.add(s);
        return;
    }
    if(open>0)
    {
        solve(open-1,close,ans,s+"(");
    }
    if(close>0 && open<close)
    {
        solve(open,close-1,ans,s+")");
    }
   }



    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int open=n;
        int close=n;
        solve(open,close,ans,"");
        return ans;

        
    }
}