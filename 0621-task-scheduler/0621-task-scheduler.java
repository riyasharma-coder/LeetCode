class Solution {
    public int leastInterval(char[] tasks, int n) {

        int len = tasks.length;

        int[] freq = new int[26];

        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        int maxFreq = 0;
        Arrays.sort(freq);
        maxFreq = freq[25];

        int gap = maxFreq -1;
        int slot =  gap * n;

        for (int i = 24; i>=0 ; i--) {
            slot = slot - Math.min(freq[i], gap);

        }

        return slot > 0 ? slot + len : len; 
    }
}