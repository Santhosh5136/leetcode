class Solution {
    public int maximum69Number(int num) {
        String s = Integer.toString(num);
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6') {
                str.append(9);
                str.append(s.substring(i + 1, s.length()));
                break;
            } else {
                str.append(s.charAt(i));
            }
        }

        String k = str.toString();
        return Integer.parseInt(k);

    }
}