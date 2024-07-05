class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s : operations) {
            if (!st.isEmpty() && s.equals("C")) {
                st.pop();
            }
            else if (!st.isEmpty() && s.equals("D")) {
                int k = st.peek() * 2;
                st.push(k);
            }
            else if (st.size() >= 2 && s.equals("+")) {
                int top1 = st.pop();
                int top2=st.peek();
                int sum=top1 +top2;
                st.push(top1);
                st.push(sum);
            } else {
                int val=Integer.valueOf(s);
                st.push(val);
            }
        }
        int num = 0;
        while (!st.isEmpty()) {
            num += st.pop();
        }

        return num;

    }
}