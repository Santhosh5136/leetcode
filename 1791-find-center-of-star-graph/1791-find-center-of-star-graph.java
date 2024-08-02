class Solution {
    public int findCenter(int[][] edges) {
      int a=edges[0][0];
      int b=edges[0][1];
      for(int edge[]:edges)
      {
          if( edge[0]!=a && edge[1]!=a)
          {
            a=0;
                
          }
          if( edge[0]!=b && edge[1]!=b)
          {
             b=0;
          }
      }
      return a+b;
        
    }
}