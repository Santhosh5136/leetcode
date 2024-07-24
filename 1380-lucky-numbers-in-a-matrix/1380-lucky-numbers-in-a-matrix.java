class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> lis=new ArrayList<>();
        for(int row[]:matrix)
        {
           int min=Integer.MAX_VALUE;
           int index=-1;
           for(int i=0;i<row.length;i++)
           {
             if(row[i]<min)
             {
                min=row[i];
                index=i;
             }
           }
           FunctionCol(index,min,matrix,lis); 
        }

        return lis;
    }

    public void FunctionCol(int index,int min,int matrix[][],List<Integer> lis)
    {
       boolean val=true;
       for(int i=0;i<matrix.length;i++)
       {
           if(matrix[i][index]>min)
             {
                val=false;
                break;
             }
       }

       if(val)
       {
         lis.add(min);
       }

    }
}