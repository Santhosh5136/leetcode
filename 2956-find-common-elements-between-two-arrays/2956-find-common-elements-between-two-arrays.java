class Solution {
    public int[] findIntersectionValues(int[] num1, int[] num2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        putElement(num1, num1.length,map);
        int ans2=ContainsElement(num2,num2.length,map);
        map.clear();
        putElement(num2,num2.length,map);
        int ans1=ContainsElement(num1,num1.length,map);
        
        return new int[]{ans1,ans2};
        
    }

    private void putElement(int arr[],int size,Map<Integer,Integer>map)
    {
        for(int i=0;i<size;i++)
        {
            map.put(arr[i],1);
        }
    }
    private int ContainsElement(int arr[],int size,Map<Integer,Integer>map)
    {
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(map.containsKey(arr[i]))
            {
                count++;
            }
        }
        return count;
    }

}