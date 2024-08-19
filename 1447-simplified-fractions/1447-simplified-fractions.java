class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> lis=new ArrayList<>();
        for(int i=n;i>1;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                if(gcd(j,i))
                {
                    String str=Integer.toString(j);
                    String str2="/";
                    str2=str2+Integer.toString(i);
                    str=str+str2;
                    lis.add(str);
                }
            }
        }

        return lis;
        
    }
    static boolean gcd(int small,int big)
    {
        boolean val=true;

            if(big%small==0 && small !=1)
            {
                return false;
            }

        return true;
        

    }
}