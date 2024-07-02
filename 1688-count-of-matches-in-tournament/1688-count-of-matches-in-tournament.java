class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        while(n>1)
        {
            int odd=0;
            int even=0;
           if(n%2!=0)
           {
             odd=((n-1)/2);
             matches=matches+odd;
             odd=odd+1;
           }
           else
           {
            even=n/2;
            matches=matches+even;
           }

           n=odd+even;
        }




    return matches;
    }
}