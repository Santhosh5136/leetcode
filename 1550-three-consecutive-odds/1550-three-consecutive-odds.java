class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=2;i<arr.length;i++)
        {
            int j=i-1;
            int k=i-2;
            if(arr[i]%2!=0 && arr[j]%2!=0 && arr[k]%2!=0)
            {
                return true;
            }
        }return false;
        
    }
}