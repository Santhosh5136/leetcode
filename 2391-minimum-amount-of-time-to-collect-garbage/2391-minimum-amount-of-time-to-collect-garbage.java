class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int total=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('G',0);
        map.put('M',0);
        map.put('P',0);
        for(String s:garbage)
        {
            for(int i=0;i<s.length();i++)
            {
                if(map.containsKey(s.charAt(i)))
                {
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
            }
        }

          total+= Solve('G',map.get('G'),garbage,travel);
          total+=Solve('P',map.get('P'),garbage,travel);
          total+=Solve('M',map.get('M'),garbage,travel);

          return total;

        
    }

    private int Solve(char k,int val,String[]garbage,int []travel)
    {
        int lastindex=-1;
        int sol=0;
        for(int i=0;i<garbage.length;i++)
        {
            if(garbage[i].indexOf(k) !=-1)
            {
                lastindex=i;
            }
        }

        for(int i=0;i<=lastindex;i++)
        {
            for(int j=0;j<garbage[i].length();j++)
            {
                if(garbage[i].charAt(j) == k)
                {
                    sol=sol+1;
                }
            }
            if(i<lastindex)
            {
                sol=sol+travel[i];
            }
        }

        return sol;
        
    }
}