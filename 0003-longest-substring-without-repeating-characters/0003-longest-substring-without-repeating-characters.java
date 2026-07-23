class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0) return 0;

        HashSet<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int ans = 0;
        int max = Integer.MIN_VALUE;

        while(j<n){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            ans = j-i+1;
            max = Math.max(max, ans);
            j++;
        }
        return max;
    }
}