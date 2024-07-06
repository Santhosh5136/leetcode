class Solution {
    public int minimizedStringLength(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), 1);
        }

        return map.size();

    }
}