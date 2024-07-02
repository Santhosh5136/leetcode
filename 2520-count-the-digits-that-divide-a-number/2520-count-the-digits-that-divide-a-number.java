class Solution {
    public int countDigits(int num) {
        int key=num; 
        int count=0;
        while(num>0)
        {
            int remainder=num%10;
            if(key%remainder==0)
            {
                count++;
            }
            num=num/10;
        }

        return count;
        
    }
}