class Solution {
    public String makeSmallestPalindrome(String s) {
        char array[] = s.toCharArray();
        int n = array.length;
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            if (array[i] != array[j]) {
                if (array[i] < array[j]) {
                    array[j] = array[i];
                } else {
                    array[i] = array[j];
                }
            }
            i++;
            j--;
        }

        return new String(array);
    }
}
