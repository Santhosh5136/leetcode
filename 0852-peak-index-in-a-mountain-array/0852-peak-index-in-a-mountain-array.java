class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ans=Binarypeek(0,arr.length-1,arr);
        return ans;        
    }

    static int Binarypeek(int start,int end,int arr[])
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]<arr[mid+1])
        {
            return Binarypeek(mid+1,end,arr);
        }
        else if(start==end)
        {
            return start;
        }
        else{
            return Binarypeek(start,mid,arr);
        }
    }
}