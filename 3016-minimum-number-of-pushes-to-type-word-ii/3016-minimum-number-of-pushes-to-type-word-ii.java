class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
            if(map.containsKey(word.charAt(i)))
            {
            map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
            else
            {
                map.put(word.charAt(i),1);
            }
        }

        List<Integer> lis=new ArrayList<>(map.values());
        int ans=0;
        Collections.sort(lis,Collections.reverseOrder());
        for(int i=0;i<lis.size();i++)
        {
            if(i<8)
            {
                ans=ans+lis.get(i);
            }
            else if(i>=8 && i<16)
            {
                ans=ans+lis.get(i)*2;

            }
            else if(i>=16 && i<24)
            {
                ans=ans+lis.get(i)*3;
            }
            else
            {
                ans=ans+lis.get(i)*4;
            }

        }

        return ans;
    }
}