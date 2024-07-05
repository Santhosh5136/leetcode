class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        int total = 0;
        if (x > y) {
            total += Solve(s, 'a', 'b', x, st);
            s = rebuildString(st);
            st.clear();
            total += Solve(s, 'b', 'a', y, st);

        } else {
            total += Solve(s, 'b', 'a', y, st);
            s = rebuildString(st);
            st.clear();
            total += Solve(s, 'a', 'b', x, st);
        }
        return total;

    }

    private int Solve(String s, char start, char end, int Value, Stack<Character> st) {
        int gain = 0;
        for (char k : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == start && k == end) {
                 gain += Value;
                 st.pop();
            } else {
               st.push(k);
            }
        }
        return gain;

    }

    private String rebuildString(Stack<Character>st)
    {
        StringBuilder kl=new StringBuilder();
        while(!st.isEmpty())
        {
            kl.append(st.pop());
        }

        return kl.reverse().toString();
    }
}