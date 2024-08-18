class Solution {
    public int[] searchRange(int[] nums, int target) {
        int array[] = new int[2];
        array[0] = firstOccurrence(0, nums.length - 1, target, nums);
        array[1] = lastOccurrence(0, nums.length - 1, target, nums);
        return array;
    }

    static int firstOccurrence(int start, int end, int target, int nums[]) {
        int idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                idx = mid;
                end = mid - 1; // Move left to find the first occurrence
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return idx;
    }

    static int lastOccurrence(int start, int end, int target, int nums[]) {
        int idx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                idx = mid;
                start = mid + 1; // Move right to find the last occurrence
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return idx;
    }
}
