class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        int[] freq = new int[26];
        int maxfreq = 1;
        int count = 0;
        int j=0;
        for(int i=0; i<n; i++){
            freq[s.charAt(i)-'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(i)-'A']);

            int len = i-j+1;
            if(len - maxfreq<=k){
                count = len;
            }else{
                freq[s.charAt(j)-'A']--;
                j++;
            }
        }
        return count;
    }
}