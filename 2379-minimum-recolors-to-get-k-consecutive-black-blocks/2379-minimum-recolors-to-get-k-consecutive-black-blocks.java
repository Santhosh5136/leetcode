class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=(blocks.length()-k);i++)
        {
            int count=0;
           for(int j=i;j<k+i;j++)
           {  
               if(blocks.charAt(j)=='B')
               {
                  count++;
               }
           }
           count=k-count;
           if(count<min)
           {
              min=count;
           }
        }

        return min;
        
    }
}