class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        int count = 0;
        int start = 1;
        if (meetings[0][0] > start) {
            count += meetings[0][0] - start;
        }
        if (meetings[meetings.length - 1][1] < days) {
            count += days - meetings[meetings.length - 1][1];
        }
        for (int i = 1; i < meetings.length; i++) {
            int gap = meetings[i][0] - meetings[i - 1][1] - 1;
            count += Math.max(0, gap);
        }
        return count;
    }
}

