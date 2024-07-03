class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        int i=0;
       while(num>0)
       {
        int remainder=num%10;
        arr[i]=remainder;
        num=num/10;
        i++;
       }
       Arrays.sort(arr);
       // 2  2 3 9
       return (arr[0]*10+arr[3])+(arr[1]*10+arr[2]);
    }
}