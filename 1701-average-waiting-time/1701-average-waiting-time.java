class Solution {
    public double averageWaitingTime(int[][] customers) {
       int totaltime= customers[0][0]+customers[0][1];
       double Difference=Math.abs(totaltime-customers[0][0]);
        for(int i=1;i<customers.length;i++)
        {
            if(customers[i][0]<totaltime)
            {
                totaltime+=customers[i][1];
                Difference+=Math.abs(totaltime-customers[i][0]);
            }
            else
            {
                totaltime=customers[i][0]+customers[i][1];
                Difference+=Math.abs(totaltime-customers[i][0]);
            }

        }
  
        double averagetime=Difference/customers.length;
        return averagetime;
        
    }
}