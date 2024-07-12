class Solution {
    public String decodeMessage(String key, String message) {
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Character> map=new HashMap<>();
        int j=97;
        for(int i=0;i<key.length();i++)
        {
            char alpha=(char)j;
            if(key.charAt(i)==' '|| map.containsKey(key.charAt(i)))
            {
                continue;
            }
            else{
                  map.put(key.charAt(i),alpha);
                  j++;
            }
        }

        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            {
                ans.append(" ");
            }
            else{
                ans.append(map.get(message.charAt(i)));
            }
        }

        return ans.toString();
        
    }
}