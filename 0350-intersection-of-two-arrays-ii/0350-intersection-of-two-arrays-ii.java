class Solution {
    public int[] intersect(int[] num1, int[] num2) {
      ArrayList<Integer> al=new ArrayList<>();
      HashMap<Integer,Integer> map=new HashMap<>();
      int arr[]=new int[al.size()];
      for(int i=0;i<num1.length;i++)
      {
        if(map.containsKey(num1[i]))
        {
            map.put(num1[i],map.get(num1[i])+1);
        }
        else
        {
            map.put(num1[i],1);
        }
      }

      for(int i=0;i<num2.length;i++)
      {
        if(map.containsKey(num2[i]) && map.get(num2[i])>0)
        {
            map.put(num2[i],map.get(num2[i])-1);
            al.add(num2[i]);
        }
        
      }
    arr=new int[al.size()];

    for(int i=0;i<al.size();i++)
    {
        arr[i]=al.get(i);
    }

    return arr;
}

}